#!/bin/bash
# HOL 2: Implementing .gitignore for unwanted files and folders
echo "=== Executing HOL 2 ==="
cd GitDemo

# Create log files and log directory
mkdir -p log
echo "System log trace..." > app.log
echo "Folder log trace..." > log/debug.log

# Configure .gitignore
cat <<EOT > .gitignore
*.log
log/
EOT

git status
git add .gitignore
git commit -m "docs: add .gitignore rules for log files and log folder"
git status
cd ..
