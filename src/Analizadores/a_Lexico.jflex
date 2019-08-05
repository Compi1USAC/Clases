/*----------------------------------------------------------------------------
--------------------- 1ra. Area: Codigo de Usuario
----------------------------------------------------------------------------*/

//-------> Paquete, importaciones

package Analizadores;

import java_cup.runtime.*;
import java.util.ArrayList;

%%
/*----------------------------------------------------------------------------
--------------------- 2da. Area: Opciones y Declaraciones
----------------------------------------------------------------------------*/

%{
    String cadena="";
    /*public static LinkedList<AcepErr> TablaErr=new LinkedList<AcepErr>();*/
%}

//-------> Directivas
%public
%class a_Lexico
%cupsym Simbolos
%cup
%char
%line
%column
%full
%unicode
%ignorecase

//-------> Expresiones Regulares

digito = [0-9]
numero = {digito}+("." {digito}+)?
letra = [a-zA-ZñÑ]
id = {letra}+({letra}|{digito}|"_")*   


//-------> Estados    EN ORDEN
%state COMENT_SIMPLE
%state COMENT_MULTI
%state STRNG

%%
/*-------------------------------------------------------------------
--------------------- 3ra. y ultima area: Reglas Lexicas
-------------------------------------------------------------------*/

//-------> Comentarios

<STRNG>{
    [\"] {  String temporal=cadena; cadena=""; yybegin(YYINITIAL);
        return new Symbol(Simbolos.cadena, yychar,yyline,temporal);   }
    [^\"] { cadena+=yytext(); }
}

<YYINITIAL> "/*"                {yybegin(COMENT_MULTI);}     // Si la entrada es un comentario inicia aqui
<COMENT_MULTI> "*/"             {yybegin(YYINITIAL);}        // Si se acaba el comentario vuelve a YYINITIAL
<COMENT_MULTI> .                {}
<COMENT_MULTI> [ \t\r\n\f]      {}

<YYINITIAL> "//"                {yybegin(COMENT_SIMPLE);}   // Si la entrada es comentario simple inicia aqui
<COMENT_SIMPLE> [^"\n"]         {}                          // 
<COMENT_SIMPLE> "\n"            {yybegin(YYINITIAL);}       // aqui sale del estado


//-------> Operadores Aritmeticos

<YYINITIAL> "+"         {   System.out.println("Reconocido: <<"+yytext()+">>, mas");
                            return new Symbol(Simbolos.mas, yycolumn, yyline, yytext());}

<YYINITIAL> "-"         {   System.out.println("Reconocido: <<"+yytext()+">>, menos");
                            return new Symbol(Simbolos.menos, yycolumn, yyline, yytext());}

<YYINITIAL> "*"         {   System.out.println("Reconocido: <<"+yytext()+">>, por");
                            return new Symbol(Simbolos.por, yycolumn, yyline, yytext());}

<YYINITIAL> "/"         {   System.out.println("Reconocido: <<"+yytext()+">>, dividir");
                            return new Symbol(Simbolos.dividir, yycolumn, yyline, yytext());}

<YYINITIAL> "("         {   System.out.println("Reconocido: <<"+yytext()+">>, apar");
                            return new Symbol(Simbolos.apar, yycolumn, yyline, yytext());}

<YYINITIAL> ")"         {   System.out.println("Reconocido: <<"+yytext()+">>, cpar");
                            return new Symbol(Simbolos.cpar, yycolumn, yyline, yytext());}

<YYINITIAL> ","         {   System.out.println("Reconocido: <<"+yytext()+">>, coma");
                            return new Symbol(Simbolos.coma, yycolumn, yyline, yytext());}


//-------> Reservadas, tipos de datos y del sistema

<YYINITIAL> "registros"       {   System.out.println("Reconocido: <<"+yytext()+">>, TokenRegistro");
                                return new Symbol(Simbolos.registros, yycolumn, yyline, yytext());}

<YYINITIAL> "claves"       {   System.out.println("Reconocido: <<"+yytext()+">>, TokenRegistro");
                                return new Symbol(Simbolos.claves, yycolumn, yyline, yytext());}

"\"" {yybegin(STRNG);}

<YYINITIAL> {numero}                  {   System.out.println("Reconocido: <<"+yytext()+">>, numero ");
                                return new Symbol(Simbolos.numero, yycolumn, yyline, yytext());}
<YYINITIAL> {id}                      {   System.out.println("Reconocido: <<"+yytext()+">>, id ");
                                return new Symbol(Simbolos.id, yycolumn, yyline, yytext());}




[ \t\r\n\f]                 {/* ignore white space. */ }
 
.                           {   System.out.println("Error Lexico: <<"+yytext()+">> ["+yyline+" , "+yycolumn+"]");
                                /*AcepErr datos =new AcepErr(yytext(),"ERROR LEXICO",(yyline+1),(yycolumn+1), "Simbolo no existe en el lenguaje");
                                    TablaErr.add(datos);*/

                            }

