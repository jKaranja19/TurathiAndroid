
#!/bin/bash

# Navigate to the directory containing your local Git repository
cd "$(dirname "$0")"

#start up web server
# xdg-open "http://localhost:5500"

#run script for committing to git
# ./myscript.sh

# Run file for extracting words
# node js/extract_words.js


# Add all changes to the Git staging area
git add .

git status

# Commit the changes with a descriptive message
# git commit -m "added more words for Nov 13 (Kenyan tree planting) challenge"
# git commit -m "added words for Diwali challenge"
# git commit -m "added /asia to /modules"
# git commit -m "final commit for Hult prize"
git commit -m "masked env vars"

# git commit -m "implemented pexel api in /currencies"
# git commit -m "modified /modules"
# git commit -m "added all words to /plants"


# Push the changes to your GitHub repository
git push origin main
