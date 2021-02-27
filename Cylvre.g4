grammar Cylvre;

/*************
****PARSER****
*************/

compilationUnit             : fileDeclaration EOF ;

fileDeclaration             : fileBody;

fileBody                    : function* statement* classDeclaration*;

classDeclaration            : CLASS className '{' classBody '}' ;

className                   : qualifiedName ;

classBody                   : field* function* ;

field                       : variableDeclaration;

function                    : functionDeclaration block ;

functionDeclaration         : (type)? FUNC functionName '(' parametersList? ')' ;

parametersList              :  parameter (',' parameter)*
                            |  parameter (',' parameterWithDefaultValue)*
                            |  parameterWithDefaultValue (',' parameterWithDefaultValue)*
                            ;

functionName                : ID ;

parameter                   : type ID ;

parameterWithDefaultValue   : type ID ASSIGN defaultValue=expression ;

type                        : primitiveType
                            | classType
                            | arrayType
                            ;

primitiveType               : BOOL_KW
                            | STRING_KW
                            | CHAR_KW
                            | BYTE_KW
                            | SHORT_KW
                            | INT_KW
                            | LONG_KW
                            | FLOAT_KW
                            | DOUBLE_KW
                            | VOID_KW
                            ;

classType                   : qualifiedName ;

arrayType                   : primitiveType ('['']')+
                            | classType ('['']')+
                            ;

block                       : '{' statement* '}' ;

statement                   : block
                            | variableDeclaration
                            | assignment
                            | printlnStatement
                            | printStatement
                            | print_errStatement
                            | forStatement
                            | ifStatement
                            | returnStatement
                            | scannerStatement
                            | value
                            | expression
                            ;

variableDeclaration         : (type)? name ASSIGN expression ';' #VariableDeclarationWithAssignment
                            | type name ';'#VariableDeclarationWithoutAssignment
                            | arrayDeclaration #VariableArrayDeclaration
                            ;

arrayDeclaration            : arrayType name ASSIGN arrayAssignment';' ;

arrayAssignment             : '['value*']';

assignment                  : name ASSIGN expression;

printlnStatement            : PRINTLN '(' expression ')' ';' ;

printStatement              : PRINT '('expression')'';' ;

print_errStatement          : PRINT_ERR '(' expression ')'';' ;

scannerStatement            : SCANNER .+? ';';

returnStatement             : RETURN expression #ReturnWithValue
                            | RETURN #ReturnVoid ;

ifStatement                 :  expression '?' trueStatement=statement | block ';' (ELSE falseStatement=statement | block)?;

forStatement                : FOR forConditions (statement | block) ;

forConditions               : iterator=variableReference  '(' startExpr=expression range=TO endExpr=expression ')' ;

name                        : ID ;

argumentList                : argument? (',' a=argument)*           #UnnamedArgumentsList
                            | namedArgument? (',' namedArgument)*   #NamedArgumentsList ;

argument                    : expression ;

namedArgument               : name '~>' expression ;

expression                  : variableReference                                         #VarReference
                            | owner=expression '.' functionName '(' argumentList ')'';'    #FunctionCall
                            | functionName '(' argumentList ')'';'                         #FunctionCall
                            | superCall=SUPER '('argumentList ')'';'                       #SuperCall
                            | newCall=NEW className '('argumentList ')'';'                 #ConstructorCall
                            | value                                                     #ValueExpr
                            | '('expression '*' expression')'                           #Multiply
                            | expression '*' expression                                 #Multiply
                            | '(' expression '/' expression ')'                         #Divide
                            | expression '/' expression                                 #Divide
                            | '(' expression '+' expression ')'                         #Add
                            | expression '+' expression                                 #Add
                            | '(' expression '-' expression ')'                         #Subtract
                            | expression '-' expression                                 #Subtract
                            | expression cmp='>' expression                             #ConditionalExpression
                            | expression cmp='<' expression                             #ConditionalExpression
                            | expression cmp='=' expression                             #ConditionalExpression
                            | expression cmp='!=' expression                            #ConditionalExpression
                            | expression cmp='>=' expression                            #ConditionalExpression
                            | expression cmp='<=' expression                            #ConditionalExpression
                            ;

variableReference           : ID ;

value                       : NUMBER
                            | BOOL
                            | STRING ;

qualifiedName               : ID ('.' ID)*;

/************
****LEXER****
************/

//Keywords
FUNC                        : 'func';
CLASS                       : 'class';
PRINTLN                     : 'println' ;
PRINT                       : 'print' ;
PRINT_ERR                   : 'print_err';
FOR                         : 'for';
RETURN                      : 'return';
ELSE                        : 'else';
TO                          : 'to';
SUPER                       : 'super';
NEW                         : 'new';
TRUE                        : 'true';
FALSE                       : 'false';
SCANNER                     : 'scanner';

//Assignment
ASSIGN                      : ':';

//Arithmetic
PLUS                        : '+';
MINUS                       : '-';
MULTIPLY                    : '*';
DIVIDE                      : '/';

//Type Keywords
STRING_KW                   : 'str';
BYTE_KW                     : 'byte';
INT_KW                      : 'int';
LONG_KW                     : 'long';
SHORT_KW                    : 'short';
BOOL_KW                     : 'bool';
VOID_KW                     : 'void';
CHAR_KW                     : 'char';
FLOAT_KW                    : 'float';
DOUBLE_KW                   : 'double';

//Comparison
EQUALS                      : '=' ;
GREATER_THAN                : '>';
LESS_THAN                   : '<';
GREATER_OR_EQUALS           : '>=';
LESS_OR_EQUALS              : '<=';
DIFFERENT                   : '!=';


//Symbols
TILDE                       : '~';
DB_TILDE                    : TILDE TILDE;
RBOX                        : ']';
LBOX                        : '[';
RCURLY                      : '}';
LCURLY                      : '{';
RPAREN                      : ')';
LPAREN                      : '(';
SEMICOLON                   : ';';
Q_MARK                      : '?';
ARROW                       : '~>';

//Literals
NUMBER                      : '-'?[0-9.]+ ;
BOOL                        : TRUE | FALSE ;
STRING                      : '"'~('\r' | '\n' | '"')*'"' ;

//Identifier
ID                          : [a-zA-Z0-9_]+ ;

//Whitespace and Comments
WS                          : [ \t\r\n]+ -> channel(HIDDEN) ;
