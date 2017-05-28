grammar JSLite;


IntegerLiteral         :       [0-9]+;
DecimalLiteral         :       [0-9]+'.'[0-9]+;

VAR             :       'var';
DEF             :       'def';
RETURN          :       'return';
BREAK           :       'break';
IF              :       'if';
ELSE            :       'else';
WHILE           :       'while';
TRUE            :       'true';
FALSE           :       'false';


ASSIGN          :       '=';
COMMA           :       ',';
SEMICOMMA       :       ';';
LP              :       '(';
RP              :       ')';
LBRACE          :       '{';
RBRACE          :       '}';
LBRACKET        :       '[';
RBRACKET        :       ']';

WS              :       [ \t\r\n]+  -> skip;


Identifier      :       [a-zA-Z][a-zA-Z0-9]*;

StringLiteral   :       '"' ~["]* '"';

expression      :       LP expression RP            #parenthesesExp
                |       IntegerLiteral              #integerLiteralExp
				|       DecimalLiteral              #decimalLiteralExp
				|       Identifier                  #identifierLiteralExp
				|       StringLiteral               #stringLiteralExp
				|       (TRUE | FALSE)              #booleanLiteral
				|       '!' expression              #notExpression
				|       expression op=('*' | '/' | '%') expression  #l1BinaryExp
				|       expression op=('+' | '-') expression        #l2BinaryExp
				|       expression op=('<' | '>' | '<=' | '>=' | '==' | '!=' ) expression #l3BinaryExp
				|       expression op=('&&' | '||' ) expression #l4BinaryExp
				|       call                        #callExp
				;

start           :   statement*;

statement       :   variableDefinitionsStatement
				|   assignStatement
				|   functionDefinitionStatement
				|   emptyStatement
				|   returnStatement
				|   callStatement
				|   blockStatement
				|   ifStatement
				|   whileStatement
				|   breakStatement;

variableDefinitionsStatement  :       VAR variableDefinition (COMMA variableDefinition)* SEMICOMMA;
variableDefinition      :       Identifier  (ASSIGN  expression)?;
assignStatement         :       Identifier ASSIGN expression SEMICOMMA;
//leftValue               :       Identifier
//						|       arrayAccess;
//arrayAccess             :       expression (LBRACKET expression RBRACKET)+;

functionDefinitionStatement:       DEF Identifier LP argumentList RP LBRACE functionBody RBRACE;
functionBody            :       statement*;
argumentList            :       Identifier (COMMA Identifier)*
						|       ;


emptyStatement          : SEMICOMMA;

returnStatement         :  RETURN expression? SEMICOMMA;

breakStatement          :   BREAK SEMICOMMA;

callStatement           :   call SEMICOMMA;

call                    :   Identifier LP callArgumentList RP;
callArgumentList        :
						|   expression (COMMA expression)*;

blockStatement          :   LBRACE statement* RBRACE;

ifStatement             :   IF LP expression RP statement (ELSE statement)?;

whileStatement          :   WHILE LP expression RP statement;


