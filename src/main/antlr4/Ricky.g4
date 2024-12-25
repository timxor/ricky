grammar Ricky;

// Parser Rules
program     : statement* EOF ;

statement   : functionDecl
           | expression ';'
           ;

functionDecl : 'def' IDENTIFIER '(' paramList? ')' block ;

paramList   : IDENTIFIER (',' IDENTIFIER)* ;

block       : '{' statement* '}' ;

expression  : primary
           | expression operator expression
           | IDENTIFIER '(' argList? ')'
           ;

primary     : NUMBER
           | IDENTIFIER
           | '(' expression ')'
           ;

argList     : expression (',' expression)* ;

operator    : '+' | '-' | '*' | '/' ;

// Lexer Rules
IDENTIFIER  : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER      : [0-9]+ ('.' [0-9]+)? ;
WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;