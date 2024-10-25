# Lord of the Rings Middle Earth Mod
The *Lord of the Rings Middle Earth Mod* (*LotR ME Mod* in short) is a Fabric Minecraft Mod, with the goal of bringing the world of J.R.R. Tolkiens Books into Minecraft, with a focus on the third age. 
This Mod is an open Source Project and as such welcoming anyone who is wishing to help. 

Before you interact with the community please read our [Community Standards and Rules](CODE_OF_CONDUCT.md) and make sure you understand them.

## What if I have questions or need help?
If you have any questions, the best way to get them answered is to join our [discord](https://discord.com/invite/cQSpXR6bjz) where we have a channel dedicated for questions and one for technical support.
You can also contact any maintainer on discord.
Should you not have a discord account and do not want to create one, you can also contact Anedhel/Moritz directly (<moritz_rohleder+lotrmod@outlook.de>),
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

Depending on how you wish to contribute following skills are adviced:
- Basic Java Knowledge (code) 
- Basic knowledge on how to mod with fabric (code) 
- Basic Blockbench knowledge (models, textures and animations)

Should you lack a skill you'd like to learn we will happily help you learn it, just contact us on discord. 

For further information on how to Contribute please check out the [Contributing](CONTRIBUTING.md) file.

## Maintainers and Contributors
The *LotR ME Mod* has the following Maintainers:
- Anedhel/Moritz (Lead Maintainer)
- Ano_Jedt (Maintainer)

And you can find a list of Contributors [here](CONTRIBUTORS.md).

## Roadmap
**ToDo:**
- Add a rough roadmap where just the "topics" of the releases are listed

The full and more detailed Roadmap can be found [here](ROADMAP.md).
