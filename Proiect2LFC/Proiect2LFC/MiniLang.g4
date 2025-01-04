grammar MiniLang;

program: (funcDecl | globalVar)* EOF;

funcDecl:
	type FUNCTION_NAME (
		type VARIABLE_NAME (COMMA type VARIABLE_NAME)*
	)? RPAREN block;

globalVar:
	type VARIABLE_NAME (EQUALS (VARIABLE_NAME | NUMBER | STRING))? SEMICOLON;

codeline:
	forLoop
	| whileLoop
	| ifStatement
	| ifElseStatement
	| attribution SEMICOLON
	| declaration
	| functionCallWithReturn
	| functionCallWithoutReturn;

forLoop:
	FOR type? VARIABLE_NAME (
		EQUALS (VARIABLE_NAME | STRING | NUMBER)
	)? SEMICOLON expression SEMICOLON attribution RPAREN block;

whileLoop: WHILE expression RPAREN block;

ifElseStatement: IF expression RPAREN block ELSE block;

ifStatement: IF expression RPAREN block;

functionCallWithReturn:
	RETURN ((functionCallWithoutReturn) | (attribution))? SEMICOLON;

functionCallWithoutReturn:
	FUNCTION_NAME (
		(VARIABLE_NAME | NUMBER | STRING) (
			COMMA (VARIABLE_NAME | NUMBER | STRING)
		)*
	)? RPAREN;

declaration:
	CONST? type VARIABLE_NAME (
		(
			EQUALS
			| PLUS_EQUALS
			| MINUS_EQUALS
			| MUL_EQUALS
			| MOD_EQUALS
			| DIV_EQUALS
		) attribution
	)? SEMICOLON # varDeclaration;

attribution:
	type? VARIABLE_NAME (
		EQUALS
		| PLUS_EQUALS
		| MINUS_EQUALS
		| MUL_EQUALS
		| MOD_EQUALS
	) attribution
	| attribution (PLUS | MINUS | ASTERISK | SLASH | MODULO) attribution
	| (INCREMENT | DECREMENT) attribution
	| attribution (INCREMENT | DECREMENT)
	| functionCallWithoutReturn
	| STRING
	| NUMBER
	| VARIABLE_NAME;

type:
	INT_TYPE
	| FLOAT_TYPE
	| DOUBLE_TYPE
	| STRING_TYPE
	| VOID_TYPE;

block: LBRACE (codeline)* RBRACE;

expression:
	expression (AND | OR | NOT | LTE | GTE | LT | GT | EQ | NEQ) expression	# relationalExp
	| expression (AND | OR) expression										# logicalExp
	| NOT expression														# notExp
	| VARIABLE_NAME (INCREMENT | DECREMENT)									# incrementDecrementExp
	| (INCREMENT | DECREMENT) VARIABLE_NAME									# preincrdecrexp
	| NUMBER																# numericAtomExp
	| STRING																# stringAtomExp
	| VARIABLE_NAME															# varName;

// Lexer rules

CONST: 'const';

INT_TYPE: 'int';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
STRING_TYPE: 'string';
VOID_TYPE: 'void';

IF: 'if' WS* LPAREN;
ELSE: 'else';
FOR: 'for' WS* LPAREN;
WHILE: 'while' WS* LPAREN;
RETURN: 'return';

// Functii
FUNCTION_NAME: [a-zA-Z_][a-zA-Z0-9_]* WS* '(';

// Variabile
VARIABLE_NAME: [a-zA-Z_][a-zA-Z0-9_]*;

// Constante numerice i literali
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: '"' .*? '"';

// Operatorii relaionali
LTE: '<=';
GTE: '>=';
LT: '<';
GT: '>';
EQ: '==';
NEQ: '!=';

// Operatorii de incrementare/decrementare
INCREMENT: '++';
DECREMENT: '--';

// Operatorii de atribuire
EQUALS: '=';
PLUS_EQUALS: '+=';
MINUS_EQUALS: '-=';
MUL_EQUALS: '*=';
DIV_EQUALS: '/=';
MOD_EQUALS: '%=';

// Operatorii aritmetici
PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
MODULO: '%';

// Operatorii logici
AND: '&&';
OR: '||';
NOT: '!';

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