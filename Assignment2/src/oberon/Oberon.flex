package Oberon;

import beaver.Symbol;
import beaver.Scanner;
import Oberon.OberonParser.Terminals;
%%


%{	
	private Symbol sym(short id) {
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
	}
%}

%public
%final
%class OberonScanner
%extends Scanner
%unicode
%function nextToken
%type Symbol
%line
%column


// Helper Definitions

Layout      = [ \t\n\r]+
Identifier  = [a-zA-Z][a-zA-Z0-9]*
Number      = [1-9][0-9]*
Comment     = "//"[^\n\r]*[\n\r]?

%% // Rules

"*"           { return sym(Terminals.OP_TIMES); }
"DIV"         { return sym(Terminals.OP_DIV); }
"MOD"         { return sym(Terminals.OP_MOD); }
"&"           { return sym(Terminals.OP_AND); }
"+"           { return sym(Terminals.OP_PLUS); }
"-"           { return sym(Terminals.OP_MINUS); }
"OR"          { return sym(Terminals.OP_OR); }

"="           { return sym(Terminals.EQUALS); }
"#"           { return sym(Terminals.HASHTAG); }
"<"           { return sym(Terminals.SMALLER); }
"<="          { return sym(Terminals.SMALLEREQ); }
">"			  { return sym(Terminals.GREATER); }
">="      	  { return sym(Terminals.GREATEREQ); }
"."           { return sym(Terminals.DOT); }
","           { return sym(Terminals.COMMA); }
":"           { return sym(Terminals.COLON); }
")"           { return sym(Terminals.RPAREN); }
"]"           { return sym(Terminals.RBRACE); }


"OF"          { return sym(Terminals.OF); }
"THEN"        { return sym(Terminals.THEN); }
"DO"          { return sym(Terminals.DO); }
"("           { return sym(Terminals.LPAREN); }
"["           { return sym(Terminals.LBRACE); }
"~"           { return sym(Terminals.TILDE); }
":="          { return sym(Terminals.ASSIGN); }
";"           { return sym(Terminals.SEMICOLON); }

"END"         { return sym(Terminals.END); }
"ELSE"        { return sym(Terminals.ELSE); }
"ELSEIF"      { return sym(Terminals.ELSEIF); }
"IF"          { return sym(Terminals.IF); }
"WHILE"       { return sym(Terminals.WHILE); }

"ARRAY"       { return sym(Terminals.ARRAY); }
"RECORD"      { return sym(Terminals.RECORD); }
"CONST"       { return sym(Terminals.CONST); }
"TYPE"        { return sym(Terminals.TYPE); }
"VAR"         { return sym(Terminals.VAR); }
"PROCEDURE"   { return sym(Terminals.PROCEDURE); }
"BEGIN"       { return sym(Terminals.BEIN); }
"MODULE"      { return sym(Terminals.MODULE); }





{Layout}      { /* ignore */ }
{Comment}     { /* ignore */ }
{Identifier}  { return sym(Terminals.IDENTIFIER); }
{Number}  { return sym(Terminals.NUMBER); }

[^]       { throw new RuntimeException("Error: `"+yytext()+ "` (l:"+yyline+",c:"+yycolumn+")"); }
<<EOF>>       { return sym(Terminals.EOF); }

