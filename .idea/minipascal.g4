// Define a grammatica
grammar minipascal;

//Regra sintatica

//Programa e Bloco
prog : 'program'  ID SC bloco;

bloco : (comando) | ACOL (decvariaveis) FCOL | ACOL (decrotinas) FCOL;

//Declarações

decvariaveis: AC SC decvars FC SC;

decvars: tipo list_ids;

list_ids: ID C AC (ID) FC*;

decrotinas:  AC decproceds SC FC;

decproceds: 'procedure' tipo  formalparams SC bloco;

formalparams: AP paramsession AC SC paramsession FC FP;

paramsession: ACOL 'var' FCOL list_ids TWODOTS ID ;

//Tipos de dados

tipo: inteiro | booleano| floate| stringei;

inteiro: DIGITO +(DIGITO);

booleano: True | False;

floate: NUMBER;

stringei: LETRA;

//Comandos

comando: 'begin' (cmd) 'end';

cmd: cmdattrib | cmdproced | comando | cmdcondic | cmdrepeat | cmdREAD | cmdWRITE | ;

cmdattrib: ID RELACAO expr SC;

cmdproced: ID expression;

cmdcondic: 'if' expression 'then' comando 'else' comando;

cmdrepeat: 'while' expression 'do' comando;

cmdREAD: 'leia' AP ID FP SC;

cmdWRITE: 'escreva' AP ID FP SC;

expr: termo( OP termo)*;

termo: ID | NUMBER;

//Expressões

expression: simpleexpression ACOL RELACAO simpleexpression FCOL;

simpleexpression:;

fator: variavel | NUMBER | expression | 'not' fator;

variavel: ID | ID ACOL expression FCOL;

listexpressions: expression AC C expression FC;

//Definindo tokens

AP : '(';

FP : ')';

AC : '{';

FC:  '}';

ACOL: '[';

FCOL: ']';

TWODOTS: ':';

SC : ';';

C: ',';

OP : '+' | '-' | '*' | '/' ;

RELACAO : '='| '<>' | '<' | '<=' | '>=' | '>';

ID : [a-z] ([a-z] | [A-Z] | [0-9] )*;

NUMBER : [0-9] + ('.' [0-9]+)?;

DIGITO: [0-9];

LETRA: '_' | [a-z] | [A-Z];

INT : 'INT';

WS : (' ' | '\t'| '\n'| '\r') -> skip;

True: 'True';

False: 'False';


RESERVADAS: ;