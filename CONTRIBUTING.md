# Contributing

Before contributing please read the [Code of Conduct](CODE_OF_CONDUCT.md) and make sure you understand it.
It is also advised to join our [discord](https://discord.com/invite/cQSpXR6bjz), as this is our main communication platform.

| Table of Contents                                                  |
|:-------------------------------------------------------------------|
| [Branching and Issues](#branching-and-issues)                      |
| [Bug Reports and Suggestions](#bug-reports-and-suggestions)        |
| [Translations](#translations)                                      |
| [Textures, Models and Animations](#textures-models-and-animations) |
| [Code](#code)                                                      |

---

## Branching and Issues

### Branching
We use a branching model based on [GitFlow](https://nvie.com/posts/a-successful-git-branching-model/).
In most cases you will only come into contact with feature branches, which are branches created from the develop branch.
When you are done with your work, you create a Pull Request to merge your feature branch into the develop branch.
Maintainers will check Pull Requests regularly and give feedback on them or merge them.

### Issues
We use GitHub Issues to track bugs, features and other tasks, all Issues can be seen with their current status on our [Issue Board](https://github.com/orgs/Lord-of-the-Rings-Middle-Earth-Mod/projects/2)
When working on an Issue, always keep it in the appropriate column of the Issue Board, so everyone can see what the status is.
| Column/Status | Description |
| --- | --- |
| Backlog | Issues that are not yet assigned to a milestone/release and have lower priority |
| To Do | Issues that are assigned to a milestone/release but not yet worked on |
| In Progress | Issues that are currently being worked on |
| Review | Issues that are done and have a Pull Request waiting on being reviewed by a maintainer |
| Testing | Issues that are already merged into dev and are waiting on testing (mainly animations and code) |
| Done | Issues that are all tested and only wait on the release. |
| Closed | Issues that are released |

---

## Bug Reports and Suggestions

### Bug Reports
If you have a bug to report, please do so using our discord.
Should you not have discord you can use our Issue Template for Bug Reports.
Please provide as much Information as you can for bug reports, this helps us fix the bugs.

### Suggestions
If you have a suggestion, please share it on our discord in the suggestion channel.
Please describe your suggestion as detailed as possible when sharing it.
If you don´t have discord, you can create a GitHub Discussion to share a suggestion.

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

## Code



### Coding Guidelines
*Coding Guidelines still need to be written down, but they will be looked for during Pull Requests and you will get Feedback there.*

What is to be considered are the following points:
- Proper Commenting
  - JavaDoc at every Class describing shortly what the class is used for
    - Exceptions are the Main Classes: LordOfTheRingsMiddleEarthMod, LordOfTheRingsMiddleEarthModClient, LordOfTheRingsMiddleEarthModDataGenerator
  - JavaDoc at every Method describing shortly what the method is used for, as well as listing parameters and output 
    - Exceptions are Constructors, Getter, Setter, ToString, Equals and Hash Methods
- Versioning is done using SemanticVersioning as described [here](https://semver.org/).
- Releases are done by maintainers only
- Every Change needs a Pull-Request(PR), only maintainers can approve PRs
- Sun Coding Convention for Java is to be used
- Every Issue has a branch
- Any feature noticeable for the players should be listed in the changelog before creating a pull request
- Before a release, the changelog should always be up-to-date
