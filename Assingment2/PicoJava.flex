/*** Definition section ***/

%{
// Definition section flex output
%}

%%
/*** Rules section ***/

/* This tells flex to read only one input file */
%option noyywrap

%public
%class Scanner

%unicode

%line
%column

%cup
%cupdebug

%{
// Rules section flex output
%}

[0-9]+ {/* yytext is a string containing the matched text. */
    printf("Saw an integer: %s\n", yytext);
}
.|\n { /* Ignore all other characters. */ } 

%%
/*** Supplementary Code section ***/

public static void main(String[] args) {
    yylex();
    return;
}

