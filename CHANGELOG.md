# Changelog

All notable changes to the Lord of the Rings Middle Earth Mod will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.1.0] - TBA

### Added
- Initial mod structure with Minecraft 1.20.1 Fabric support
- Basic mod initialization and client entry points
- Data generation framework with `./gradlew runDatagen` support
- Core creative item groups (LotR Blocks, LotR Food, LotR Plants, etc.)
- Multi-language support with 9 locales (en_us, de, fr, es-ES, it, nl, no, en-GB, qya-AA)
- Crowdin integration for translation management
- Package structure: `me.anedhel.lotrmiddleearth`
- Mixin support framework
- GitHub Actions CI/CD workflows for automated builds

### Technical
- Java 17 compatibility
- Fabric Loader 0.15.11+ support
- Fabric API 0.92.1+1.20.1 compatibility
- Auto-generated language files via data generation
- MIT License

### Development
- Comprehensive GitHub Copilot instructions for develop branch workflow
- Build and validation documentation
- Data generation and testing procedures