# Contributing
Before contributing please read the [Code of Conduct](CODE_OF_CONDUCT.md) and make sure you understand it.
It is also advised to join our [discord](https://discord.com/invite/cQSpXR6bjz), as this is our main communication platform.
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
## Translations
If you are looking to help with translations, you can see a list of outdated translation files [here]().
Translations may be submitted on discord or on GitHub.
When submitting on Discord follow these steps:
1. Create a post on discord in the forums channel [Contributions]()
2. Post the translation file in the post
3. Maintainers will upload the translation file to GitHub and close the forums post.

When submitting on GitHub follow these steps:
1. Create an Issue using the appropriate [template]().
2. Create a branch from the Issue to upload the translation file to.
3. Open a Pull Request, maintainers will check it and than merge and close the Pull Request.
## Textures, Models and Animations
If you are looking to help with textures, models or animations, you can see a list of outdated textures, models and animations [here]().
Textures, models and animations may be submitted on discord or on GitHub.
When submitting on Discord follow these steps: 
1. Create a post on discord in the forums channel [Contributions]()
2. Post the texture, model or animation in the post
3. Maintainers will upload the texture, model or animation to GitHub and close the forums post.

When submitting on GitHub follow these steps:
1. Create an Issue using the appropriate [template]().
2. Create a branch from the Issue to upload the texture, model or animation to.
3. Open a Pull Request, maintainers will check it and than merge and close the Pull Request.

We have some Guidelines for textures please follow them.
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