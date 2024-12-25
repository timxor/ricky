package com.rickylang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class RickyMain {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java RickyMain <source-file>");
            System.exit(1);
        }

        // Create lexer and parser
        CharStream input = CharStreams.fromFileName(args[0]);
        RickyLexer lexer = new RickyLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RickyParser parser = new RickyParser(tokens);

        // Parse the input
        ParseTree tree = parser.program();

        // Create a custom visitor
        RickyVisitor visitor = new RickyBaseVisitor<>();
        visitor.visit(tree);
    }
}