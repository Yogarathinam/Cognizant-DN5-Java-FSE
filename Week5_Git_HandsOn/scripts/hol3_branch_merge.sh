#!/bin/bash
# HOL 3: Branching, Merging, and Branch Deletion
echo "=== Executing HOL 3 ==="
cd GitDemo

# Branching
git checkout -b GitNewBranch
git branch -a
echo "Feature branch work in progress..." > feature.txt
git add feature.txt
git commit -m "feat: working on GitNewBranch"
git status

# Switch to main/master and Merge
git checkout main 2>/dev/null || git checkout master
git diff main GitNewBranch 2>/dev/null || git diff master GitNewBranch
git merge GitNewBranch
git log --oneline --graph --decorate --all

# Delete merged branch
git branch -d GitNewBranch
git status
cd ..
