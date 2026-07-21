#!/bin/bash
# HOL 1: Setup machine with Git Configuration & Basic Operations
echo "=== Executing HOL 1 ==="
git config --global user.name "Yogarathinam"
git config --global user.email "yogarathinam26@gmail.com"

# Create GitDemo Project
mkdir -p GitDemo && cd GitDemo
git init

# Add welcome.txt
echo "Welcome to Cognizant Digital Nurture Git Training!" > welcome.txt
git status
git add welcome.txt
git commit -m "feat: add welcome.txt for HOL 1"
git status
cd ..
