#!/bin/bash
# HOL 4: Merge Conflict Resolution with hello.xml
echo "=== Executing HOL 4 ==="
cd GitDemo

# Ensure clean state and create GitWork branch
git checkout -b GitWork
cat <<EOT > hello.xml
<?xml version="1.0" encoding="UTF-8"?>
<note>
    <to>BranchUser</note>
    <from>GitWork</from>
    <heading>Reminder</heading>
    <body>Content from GitWork branch</body>
</note>
EOT
git add hello.xml
git commit -m "feat: add hello.xml in GitWork branch"

# Switch to main/master and make conflicting changes
git checkout main 2>/dev/null || git checkout master
cat <<EOT > hello.xml
<?xml version="1.0" encoding="UTF-8"?>
<note>
    <to>MasterUser</to>
    <from>Master</from>
    <heading>Reminder</heading>
    <body>Content from Master branch</body>
</note>
EOT
git add hello.xml
git commit -m "feat: add conflicting hello.xml in master branch"

# Observe logs and attempt merge
git log --oneline --graph --decorate --all
git merge GitWork

# Resolve Conflict manually by choosing unified XML format
cat <<EOT > hello.xml
<?xml version="1.0" encoding="UTF-8"?>
<note>
    <to>AllUsers</to>
    <from>ResolvedMaster</from>
    <heading>Reminder</heading>
    <body>Resolved merge conflict content between Master and GitWork</body>
</note>
EOT

git add hello.xml
git commit -m "fix: resolve merge conflict in hello.xml"

# Update .gitignore for backup files if any
echo "*.orig" >> .gitignore
git add .gitignore
git commit -m "docs: ignoreOrig backup files"

# List and delete merged branch
git branch -a
git branch -d GitWork
git log --oneline --graph --decorate
cd ..
