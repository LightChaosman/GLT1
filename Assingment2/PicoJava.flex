package PivoJava;

import beaver.Symbol;
import beaver.Scanner;
%%


%{
	public final static class Terminals{
		public final static short CLASS = 1;
		public final static short EXTENDS = 2;
		public final static short WHILE = 3;
		public final static short BOOLEAN = 4;
		public final static short LPAREN = 5;
		public final static short RPAREN = 6;
		public final static short LBRACE = 7;
		public final static short RBRACE = 8;
		public final static short SEMICOLON = 9;
		public final static short DOT = 10;
		public final static short OP_OR = 11;
		public final static short OP_AND = 12;
		public final static short ASSIGN = 13;
		public final static short IDENTIFIER = 14;
	}
	
	private Symbol sym(short id) {
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
	}
%}

%public
%final
%class PicoJavaScanner
%extends Scanner
%unicode
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

.|\n|\r       { throw new RuntimeException("Error: `"+yytext()+ "` (l:"+yyline+",c:"+yycolumn+")"); }
<<EOF>>       { return sym(Terminals.EOF); }

