# Lord of the Rings Middle Earth Mod
Lord of the Rings Middle Earth Mod is a Minecraft Fabric mod targeting version 1.20.2, inspired by Mevans' work. The mod creates a comprehensive Middle Earth experience with custom dimensions, biomes, factions, and world generation.

**IMPORTANT**: The primary development branch is `develop`, not `master`. Always work from and target the `develop` branch for active development.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Prerequisites and Environment Setup
- **Java 17 Required**: This project requires Java 17. Verify with `java -version`.
- **Gradle**: Uses Gradle 8.7 with wrapper (gradlew). Make gradlew executable with `chmod +x ./gradlew`.
- **CRITICAL NETWORK LIMITATION**: The build requires access to `maven.fabricmc.net` for the Fabric Loom plugin. In restricted network environments, builds will fail with "Plugin [id: 'fabric-loom', version: '1.6-SNAPSHOT'] was not found".
- **Additional Dependencies**: The develop branch includes Terraform Wood API and CustomPortalAPI dependencies with specific Maven repositories.

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
- `./gradlew runDatagen` -- Generate data files (recipes, loot tables, etc.)

**Note**: The develop branch includes extensive auto-generated content in `src/main/generated/` from data generation.

### Testing and Validation
- **CRITICAL WORKFLOW**: After making any changes, ALWAYS follow this sequence:
  1. Run `./gradlew runDatagen` to regenerate all data files (recipes, loot tables, language files)
  2. Validate all JSON files with `find . -name "*.json" -exec python3 -m json.tool {} \; >/dev/null`
  3. Only then run `./gradlew runClient` to test the mod in Minecraft
- **Manual Testing**: Launch Minecraft client and verify mod loads without crashes
- **VALIDATION SCENARIOS**: 
  - Check that log shows "The Lord of the Rings Mod starts to initialise." and "The Lord of the Rings Mod is loaded."
  - Verify creative tabs are present with substantial content (LotR Blocks, LotR Food, etc.)
  - Test block placement, item crafting, and world generation features
- **Build Artifacts**: Built mod JAR appears in `build/libs/lotr-middle-earth-{version}.jar`
- **Data Generation**: Run `./gradlew runDatagen` to regenerate assets and data files
- **No Unit Tests**: This project currently has no unit test infrastructure

### Code Quality Checks (Available without build)
- **JSON Validation**: Validate all JSON files with `python3 -m json.tool path/to/file.json`
- **Java Syntax**: Basic syntax validation available, though dependencies will be missing
- **Key Files to Always Check**:
  - `src/main/resources/fabric.mod.json` -- Must be valid JSON with correct mod metadata
  - `src/main/resources/lotr-middle-earth.mixins.json` -- Must match actual mixin class names  
  - Language files in `assets/lotr/lang/` -- Must be valid JSON with consistent keys

### Running the Mod
- **Development Client**: `./gradlew runClient` -- NEVER CANCEL: Takes 2-3 minutes to launch. Set timeout to 5+ minutes.
- **Development Server**: `./gradlew runServer` -- For server-side testing
- **Production**: Use built JAR from `build/libs/` in Minecraft 1.20.2 with Fabric Loader 0.15.11+ and Fabric API 0.91.6+

## Repository Structure and Navigation

### Key Source Files
- **Main Mod Class**: `src/main/java/me/anedhel/lotr/LordOfTheRingsMiddleEarthMod.java`
- **Client Entry**: `src/main/java/me/anedhel/lotr/LordOfTheRingsMiddleEarthModClient.java`
- **Data Generation**: `src/main/java/me/anedhel/lotr/LordOfTheRingsMiddleEarthModDataGenerator.java`
- **Core Packages**: `block/`, `datagen/`, `entity/`, `item/`, `mixin/`, `world/` under `src/main/java/me/anedhel/lotr/`
- **Mixin Example**: `src/main/java/me/anedhel/lotr/mixin/ExampleMixin.java`

### Configuration Files
- **Mod Metadata**: `src/main/resources/fabric.mod.json` -- Core mod configuration
- **Mixin Config**: `src/main/resources/lotr-middle-earth.mixins.json` -- Mixin definitions
- **Build Config**: `build.gradle` -- Project build configuration
- **Gradle Properties**: `gradle.properties` -- Minecraft/Fabric versions

### Language and Localization
- **Primary Language**: `src/main/resources/assets/lotr/lang/en_us.json` - **IMPORTANT**: This file is DATA-GENERATED by `./gradlew runDatagen`. DO NOT edit manually!
- **Translated Languages**: Separate directories (de/, fr/, es-ES/, it/, nl/, no/, en-GB/, qya-AA/) each containing `src/main/resources/assets/lotr/lang/{locale}.json`
- **Crowdin Integration**: `crowdin.yml` configures automatic translation management
- **Language Key Management**: Language keys are automatically generated from code annotations and data generation. The wiki information about manual key addition is outdated.

### GitHub Actions and CI/CD
- **Release Build**: `.github/workflows/build-an-upload-release.yml` -- Builds and uploads JARs on release
- **Test Build**: `.github/workflows/build-test-jar.yml` -- Creates test builds on develop branch pushes
- **Build Requirements**: Both workflows use Ubuntu, Java 17 (Temurin), and expect successful `./gradlew build`

## Development Workflow

### Making Changes
- Always work from fresh clone or pull latest changes from the `develop` branch
- Edit Java files in `src/main/java/me/anedhel/lotr/`
- **NEVER manually edit** `src/main/resources/assets/lotr/lang/en_us.json` - this file is data-generated
- **ALWAYS update CHANGELOG.md** in the "0.1.0 (Next Release)" section when making changes
- Run data generation with `./gradlew runDatagen` after code changes
- Test changes with `./gradlew runClient`

### Adding New Features
- Follow existing package structure: `me.anedhel.lotr`
- Use Fabric API patterns and annotations
- Add mixins to `mixin/` package and register in `lotr-middle-earth.mixins.json`
- Update `fabric.mod.json` if adding new entry points
- Consider existing packages: `block/`, `datagen/`, `entity/`, `item/`, `world/` for appropriate placement
- **Always update CHANGELOG.md** with new features in the "0.1.0 (Next Release)" section

### Development Priorities and Status
- **Primary Development Branch**: `develop` - Always use this branch, not `master`
- **Current Status**: Active development stage with substantial content including blocks, items, entities, and world generation
- **Active Development**: Localization system is complete (9 languages supported), substantial block and item content, world generation features
- **Focus Areas**: Based on ROADMAP.md, priority is Arda dimension, world generation, factions, and biomes
- **Translation Status**: German (de_DE) has started translation; others use English placeholders

### Localization Workflow  
- Base language files are in main `src/main/resources/assets/lotr/lang/en_us.json` - **DATA-GENERATED ONLY**
- Translated versions maintained in separate language directories
- Crowdin integration automatically syncs translations
- Language keys are automatically generated from code - do not add manually to en_us.json

## Common Tasks and Outputs

### Repository Root Structure
```
.
├── .github/workflows/           # CI/CD pipelines
├── build.gradle                 # Main build configuration
├── gradle.properties           # Version definitions
├── gradlew                     # Gradle wrapper script
├── settings.gradle             # Gradle settings
├── CHANGELOG.md                # Release changelog - ALWAYS UPDATE for changes (maintained in develop branch)
├── src/main/                   # Primary source code
│   ├── generated/              # Auto-generated content (blocks, items, etc.)
│   ├── java/me/anedhel/lotr/ # Java source with core packages
│   │   ├── block/              # Block definitions and registration
│   │   ├── datagen/            # Data generation for recipes, models, etc.
│   │   ├── entity/             # Custom entities
│   │   ├── item/               # Item definitions and registration  
│   │   ├── mixin/              # Mixin modifications
│   │   ├── world/              # World generation features
│   │   └── *.java              # Main mod classes
│   └── resources/              # Assets and configs
├── ROADMAP.md                  # Feature planning document
├── crowdin.yml                 # Translation configuration
└── [de,fr,es-ES,it,nl,no,en-GB,qya-AA]/ # Translation directories
```

### Key File Contents
- **Mod ID**: "lotr" (defined in LordOfTheRingsMiddleEarthMod.java)
- **Minecraft Version**: 1.20.2
- **Fabric Loader**: 0.15.11+
- **Fabric API**: 0.91.6+1.20.2
- **Java Version**: 17
- **Main Package**: me.anedhel.lotr

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

## Validation Commands (Work Without Network Access)

### File Structure Validation
```bash
# Check all JSON files are valid
find . -name "*.json" -exec python3 -m json.tool {} \; >/dev/null && echo "All JSON files valid"

# Count source files
find src -name "*.java" | wc -l  # Should show 52+ Java files

# List language files  
find . -path "*/lang/*.json" | sort  # Shows all 11 language variants

# Check mod metadata
grep -E "(mod_version|minecraft_version|loader_version)" gradle.properties
```

### Content Validation
```bash  
# Verify main class exists and has correct package
grep "package me.anedhel.lotr" src/main/java/me/anedhel/lotr/LordOfTheRingsMiddleEarthMod.java

# Check mod ID consistency
grep -r '"lotr"' src/main/resources/ gradle.properties

# Validate language key consistency across locales
grep -h '"itemgroup\.' */src/main/resources/assets/lotr/lang/*.json | sort | uniq -c

# Validate that en_us.json is not manually edited (check if data-generated)
ls -la src/main/resources/assets/lotr/lang/en_us.json
```