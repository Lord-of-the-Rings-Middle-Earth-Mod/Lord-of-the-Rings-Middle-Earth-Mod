# Contributing

Before contributing please read the [Code of Conduct](CODE_OF_CONDUCT.md) and make sure you understand it.
It is also advised to join our [discord](https://discord.com/invite/cQSpXR6bjz), as this is our main communication platform.

Many of the following information is compacted to the most essential information, for a more indepth view with background information check out our [Project Wiki](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/wiki).

| Table of Contents                                                  |
|:-------------------------------------------------------------------|
| [Branching and Issues](#branching-and-issues)                      |
| [Bug Reports and Suggestions](#bug-reports-and-suggestions)        |
| [Translations](#translations)                                      |
| [Textures, Models and Animations](#textures-models-and-animations) |
| [Testing](#testing) |
| [Code](#code)                                                      |

---

## Branching and Issues

### Branching
We use a branching model based on [GitFlow](https://nvie.com/posts/a-successful-git-branching-model/).
In most cases you will only come into contact with feature branches, which are branches created from the develop branch.
When you are done with your work, you create a Pull Request to merge your feature branch into the develop branch.
Maintainers and Contributors will check Pull Requests regularly and give feedback on them or merge them.
For a more in-depth guide on our branching model, check out the [wiki](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/wiki/Workflow-Documentation#branching).

### Issues
We use GitHub Issues to track bugs, features and other tasks, all Issues can be seen with their current status on our [Issue Board](https://github.com/orgs/Lord-of-the-Rings-Middle-Earth-Mod/projects/2)
When working on an Issue please keep the following in mind:
- Always assign yourself to the issue so everyone can see someone is actually working on it.
- Always keep the Issue in the appropriate column of the Issue Board, so everyone can see what the status is. (see below for column descriptions)
- Always create a branch from the Issue. The branch should be named as follows and have develop as base branch:
  - `feature/issueNumber-issueName` for features
  - `bugfix/issueNumber-issueName` for bugfixes.
  - `translation/issueNumber-issueName` for translations.
  - `texture-model/issueNumber-issueName` for textures and models.
  - `animation/issueNumber-issueName` for animations.
- Always create a Pull Request from the branch to the develop branch. The Pull Request should be named `IssueNumber - IssueName` and will be reviewed by a maintainer or Contributor.
- Always link the Issue in the Pull Request and the Pull Request in the Issue.

| Column/Status | Description |
| --- | --- |
| Backlog | Issues that are not yet assigned to a milestone/release and have lower priority, Maintainers will move these issues into *To Do* once they have priority. Usually those issues are listed as planned features in the Roadmap. |
| To Do | Issues that are assigned to a milestone/release but not yet worked on. |
| In Progress | Issues that are currently being worked on |
| Review | Issues that are done and have a Pull Request waiting on being reviewed by a maintainer |
| Testing | Issues that are already merged into dev and are waiting on testing (mainly animations and code) |
| Done | Issues that are all tested and only wait on the release. |
| Closed | Issues that are released. Issues are moved here by Maintainers when a release is completed. |

---

## Bug Reports and Suggestions
When reporting bugs and suggesting things please use discord if possible. Our discord is our main form of communication and especially suggestions reach many more people then just Github discussions. 
The Github options are just a backup option for those without discord. 

### Bug Reports
When you wish to report a bug, you can do so either in our [bug-report channel](https://discord.com/channels/1237739289689985138/1286200697045520405) on our discord, or using the [bug-report issue template]() here on GitHub.
Please provide as much and as detailed information as you can.

For further information on how to report a bug check out https://www.chiark.greenend.org.uk/~sgtatham/bugs.html

If you want to know more about the workflow behind a bug-report, you can check out the [wiki](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/wiki/Workflow-Documentation#bug-report).
### Suggestions
Suggestions can be submitted either on our [discord](https://discord.com/channels/1237739289689985138/1283840850144792616) or via a [GitHub Discussion](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/discussions/categories/ideas-and-suggestions).

Before posting a suggestion, please make sure it isn´t already planned on our [Roadmap](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/blob/master/ROADMAP.md) or has already been posted to [discord](https://discord.com/channels/1237739289689985138/1283840850144792616) or [GitHub](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/discussions/categories/ideas-and-suggestions).

Please give as much context alongside your suggestion as you can and describe it as detailed as possible. That will allow us to understand your idea better without having to ask everything from you first. If you are suggesting something with textures, please provide an example if possible.

For more information on how to properly make a suggestion check out https://nohello.net/en/ and https://xyproblem.info/
You can get more information on the full suggestion workflow on the [wiki](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/wiki/Workflow-Documentation#suggestion).

---

## Translations
If you are looking to help with translations, you can see a list of all translation files and their status [here]().
If you are missing a language in general for the mod, feel free to translate it and submit it.
Translations may be submitted on discord or on GitHub.

When submitting on Discord follow these steps:
1. Create a post on discord in the forums channel [Contributions](https://discord.com/channels/1237739289689985138/1283839182602768414)
2. Post the translation file in the post
3. Maintainers will upload the translation file to GitHub and close the forums post.

When submitting on GitHub follow these steps:
1. Create an Issue using the appropriate [template]().
2. Create a branch from the Issue to upload the translation file to.
3. Open a Pull Request, maintainers will check it and than merge and close the Pull Request.

---

## Textures, Models and Animations
If you are looking to help with textures, models or animations, you can see a list of needed textures, models and animations [here]().
If you think you could make a texture, model or animation better than the current one, we are happy to see your submission, but do not guarantee it will be used.
If you think there is a texture, model or animation missing and not listed, feel free to create it and submit it.
Textures, models and animations may be submitted on discord or on GitHub.

When submitting on Discord follow these steps: 
1. Create a post on discord in the forums channel [Contributions](https://discord.com/channels/1237739289689985138/1283839182602768414)
2. Post the texture, model or animation in the post
3. Maintainers will upload the texture, model or animation to GitHub and close the forums post.

When submitting on GitHub follow these steps:
1. Create an Issue using the appropriate template. For Textures and Models [this]() for Animations [this]().
2. Create a branch from the Issue to upload the texture, model or animation to.
3. Open a Pull Request, maintainers will check it and than merge and close the Pull Request.

We have some Guidelines for textures please follow them.

---

## Testing
If you wish to help with testing the mod we ask you to follow the following steps to ensure the mod we release is stable and playable. 

1. Chose an issue from the *Testing* column of the [Issue Tracker](https://github.com/orgs/Lord-of-the-Rings-Middle-Earth-Mod/projects/2/views/1). Maintainers will attach a compiled and compacted mod version you should use for testing. 
2. If testing a bug, follow the recreation steps in an attempt to recreate the bug, otherwise try to test the new addition as good as you can. The developer should have left a documentation on his developer test if you don't know how to test the addition. 
3. Check for all *Acceptance Criteria* being matched and note all unexpected behaviours you notice. 

---

## Code
If you are looking to help code the mod, you can find all features and code changes we have planned on the issue board.   
If you are new to coding a mod, open source projects or java in general look for issues tagged with *good first issue*, those issues are good to get started in the project.   
If you think there is some feature or code that could be improved please make a suggestion and don't just change it, Maintainers will get back to you regarding the suggestion and if needed, will create an issue for the implementation.

### Workflow
When contributing code follow the following Workflows steps to ensure the integrity of the branching model and issue tracker. 

1. Pick an Issue from the *To Do* Column of the [Issue Tracker](https://github.com/orgs/Lord-of-the-Rings-Middle-Earth-Mod/projects/2/views/1)
2. Move the Issue to *In Progress* and assign yourself as Assignee
3. Create a branch from the issue following the conventions mentioned in [Issues](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/blob/task/setting-up-the-open-source-project/CONTRIBUTING.md#issues)
4. Work on the issue until you finished, you are finished, if all acceptance criteria (ACs) are met. *Test what you have implemented in a [developers test]() to ensure it also works as intended.*
5. Open a Pull Request from the branch to the develop branch. The Pull Request should be named `IssueNumber - IssueName` and will be reviewed by a maintainer.
6. Link the Pull Request to the Issue and move the Issue into *In Review*
7. The Pull Request will be checked by maintainers and
   * Merged and closed if no changes are requested
   * Reopened, aka moved back into *In Progress* with you as Assignee, should changes be requested. The Reviewers will comment what they think is missing/needs change within the issue.

If the Pull Requests was approved and merged by Maintainers, Testers will test the addition to the code with a compiled and compacted mod. Should they notice a mistake the issue will be reopened and moved into *To Do* again. We would prefer to have you fix the found issue, but understand it is not always possible. 

What is to be considered are the following points:
- Proper Commenting
  - JavaDoc at every Class describing shortly what the class is used for
    - Exceptions are the Main Classes: LordOfTheRingsMiddleEarthMod, LordOfTheRingsMiddleEarthModClient, LordOfTheRingsMiddleEarthModDataGenerator
  - JavaDoc at every Method describing shortly what the method is used for, as well as listing parameters and output
    - Exceptions are Constructors, Getter, Setter, ToString, Equals and Hash Methods
- Sun Coding Convention for Java is to be used

### Releases
Releases are planned and released by maintainers only.
During each release following actions are to be taken:
- The version is increased following [Semantic Versioning](https://semver.org/).
- The changelog is checked for sufficiency. Any additions and changes noticeable to players and server owners need to be listed.
- The release-branch is merged into the master-branch and a release is created on GitHub with a matching tag.
- The changelog of the release is published on [discord](https://discord.com/channels/1237739289689985138/1241277621766197268) following the format provided and using discohook.
- The milestone of the release is closed and the actions properly documented in the release Issue, which is than also closed.
