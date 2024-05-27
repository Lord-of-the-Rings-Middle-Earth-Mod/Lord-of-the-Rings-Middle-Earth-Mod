# Contributing
Before contributing please read the [Code of Conduct](CODE_OF_CONDUCT.md) and make sure you understand it.

## How to file a bug report
Bug Reports can be filed on our discord at the dedicated channel.
Alternatively you can file a Bug Report using the proper issue template for that.

## How to suggest features
To suggest a feature you can either use our suggestion channels on our discord (link is in the [README File](README.md)),
or start a discussion on GitHub in the proper category.

## How to set up the environment
*A detailed walkthrough how to set up the environment will follow but for now I´d advise to look this [tutorial](https://youtu.be/0Pr_iHlVKsI?si=qNeruHugsvn6y2bc).*

## What Contributions are looked for?
When it comes to contributions, any kind of contribution whether small or big is welcome and appreciated.
If you wish to contribute, please look through the issues listed for something that interests you.
We prefer to get issues for the next planned Milestone done first, but that is not a must.

If you are new to the project or open source in general, 
look for issues with the tag *Good first issue* those are small and meant for newcomers.

## Coding Guidelines
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