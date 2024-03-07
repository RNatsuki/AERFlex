import java_cup.runtime.Symbol;
import JFlex.sym;
%%
%public
%char
%line
%cup
%{
private Symbol sym(int type, Object value){
    return new Symbol(type, yyline, yycolumn, value);
}
%}
letras = [a-z]
numeros = [0-9]
%%

" "a(a|b)*b"," {System.out.println(yytext());}



"\r"|"\n"|"\r\n"                {}   
.                               {}