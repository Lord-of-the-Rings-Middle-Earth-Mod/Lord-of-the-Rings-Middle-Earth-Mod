# Lord of the Rings Middle Earth Mod
The *Lord of the Rings Middle Earth Mod* (*LotR ME Mod* in short) is a Fabric Minecraft Mod, with the goal of bringing the world of J.R.R. Tolkiens Books into Minecraft, with a focus on the third age. 
This Mod is an open Source Project and as such welcoming anyone who is wishing to help. 

Before you interact with the community please read our [Community Standards and Rules](CODE_OF_CONDUCT.md) and make sure you understand them.

## What if I have questions or need help?
If you have any questions, the best way to get them answered is to join our [discord](https://discord.com/invite/cQSpXR6bjz) where we have a channel dedicated for questions and one for technical support.
You can also contact any maintainer on discord.
Should you not have a discord account and do not want to create one, you can also contact [Anedhel/Moritz](mailto:moritz_rohleder+lotrmod@outlook.de) directly,
however it might not get you a response within short time.

## How to get startet
If you want to play the Mod on a server, you need to have it installed on your PC and the Server needs to have the Mod installed as well.
You can always download all version of the Mod on our [GitHub](https://github.com/Lord-of-the-Rings-Middle-Earth-Mod/Lord-of-the-Rings-Middle-Earth-Mod/releases).
The latest is marked as latest version.

### How to install the Mod on your PC
In order to install the Mod on your PC you need to have fabric installed.
If you don´t have fabric installed you can download it [here](https://fabricmc.net/use/installer/) and follow these steps:
1. Start the fabric launcher
2. Select the Minecraft Version you want to install fabric for and click install
3. Start the Minecraft Launcher, select the fabric profile and start the game
4. Close the game and navigate to the `.minecraft` folder
5. In the `.minecraft` folder you will find a `mods` folder, place the downloaded Mod and the [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) in the folder.
6. Start the game again and the Mod should be installed

If you got fabric already installed or followed the fabric [installation guide](https://docs.fabricmc.net/players/installing-fabric) following steps 4-6 should be enough.
The above steps are for the standard Minecraft Launcher, if you use a different launcher, fabric has instructions for those [here](https://fabricmc.net/use/installer/).

### How to install the Mod on a Server
In order to run the Mod on a Server, the server needs to be a fabric server. You can download the fabric server jar [here](https://fabricmc.net/use/server/).
After you have downloaded the server jar you can follow the following steps to install a local server on your PC with the mod:
1. Create a new folder and place the server jar in it
2. Start the server jar with the following command: `java -Xmx2G -jar fabric-server-mc.1.20.2-loader.0.16.7-launcher.1.0.1.jar nogui`
3. The server will create some files and folders than shut down again.
4. Open the `eula.txt` file and change `eula=false` to `eula=true`
5. Place the mod and the [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) in the `mods` folder
6. Start the server again with the same command as before
7. The server should start, and you can connect to it with your Minecraft Client, to stop the server type `stop` in the console

The above steps are only for a local server, if you use a server host, you need to follow their instructions on how to install fabric mods.

## How to contribute
Should you wish to contribute within your possibilities there is more than just coding we are always happy for help with:
- Coding the Mod
- Creating models, textures and models 
- Translations 
- Testing
- Bug Reports

Depending on how you wish to contribute following skills are advised:
- Basic Java Knowledge (code) 
- Basic knowledge on how to mod with fabric (code) 
- Basic Blockbench knowledge (models, textures and animations)
- Knowledge of the English language (translations)

Should you lack a skill you'd like to learn we will happily help you learn it, just contact us on discord. 

For further information on how to Contribute please check out the [Contributing](CONTRIBUTING.md) file.

## Roles within the Project
Within the Project we define several roles with different responsibilities and perks:
- Contributors: Contributors are those people, who regularly contribute to the Mod and show a high level of activity. They are able to do Code-Reviews and get a vote in the decision making process.
- Maintainers: Maintainers are responsible for the Release Management and the overall direction of the Mod. They plan and execute the Releases as well as bugfixes and suggestions.
- Lead-Maintainers: The Lead-Maintainers are responsible for the Mod in general and have the final say in all decisions.

Apart from the above roles, Moderators are responsible for making sure the Community Standards and Rules are followed and the Community is a friendly place for everyone.

### Moderators
The *LotR ME Mod* has the following Moderators:

#### How to become a Moderator
When we are looking for new Moderators we will announce it on our discord and ask for applications.
Within those applications we are looking for the following:
- Motivation and experience
- Understanding of Community philosophy and goals
- Behavior in the Community
- Activity within the Community, especially in the chats

### Contributors
A list of all Contributors can be found [here](CONTRIBUTORS.md).
Contributors are able to perform Code-Reviews and are also involved in the decision-making process to a certain extent.
Contributors can be active in all areas of the Mod where we look for [contributions](#how-to-contribute), and are not limited to code contributions.

#### How to become a Contributor
Contributors are not chosen by application, but by activity and contribution.
When the Maintainers notice a high level of activity and contribution from a user, they will contact said user in order to start the acceptance process.
In order to be accepted as Contributor maintainers will check the following:
- Commit frequency and Quality
- Behavior in the Community
- Understanding of Community philosophy and goals
- Motivation and experience
- Understanding of the Processes

In order to check the above points the maintainers will get in contact with the user and ask some questions.

If all criteria are met to our satisfaction, the user will be granted triage access of the Contributor Role for 3 months. 
After the 3 months of triage access, the Maintainers will make a final decision based on the performance during the triage period.

### Maintainers
The *LotR ME Mod* has the following Maintainers:
- Ano_Jedt

Maintainers are chosen from the Contributors by the Lead-Maintainers.
The selection is based on the performance of the Contributor and the need for Maintainers.
In order to become a maintainer a unanimously vote of all Lead-Maintainers is needed.

### Lead-Maintainers
The *LotR ME Mod* has the following Lead-Maintainers:
- Anedhel/Moritz (Lead Maintainer)


## Roadmap
Roadmap is a rough plan of all planned releases. It is not set in stone and can change at any time.
- Release 1.0.0 (To be announced): The first release that is intended for server play.

The full and more detailed Roadmap, including planned features and ideas, can be found [here](ROADMAP.md).