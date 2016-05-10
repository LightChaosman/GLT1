/*** PicoJavaScanner ***/
import beaver.Scanner;
import java.io.FileInputStream;
import java.io.InputStream;

%%
/*** Rules section ***/
%public
%class PicoJavaScanner

%line
%column

DIGIT = [0-9]
NUMBER = {DIGIT}+

%%
/*** Supplementary Code section ***/

public static void main(String[] args) {
    yylex();
    return;
}

