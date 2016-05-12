package picoJava;

import beaver.Symbol;
import beaver.Scanner;
import picoJava.PicoJavaParser.Terminals;
%%


%{	
	private Symbol sym(short id) {
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
	}
%}

%public
%final
%class PicoJavaScanner
%extends Scanner
%unicode
%function nextToken
%type Symbol
%line
%column


// Helper Definitions

Layout      = [ \t\n\r]+
Identifier  = [a-zA-Z][a-zA-Z0-9]*
Comment     = "//"[^\n\r]*[\n\r]?

%% // Rules

"class"       { return sym(Terminals.CLASS); }
"extends"     { return sym(Terminals.EXTENDS); }
"while"       { return sym(Terminals.WHILE); }

"true"        { return sym(Terminals.BOOLEAN); }
"false"       { return sym(Terminals.BOOLEAN); }

"("           { return sym(Terminals.LPAREN); }
")"           { return sym(Terminals.RPAREN); }
"{"           { return sym(Terminals.LBRACE); }
"}"           { return sym(Terminals.RBRACE); }
";"           { return sym(Terminals.SEMICOLON); }
"."           { return sym(Terminals.DOT); }
"||"          { return sym(Terminals.OP_OR); }
"&&"          { return sym(Terminals.OP_AND); }

"="           { return sym(Terminals.ASSIGN); }

{Layout}      { /* ignore */ }
{Comment}     { /* ignore */ }
{Identifier}  { return sym(Terminals.IDENTIFIER); }

[^]           { throw new RuntimeException("Error: `"+yytext()+ "` (l:"+yyline+",c:"+yycolumn+")"); }
<<EOF>>       { return sym(Terminals.EOF); }

