#!/bin/bash

# Generate ANTLR files
antlr -o src/main/java/com/rickylang src/main/antlr4/Ricky.g4

# Compile Java files
javac -cp "/opt/homebrew/opt/antlr/antlr-4.13.1-complete.jar" src/main/java/com/rickylang/*.java