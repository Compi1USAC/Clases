
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java.util.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class analisis_sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public analisis_sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public analisis_sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public analisis_sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\002\004\000\002\003\003\000\002\005" +
    "\004\000\002\005\003\000\002\005\004\000\002\006\004" +
    "\000\002\006\004\000\002\004\005\000\002\004\003\000" +
    "\002\002\005\000\002\002\005\000\002\002\005\000\002" +
    "\002\005\000\002\002\004\000\002\002\005\000\002\002" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\014\003\014\004\010\011\012\014\005\015" +
    "\013\001\002\000\014\002\000\004\010\011\012\014\005" +
    "\015\013\001\002\000\006\006\ufff9\007\ufff9\001\002\000" +
    "\014\002\ufffe\004\ufffe\011\ufffe\014\ufffe\015\ufffe\001\002" +
    "\000\006\006\034\007\035\001\002\000\010\004\010\011" +
    "\012\015\013\001\002\000\004\002\031\001\002\000\010" +
    "\004\010\011\012\015\013\001\002\000\016\005\ufff2\007" +
    "\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2\001\002\000\004" +
    "\007\027\001\002\000\014\007\022\010\020\011\021\012" +
    "\016\013\017\001\002\000\010\004\010\011\012\015\013" +
    "\001\002\000\010\004\010\011\012\015\013\001\002\000" +
    "\010\004\010\011\012\015\013\001\002\000\010\004\010" +
    "\011\012\015\013\001\002\000\014\002\ufffc\004\ufffc\011" +
    "\ufffc\014\ufffc\015\ufffc\001\002\000\016\005\ufff7\007\ufff7" +
    "\010\ufff7\011\ufff7\012\016\013\017\001\002\000\016\005" +
    "\ufff8\007\ufff8\010\ufff8\011\ufff8\012\016\013\017\001\002" +
    "\000\016\005\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\013" +
    "\ufff5\001\002\000\016\005\ufff6\007\ufff6\010\ufff6\011\ufff6" +
    "\012\ufff6\013\ufff6\001\002\000\014\002\ufffd\004\ufffd\011" +
    "\ufffd\014\ufffd\015\ufffd\001\002\000\016\005\ufff4\007\ufff4" +
    "\010\ufff4\011\ufff4\012\016\013\017\001\002\000\004\002" +
    "\001\001\002\000\014\005\033\010\020\011\021\012\016" +
    "\013\017\001\002\000\016\005\ufff3\007\ufff3\010\ufff3\011" +
    "\ufff3\012\ufff3\013\ufff3\001\002\000\004\014\036\001\002" +
    "\000\014\002\ufffb\004\ufffb\011\ufffb\014\ufffb\015\ufffb\001" +
    "\002\000\006\006\ufffa\007\ufffa\001\002\000\014\002\uffff" +
    "\004\uffff\011\uffff\014\uffff\015\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\014\002\014\003\010\004\006\005\003\006" +
    "\005\001\001\000\010\002\014\004\006\006\036\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\002\031\001\001\000\002\001\001\000\004\002\027" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\002\025\001\001\000\004\002\024\001\001" +
    "\000\004\002\023\001\001\000\004\002\022\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$analisis_sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$analisis_sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$analisis_sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  
    /*public static LinkedList<AcepErr> TablaErr=new LinkedList<AcepErr>();*/

    public String resultado = "";
    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico Recuperado !!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);
       
        //lista_errores.add(new ErrorT(lexema, fila, columna,"sintactico" ,"Simbolo no esperado"));
        /*AcepErr datos =new AcepErr(lexema, "ERROR SINTACTICO" ,fila,columna,"Simbolo no esperado");
            TablaErr.add(datos);
            */
    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico, Panic Mode !!!!!!! ");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

       /*AcepErr datos =new AcepErr(lexema, "ERROR SINTACTICO" ,fila,columna,"Simbolo no esperado Error Fatal");
                   TablaErr.add(datos);
                  */
        //lista_errores.add(new ErrorT(lexema, fila, columna,"sintactico" ,"Simbolo no esperado, Panic Mode"));
    }

    public void semantic(Symbol cur_token, String n) 
    {
        System.out.println("error semantico ");
    }

    public void semantic(String msg, Object obj) {}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$analisis_sintactico$actions {


//METODOS Y VARIABLES QUE SOLO PUEDEN SER ACCEDIDAS DENTRO DEL PARSER
int exponente(int exp){
    int resultado= 1;
    for(int i=1; i<exp; i++){
        resultado = resultado *2;
    }
    return resultado;
}


  private final analisis_sintactico parser;

  /** Constructor */
  CUP$analisis_sintactico$actions(analisis_sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action_part00000000(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$analisis_sintactico$result;

      /* select the action based on the action number */
      switch (CUP$analisis_sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		RESULT = start_val;
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$analisis_sintactico$parser.done_parsing();
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= LISTADECLARACION 
            {
              String RESULT =null;
		int lsleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int lsright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		LinkedList<String> ls = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
            String temp = "";
            for(int i = 0; i < ls.size(); i++){
                temp = temp + String.valueOf(ls.get(i)) + "\n";
            }
            System.out.println("SALIDA: "+temp); 
            resultado = temp;
        
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LISTADECLARACION ::= LISTADECLARACION DECLARACION 
            {
              LinkedList<String> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		LinkedList<String> a = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
                    a.add(b);
                    RESULT = a;
                
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("LISTADECLARACION",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LISTADECLARACION ::= DECLARACION 
            {
              LinkedList<String> RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
                    RESULT = new LinkedList<String>(); 
                    RESULT.add(b);
                
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("LISTADECLARACION",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LISTADECLARACION ::= error puntoComa 
            {
              LinkedList<String> RESULT =null;
		
                    System.out.println("Implementar una recuperacion");
                
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("LISTADECLARACION",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DECLARACION ::= E puntoComa 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		 
                // Lo casteo porque el tipo de E es Double
                RESULT = String.valueOf(a);
            
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DECLARACION ::= LISTAID puntoComa 
            {
              String RESULT =null;
		int listaleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int listaright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		LinkedList<String> lista = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		 
                String temp = "";
                for(int i = 0; i < lista.size(); i++){
                    temp += String.valueOf(lista.get(i)) + "\n";
                }
                RESULT = temp;
            
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LISTAID ::= LISTAID coma id 
            {
              LinkedList<String> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		LinkedList<String> l = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
            l.add(a);
            RESULT = l;
        
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("LISTAID",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LISTAID ::= id 
            {
              LinkedList<String> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
            LinkedList<String> lista = new LinkedList<String>(); 
            lista.add(a);
            RESULT = lista;
         
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("LISTAID",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // E ::= E mas E 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
        RESULT= a+b;
    
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // E ::= E menos E 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
        RESULT= a-b;
    
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E ::= E por E 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
        RESULT= a*b;
    
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E ::= E dividir E 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
        RESULT= a/b;
    
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E ::= menos E 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
        RESULT = -a;
    
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E ::= apar E cpar 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		
        RESULT=a;
    
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // E ::= numero 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		
        RESULT=Double.parseDouble((String)a);
    
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$analisis_sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
              return CUP$analisis_sintactico$do_action_part00000000(
                               CUP$analisis_sintactico$act_num,
                               CUP$analisis_sintactico$parser,
                               CUP$analisis_sintactico$stack,
                               CUP$analisis_sintactico$top);
    }
}

}
