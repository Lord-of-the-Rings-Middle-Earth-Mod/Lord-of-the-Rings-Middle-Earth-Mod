# Lord of the Rings Middle Earth Mod
Lord of the Rings Middle Earth Mod is a Minecraft Fabric mod targeting version 1.20.1, inspired by Mevans' work. The mod creates a comprehensive Middle Earth experience with custom dimensions, biomes, factions, and world generation.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Prerequisites and Environment Setup
- **Java 17 Required**: This project requires Java 17. Verify with `java -version`.
- **Gradle**: Uses Gradle 8.7 with wrapper (gradlew). Make gradlew executable with `chmod +x ./gradlew`.
- **CRITICAL NETWORK LIMITATION**: The build requires access to `maven.fabricmc.net` for the Fabric Loom plugin. In restricted network environments, builds will fail with "Plugin [id: 'fabric-loom', version: '1.6-SNAPSHOT'] was not found".

### Build Process
- **Bootstrap and build the repository**:
  - `chmod +x ./gradlew` -- Make gradlew executable if needed
  - `./gradlew clean build` -- NEVER CANCEL: Takes 3-5 minutes when network access is available. Set timeout to 10+ minutes.
- **CRITICAL**: If build fails with "could not resolve plugin artifact 'fabric-loom'", this indicates network restrictions preventing access to Fabric Maven repository. Document this limitation rather than repeatedly trying different versions.

### Available Gradle Tasks
When network access is available:
- `./gradlew build` -- Build the mod JAR file
- `./gradlew clean` -- Clean build artifacts
- `./gradlew publishToMavenLocal` -- Publish to local Maven repository
- `./gradlew runClient` -- Launch Minecraft client with the mod for testing
- `./gradlew runServer` -- Launch Minecraft server with the mod for testing
- `./gradlew genSources` -- Generate Minecraft source files

### Testing and Validation
- **Manual Testing**: Always run `./gradlew runClient` after making changes to test the mod in Minecraft
- **VALIDATION SCENARIOS**: 
  - Launch Minecraft client and verify mod loads without crashes
  - Check that log shows "The Lord of the Rings Mod starts to initialise." and "The Lord of the Rings Mod is loaded."
  - Verify creative tabs are present (LotR Blocks, LotR Food, etc.)
- **Build Artifacts**: Built mod JAR appears in `build/libs/lotr-middle-earth-{version}.jar`
- **No Unit Tests**: This project currently has no unit test infrastructure

### Running the Mod
- **Development Client**: `./gradlew runClient` -- NEVER CANCEL: Takes 2-3 minutes to launch. Set timeout to 5+ minutes.
- **Development Server**: `./gradlew runServer` -- For server-side testing
- **Production**: Use built JAR from `build/libs/` in Minecraft 1.20.1 with Fabric Loader 0.15.11+ and Fabric API 0.92.1+

## Repository Structure and Navigation

### Key Source Files
- **Main Mod Class**: `src/main/java/me/anedhel/lotrmiddleearth/LordOfTheRingsMiddleEarthMod.java`
- **Client Entry**: `src/main/java/me/anedhel/lotrmiddleearth/LordOfTheRingsMiddleEarthModClient.java`
- **Data Generation**: `src/main/java/me/anedhel/lotrmiddleearth/LordOfTheRingsMiddleEarthModDataGenerator.java`
- **Mixin Example**: `src/main/java/me/anedhel/lotrmiddleearth/mixin/ExampleMixin.java`

### Configuration Files
- **Mod Metadata**: `src/main/resources/fabric.mod.json` -- Core mod configuration
- **Mixin Config**: `src/main/resources/lotr-middle-earth.mixins.json` -- Mixin definitions
- **Build Config**: `build.gradle` -- Project build configuration
- **Gradle Properties**: `gradle.properties` -- Minecraft/Fabric versions

### Language and Localization
- **Primary Language**: `src/main/resources/assets/lotr/lang/en_us.json`
- **Translated Languages**: Separate directories (de/, fr/, es-ES/, it/, nl/, no/, en-GB/, qya-AA/) each containing `src/main/resources/assets/lotr/lang/{locale}.json`
- **Crowdin Integration**: `crowdin.yml` configures automatic translation management

### GitHub Actions and CI/CD
- **Release Build**: `.github/workflows/build-an-upload-release.yml` -- Builds and uploads JARs on release
- **Test Build**: `.github/workflows/build-test-jar.yml` -- Creates test builds on develop branch pushes
- **Build Requirements**: Both workflows use Ubuntu, Java 17 (Temurin), and expect successful `./gradlew build`

## Development Workflow

### Making Changes
- Always work from fresh clone or pull latest changes
- Edit Java files in `src/main/java/me/anedhel/lotrmiddleearth/`
- Add new language keys to `src/main/resources/assets/lotr/lang/en_us.json`
- Test changes with `./gradlew runClient`

### Adding New Features
- Follow existing package structure: `me.anedhel.lotrmiddleearth`
- Use Fabric API patterns and annotations
- Add mixins to `mixin/` package and register in `lotr-middle-earth.mixins.json`
- Update `fabric.mod.json` if adding new entry points

### Localization Workflow  
- Base language files are in main `src/main/resources/assets/lotr/lang/en_us.json`
- Translated versions maintained in separate language directories
- Crowdin integration automatically syncs translations
- Always add new keys to base en_us.json first

## Common Tasks and Outputs

### Repository Root Structure
```
.
├── .github/workflows/           # CI/CD pipelines
├── build.gradle                 # Main build configuration
├── gradle.properties           # Version definitions
├── gradlew                     # Gradle wrapper script
├── settings.gradle             # Gradle settings
├── src/main/                   # Primary source code
│   ├── java/me/anedhel/lotrmiddleearth/  # Java source
│   └── resources/              # Assets and configs
├── ROADMAP.md                  # Feature planning document
├── crowdin.yml                 # Translation configuration
└── [de,fr,es-ES,it,nl,no,en-GB,qya-AA]/ # Translation directories
```

### Key File Contents
- **Mod ID**: "lotr" (defined in LordOfTheRingsMiddleEarthMod.java)
- **Minecraft Version**: 1.20.1
- **Fabric Loader**: 0.15.11+
- **Java Version**: 17
- **Main Package**: me.anedhel.lotrmiddleearth

### Build Time Expectations
- **Initial Build**: 3-5 minutes (downloads dependencies)
- **Subsequent Builds**: 1-2 minutes
- **Client Launch**: 2-3 minutes to fully load
- **NEVER CANCEL**: Always wait for completion, builds may appear to hang during dependency resolution

### Troubleshooting
- **Build Fails**: Check network access to maven.fabricmc.net
- **Java Issues**: Verify Java 17 is installed and JAVA_HOME is set
- **Permission Denied**: Run `chmod +x ./gradlew`
- **Mixin Errors**: Check mixin configuration in lotr-middle-earth.mixins.json matches actual class names