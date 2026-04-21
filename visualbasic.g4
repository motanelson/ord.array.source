grammar visualbasic;

// ================= PARSER =================

programa
    : instrucao* EOF
    ;

instrucao
    : declaracaoVariavel NEWLINE
    | declaracaoSub
    | declaracaoFuncao
    | atribuicao NEWLINE
    | chamadaProcedimento NEWLINE
    | blocoIf
    | returnStmt NEWLINE
    | NEWLINE
    ;

declaracaoSub
    : SUB ID '(' parametroLista? ')' NEWLINE
      bloco
      END SUB NEWLINE?
    ;

declaracaoVariavel
    : DIM ID (AS tipo)? ('=' expressao)?
    ;

declaracaoFuncao
    : FUNCTION ID '(' parametroLista? ')' AS tipo NEWLINE
      bloco
      END FUNCTION NEWLINE?
    ;

parametroLista
    : parametro (',' parametro)*
    ;

parametro
    : ID AS tipo
    ;

bloco
    : instrucao*
    ;

blocoIf
    : IF expressao THEN NEWLINE
      bloco
      (ELSE NEWLINE bloco)?
      END IF NEWLINE?
    ;

atribuicao
    : ID '=' expressao
    ;

returnStmt
    : RETURN expressao
    ;

chamadaProcedimento
    : ID '(' argumentoLista? ')'
    ;

argumentoLista
    : expressao (',' expressao)*
    ;

expressao
    : termo (('+'|'-') termo)*
    ;

termo
    : fator (('*'|'/') fator)*
    ;

fator
    : ID ('(' argumentoLista? ')')?
    | NUMBER
    | STRING
    | BOOLEAN
    | '(' expressao ')'
    ;

tipo
    : INTEGER
    | STRINGTYPE
    | BOOLEANTYPE
    | DOUBLETYPE
    ;

// ================= LEXER =================

// keywords
SUB         : [sS][uU][bB];
FUNCTION    : [fF][uU][nN][cC][tT][iI][oO][nN];
DIM         : [dD][iI][mM];
AS          : [aA][sS];
END         : [eE][nN][dD];
IF          : [iI][fF];
THEN        : [tT][hH][eE][nN];
ELSE        : [eE][lL][sS][eE];
RETURN      : [rR][eE][tT][uU][rR][nN];

INTEGER     : [iI][nN][tT][eE][gG][eE][rR];
STRINGTYPE  : [sS][tT][rR][iI][nN][gG];
BOOLEANTYPE : [bB][oO][oO][lL][eE][aA][nN];
DOUBLETYPE  : [dD][oO][uU][bB][lL][eE];

BOOLEAN     : [tT][rR][uU][eE] | [fF][aA][lL][sS][eE];
STRING      : '"' (~["\r\n])* '"';
NUMBER      : [0-9]+;
ID          : [a-zA-Z_][a-zA-Z_0-9]*;

NEWLINE     : '\r'? '\n';
WS          : [ \t]+ -> skip;