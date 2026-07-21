#!/bin/bash
# HOL 5: Cleanup and Push Back to Remote Git
echo "=== Executing HOL 5 ==="
cd GitDemo

git status
git branch -a

# Pull and Push operations
git pull origin main --rebase 2>/dev/null || git pull origin master --rebase 2>/dev/null
git push origin main 2>/dev/null || git push origin master 2>/dev/null

echo "=== HOL 5 Sync Execution Complete ==="
cd ..
