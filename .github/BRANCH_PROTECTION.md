# Branch Protection Configuration

To ensure that pull requests cannot be merged until the DataGen workflow completes successfully, the following branch protection rules should be configured for the main branch:

## Required Status Checks

Add the following status check to the branch protection rules:
- `DataGen` (workflow name from `.github/workflows/datagen.yml`)

## Configuration Steps

1. Go to Settings → Branches in the GitHub repository
2. Add a branch protection rule for `main` (or your default branch)
3. Enable "Require status checks to pass before merging"
4. Search for and select the "DataGen" status check
5. Enable "Require branches to be up to date before merging"

This ensures that:
- The DataGen workflow must complete successfully before any PR can be merged
- The PR branch must be up-to-date with the base branch
- Generated files are always synchronized with the latest DataGen code

## Alternative: Repository Settings

If you prefer to use GitHub CLI or API, you can configure this programmatically:

```bash
gh api repos/:owner/:repo/branches/main/protection \
  --method PUT \
  --field required_status_checks='{"strict":true,"contexts":["DataGen"]}' \
  --field enforce_admins=true \
  --field required_pull_request_reviews='{"required_approving_review_count":1}' \
  --field restrictions=null
```