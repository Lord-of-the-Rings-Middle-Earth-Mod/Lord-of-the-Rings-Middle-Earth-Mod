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

## Build JAR Workflow (`build-jar.yml`)

### Purpose
Automatically builds and distributes JAR files for testing and release purposes, streamlining the development and release process.

### Trigger Conditions
The workflow supports three distinct scenarios:

#### Scenario 1: Issue Moved to Test
- **Event**: `project_card` (when moved)
- **Condition**: Issue is moved to "Test" column on project board
- **Branch**: `develop`
- **JAR Naming**: `x.y.z+xM.yM.zM-dev`

#### Scenario 2: Release Published
- **Event**: `release` (published)
- **Branch**: Release tag (or `master` as fallback)
- **JAR Naming**: `x.y.z+xM.yM.zM`

#### Scenario 3: Manual Trigger
- **Event**: `workflow_dispatch`
- **Options**: 
  - Dev build (uses `develop` branch, `-dev` suffix)
  - Release build (uses `master` branch, no suffix)
- **Branch**: Based on selection
- **JAR Naming**: Based on build type selection

### Version Naming Convention
The workflow extracts version information from `gradle.properties`:
- **Mod Version** (`mod_version`): e.g., `0.1.0-1.20.2`
- **Minecraft Version** (`minecraft_version`): e.g., `1.20.2`

**Output JAR Names:**
- **Dev Builds**: `lotr-me-0.1.0+1.20.2-dev.jar`
- **Release Builds**: `lotr-me-0.1.0+1.20.2.jar`

### What It Does

#### Phase 1: Determine Build Type
The workflow first evaluates the trigger event to determine:
- Whether a build should proceed
- Build type (dev or release)
- Source branch to use
- Associated issue number (if applicable)

#### Phase 2: Build JAR
If build conditions are met, the workflow:

1. **Setup Environment**
   - Checks out the appropriate branch
   - Sets up Java 17 (Temurin distribution)
   - Configures Gradle with caching
   - Validates the Gradle wrapper

2. **Extract Version Information**
   - Reads `mod_version` from `gradle.properties`
   - Reads `minecraft_version` from `gradle.properties`
   - Constructs JAR name based on build type

3. **Build and Package**
   - Executes `./gradlew build --no-daemon --stacktrace`
   - Renames JAR file to follow naming convention
   - Uploads JAR as workflow artifact

4. **Distribution**
   - **For Test Builds**: Posts comment on the issue with download link
   - **For Releases**: Attaches JAR file to the GitHub release

### Configuration
- **Java Version**: 17
- **Runner**: ubuntu-latest
- **Permissions**: 
  - `contents: write` (to attach to releases)
  - `issues: write` (to comment on issues)

### Usage Examples

#### Testing an Issue
1. Move an issue to the "Test" column on your project board
2. Workflow automatically triggers and builds a dev JAR
3. Tester receives a comment on the issue with download link
4. Tester downloads JAR from workflow artifacts

#### Publishing a Release
1. Create and publish a release on GitHub
2. Workflow automatically triggers and builds a release JAR
3. JAR file is attached to the release
4. Users can download directly from the release page

#### Manual Build
1. Go to Actions → Build JAR workflow
2. Click "Run workflow"
3. Select build type (dev or release)
4. Click "Run workflow" button
5. Download JAR from workflow artifacts

### Benefits
- **Automated Testing**: Testers get builds automatically when issues move to testing
- **Release Automation**: Releases automatically include build artifacts
- **Flexibility**: Manual triggers for ad-hoc builds
- **Consistency**: Standardized naming convention
- **Transparency**: Clear feedback through issue comments and artifacts