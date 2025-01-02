grammar MiniLang;

program: statement* EOF;

statement:
	declaration																			# declarationStmt
	| expression SEMICOLON																# expressionStmt
	| IF LPAREN expression RPAREN block													# ifStmt
	| IF LPAREN expression RPAREN block ELSE block										# ifElseStmt
	| FOR LPAREN expression? SEMICOLON expression? SEMICOLON expression? RPAREN block	# forStmt
	| WHILE LPAREN expression RPAREN block												# whileStmt
	| RETURN expression? SEMICOLON														# returnStmt;

declaration:
	CONST? type VARIABLE_NAME (EQUALS expression)? SEMICOLON; // Declarare de variabile

type:
	INT_TYPE
	| FLOAT_TYPE
	| DOUBLE_TYPE
	| STRING_TYPE
	| VOID_TYPE;

block: LBRACE statement* RBRACE;

expression:
	LPAREN expression RPAREN									# parenthesisExp
	| expression (ASTERISK | SLASH | MODULO) expression			# mulDivExp
	| expression (PLUS | MINUS) expression						# addSubExp
	| expression (LT | GT | LTE | GTE | EQ | NEQ) expression	# relationalExp
	| expression (AND | OR) expression							# logicalExp
	| NOT expression											# notExp
	| VARIABLE_NAME (INCREMENT | DECREMENT)?					# incrementDecrementExp
	| VARIABLE_NAME EQUALS expression							# assignmentExp
	| FUNCTION_NAME (expression (COMMA expression)*)? RPAREN	# functionCallExp
	| NUMBER													# numericAtomExp
	| STRING													# stringAtomExp;

// Lexer rules

CONST: 'const';

INT_TYPE: 'int';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
STRING_TYPE: 'string';
VOID_TYPE: 'void';

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';

// Variabile
VARIABLE_NAME: [a-zA-Z_][a-zA-Z0-9_]*;

// Functii
FUNCTION_NAME: [a-zA-Z_][a-zA-Z0-9_]* '(';

// Constante numerice i literali
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: '"' .*? '"';

// Operatorii aritmetici
PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
MODULO: '%';

// Operatorii relaionali
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
EQ: '==';
NEQ: '!=';

// Operatorii logici
AND: '&&';
OR: '||';
NOT: '!';

// Operatorii de atribuire
EQUALS: '=';
PLUS_EQUALS: '+=';
MINUS_EQUALS: '-=';
MUL_EQUALS: '*=';
DIV_EQUALS: '/=';
MOD_EQUALS: '%=';

// Operatorii de incrementare/decrementare
INCREMENT: '++';
DECREMENT: '--';

// Delimitatori
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
SEMICOLON: ';';

// Alte reguli
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;