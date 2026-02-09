#!/bin/bash
# Validation script for the DataGen workflow

echo "🔍 Validating DataGen workflow configuration..."

# Check if workflow file exists
if [ ! -f ".github/workflows/datagen.yml" ]; then
    echo "❌ DataGen workflow file not found!"
    exit 1
fi

# Check if DataGen source directory exists
if [ ! -d "src/main/java/com/anedhel/vext/datagen" ]; then
    echo "❌ DataGen source directory not found!"
    exit 1
fi

# Check if generated directory exists (create if not)
if [ ! -d "src/main/generated" ]; then
    echo "⚠️ Generated directory not found, creating it..."
    mkdir -p src/main/generated
fi

# Check if fabric.mod.json has the datagen entrypoint
if ! grep -q "fabric-datagen" src/main/resources/fabric.mod.json; then
    echo "❌ fabric-datagen entrypoint not found in fabric.mod.json!"
    exit 1
fi

# Check if VExtModDataGenerator exists
if [ ! -f "src/main/java/com/anedhel/vext/VExtModDataGenerator.java" ]; then
    echo "❌ DataGenerator entrypoint class not found!"
    exit 1
fi

# Validate workflow YAML syntax (basic check)
python3 -c "import yaml; yaml.safe_load(open('.github/workflows/datagen.yml'))" 2>/dev/null
if [ $? -ne 0 ]; then
    echo "❌ Invalid YAML syntax in datagen.yml!"
    exit 1
fi

echo "✅ All validation checks passed!"
echo "📋 Workflow Summary:"
echo "   - Triggers on changes to: src/main/java/com/anedhel/vext/datagen/**"
echo "   - Uses Java 17 with Temurin distribution"
echo "   - Runs command: ./gradlew runDataGen"
echo "   - Commits changes to: src/main/generated/"
echo "   - Commit message format: DataGen run for PR #<number>"
echo ""
echo "🔗 Next steps:"
echo "   1. Configure branch protection rules (see .github/BRANCH_PROTECTION.md)"
echo "   2. Test the workflow by creating a PR with DataGen changes"
echo "   3. Verify that generated files are updated correctly"