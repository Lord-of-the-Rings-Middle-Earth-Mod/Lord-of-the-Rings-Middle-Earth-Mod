# GitHub Actions Workflows

This directory contains automated workflows for the Lord of the Rings Middle Earth Mod project.

## DataGen Workflow (`datagen.yml`)

### Purpose
Automatically runs the DataGen task whenever changes are made to the project's data generation code, ensuring that all generated content is always up-to-date before a pull request can be merged.

### Trigger Conditions
- **Event**: Pull request (opened, synchronized, reopened)
- **Path Filter**: Only triggers when files in `src/main/java/me/anedhel/lotr/datagen/` are modified
- **Branches**: Runs on pull requests targeting any branch

### What It Does
1. **Setup Environment**
   - Checks out the PR branch
   - Sets up Java 17 (Temurin distribution)
   - Configures Gradle with caching for performance
   - Validates the Gradle wrapper

2. **Run DataGen**
   - Executes `./gradlew runDataGen --no-daemon --stacktrace`
   - Generates data files to `src/main/generated/`

3. **Handle Results**
   - **If changes detected**: Commits generated files back to the PR branch with message format: `DataGen run for PR #<PR_NUMBER>`
   - **If no changes**: Comments on PR that DataGen completed successfully with no updates needed
   - **If failure**: Comments on PR with error notification and fails the workflow

### Branch Protection
The workflow is designed to work with branch protection rules that require the "DataGen" status check to pass before merging. This ensures:
- Pull requests cannot be merged until DataGen completes successfully
- Generated content remains synchronized with DataGen code changes
- The integrity of the main branch is preserved

### Configuration
- **Java Version**: 17
- **Runner**: ubuntu-latest
- **Permissions**: 
  - `contents: write` (to commit generated files)
  - `pull-requests: write` (to comment on PRs)

### Generated Files Location
- **Output Directory**: `src/main/generated/`
- **Includes**: Assets, data files, and other Minecraft mod resources

### DataGen Source Files
The workflow monitors changes in:
- `src/main/java/me/anedhel/lotr/datagen/ModBlockTagProvider.java`
- `src/main/java/me/anedhel/lotr/datagen/ModEnUsLangProvider.java`
- `src/main/java/me/anedhel/lotr/datagen/ModItemTagProvider.java`
- `src/main/java/me/anedhel/lotr/datagen/ModLootTableProvider.java`
- `src/main/java/me/anedhel/lotr/datagen/ModModelProvider.java`
- `src/main/java/me/anedhel/lotr/datagen/ModRecipeProvider.java`
- `src/main/java/me/anedhel/lotr/datagen/ModWorldGenerator.java`
- `src/main/java/me/anedhel/lotr/datagen/util/` (utility classes)

### Benefits
- **Automation**: Eliminates manual DataGen runs
- **Consistency**: Ensures generated files are always current
- **Quality Control**: Prevents merging PRs with outdated generated content
- **Transparency**: Provides clear feedback through PR comments
- **Efficiency**: Uses Gradle caching to minimize build times