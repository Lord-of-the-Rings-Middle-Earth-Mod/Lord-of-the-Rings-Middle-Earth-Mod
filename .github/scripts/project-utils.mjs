/**
 * Returns an array of issue numbers linked to a PR via closing keywords.
 */
export async function getLinkedIssueNumbers({ github, context, prNumber }) {
  const query = `
    query($owner: String!, $repo: String!, $prNumber: Int!) {
      repository(owner: $owner, name: $repo) {
        pullRequest(number: $prNumber) {
          closingIssuesReferences(first: 25) {
            nodes {
              number
            }
          }
        }
      }
    }
  `;

  const result = await github.graphql(query, {
    owner: context.repo.owner,
    repo: context.repo.repo,
    prNumber,
  });

  const nodes =
    result?.repository?.pullRequest?.closingIssuesReferences?.nodes ?? [];
  return nodes.map((n) => n.number);
}

/**
 * Returns the Projects V2 item node ID for a given issue on the specified project board,
 * or null if not found.
 */
export async function getProjectItemId({ github, context, issueNumber, projectId }) {
  const query = `
    query($owner: String!, $repo: String!, $issueNumber: Int!) {
      repository(owner: $owner, name: $repo) {
        issue(number: $issueNumber) {
          projectItems(first: 20) {
            nodes {
              id
              project {
                id
              }
            }
          }
        }
      }
    }
  `;

  const result = await github.graphql(query, {
    owner: context.repo.owner,
    repo: context.repo.repo,
    issueNumber,
  });

  const nodes = result?.repository?.issue?.projectItems?.nodes ?? [];
  const item = nodes.find((n) => n.project.id === projectId);
  return item?.id ?? null;
}

/**
 * Executes the updateProjectV2ItemFieldValue mutation to update the Status field.
 */
export async function setProjectItemStatus({
  github,
  projectId,
  itemId,
  statusFieldId,
  targetStatusId,
  targetStatusName,
}) {
  const mutation = `
    mutation($projectId: ID!, $itemId: ID!, $fieldId: ID!, $value: ProjectV2FieldValue!) {
      updateProjectV2ItemFieldValue(
        input: {
          projectId: $projectId
          itemId: $itemId
          fieldId: $fieldId
          value: $value
        }
      ) {
        projectV2Item {
          id
        }
      }
    }
  `;

  await github.graphql(mutation, {
    projectId,
    itemId,
    fieldId: statusFieldId,
    value: { singleSelectOptionId: targetStatusId },
  });

  console.log(
    `Set status of item ${itemId} to "${targetStatusName}" (${targetStatusId})`
  );
}

/**
 * Convenience wrapper: moves all issues linked to a PR to the given status.
 */
export async function moveLinkedIssuesToStatus({
  github,
  context,
  core,
  prNumber,
  projectId,
  statusFieldId,
  targetStatusId,
  targetStatusName,
}) {
  const issueNumbers = await getLinkedIssueNumbers({ github, context, prNumber });

  if (issueNumbers.length === 0) {
    core.info(`No linked issues found for PR #${prNumber} — skipping.`);
    return;
  }

  for (const issueNumber of issueNumbers) {
    core.info(`Processing issue #${issueNumber}…`);

    const itemId = await getProjectItemId({
      github,
      context,
      issueNumber,
      projectId,
    });

    if (!itemId) {
      core.warning(
        `Issue #${issueNumber} is not on project board ${projectId} — skipping.`
      );
      continue;
    }

    await setProjectItemStatus({
      github,
      projectId,
      itemId,
      statusFieldId,
      targetStatusId,
      targetStatusName,
    });

    core.info(
      `Issue #${issueNumber} → "${targetStatusName}"`
    );
  }
}
