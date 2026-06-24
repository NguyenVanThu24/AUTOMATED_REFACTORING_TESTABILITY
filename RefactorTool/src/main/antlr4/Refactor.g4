grammar Refactor;

@header {
package com.refactor;
}

statement
    : dependencyCall EOF
    ;

dependencyCall
    : IDENTIFIER '.'
      'getInstance'
      '(' ')'
      '.'
      IDENTIFIER
      '(' IDENTIFIER ')'
    ;

IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;