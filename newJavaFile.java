
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hugog
 */
public class newJavaFile {

   /**
     * Funcion que muestra un mensaje de bienvenida al juego.
     */
    
      static int solucion;  
    static int nrond;
    static int njug;
    static int numOpr1;
    static int numOpr2;
    static int numOpr3;
    static int numOpr4;
    static int num1;
    static int num2;
    static int num3;
    static int num4;
    static int num5;
    static String opRandom = "+";
    static String opRandom1 = "+";
    static String opRandom2 = "+";
    static String opRandom3 = "+";
    static String s;
    static String s2;
    static String s3;
    static String s4;
    static String s5;
    static int sol;
    static String expMatArray[] = new String[9];
    
    public static void iniciarConcurso() {
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("    ¡~¡~¡~¡~¡  BIENVENIDOS AL CONCURSO !~!~!~!~!");          
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    }
    
    /**
     * Función que comprueba si el nº de jugadores introducido es válido.
     */
    public static void njugNoValido(){
          Scanner sc = new Scanner(System.in);
          for(int o = 0; o < njug; o++){
           if (njug  > 6){
            System.out.println("EL Nº DE JUGADORES DEBE SER ENTRE 1 Y 6, INTENTELO DE NUEVO");
            njug = sc.nextInt();
        }else if (njug < 1){
           System.out.println("EL Nº DE JUGADORES DEBE SER ENTRE 1 Y 6, INTENTELO DE NUEVO");
            njug = sc.nextInt(); 
        }      
        }
    }
    
    /**
     * Funcion que comprueba si el nº de rondas introducido es válido.
     */
    public static void nrondNoValido(){
     Scanner sc = new Scanner(System.in);
     for (int o = 0; o < 1000; o++){
         if (nrond < 3 || nrond > 20 || nrond == 1|| nrond == 2|| nrond == 4|| nrond == 6|| nrond == 7|| nrond == 8|| nrond == 9|| nrond == 11|| nrond == 12|| nrond == 13|| nrond == 14|| nrond == 15|| nrond == 16|| nrond == 17|| nrond == 18|| nrond == 19 ){
             System.out.println("Nº DE RONDAS NO V�?LIDO, INTENTELO DE NUEVO");
             nrond = sc.nextInt();
        }
        }
    }
    
    /**
     * Funcion que devuelve una pregunta aleatoria.
     * @return devuelve la pregunta aleatoria
     */
    public static String pregunta() {
        /*LAS CUATRO PRIMERAS VAN A GENERAR NºS ALEATORIOS DEL 1 AL 3
        QUE SERAN SUSTITUIDOS POR +,-,* CON UN SWITCH.*/
         //numOpr1 = (int)(1 + Math.random() * (3 - 1 + 1));
         //numOpr2 = (int)(1 + Math.random() * (3 - 1 + 1));
         //numOpr3 = (int)(1 + Math.random() * (3 - 1 + 1));    
         //numOpr4 = (int)(1 + Math.random() * (3 - 1 + 1)); 
         
         numOpr1 = 1;
         numOpr2 = 1;
         numOpr3 = 1;
         numOpr4 = 1;
         
        /*GENERAN UN NUMERO ENTRE 2 Y 12 QUE SE USARA EN LA OPERACION*/
         num1 = (int)(2 + Math.random() * (12 - 2 + 1));     
         num2 = (int)(2 + Math.random() * (12 - 2 + 1));
         num3 = (int)(2 + Math.random() * (12 - 2 + 1));
         num4 = (int)(2 + Math.random() * (12 - 2 + 1));
         num5 = (int)(2 + Math.random() * (12 - 2 + 1));
        /*INICIALIZAMOS LA VARIABLE QUE NOS VA A AYUDAR 
        A CAMBIAR NUMEROS POR SIMBOLOS*/  
        /*LOS SWITCH CAMBIAN 1 POR "+", 2 POR "-" Y 3 POR "*" */
        switch (numOpr1) 
        {
            case 1:  opRandom = "+";
                     break;
            case 2:  opRandom = "-";
                     break;
            case 3:  opRandom = "*";
                     break;             
        }
        opRandom1 = "+"; 
        switch (numOpr2) 
        {
            case 1:  opRandom1 = "+";
                     break;
            case 2:  opRandom1 = "-";
                     break;
            case 3:  opRandom1 = "*";
                     break;             
        }
        opRandom2 = "+"; 
        switch (numOpr3) 
        {
            case 1:  opRandom2 = "+";
                     break;
            case 2:  opRandom2 = "-";
                     break;
            case 3:  opRandom2 = "*";
                     break;             
        }
        opRandom3 = "+"; 
        switch (numOpr4) 
        {
            case 1:  opRandom3 = "+";
                     break;
            case 2:  opRandom3 = "-";
                     break;         
            case 3:  opRandom3 = "*";
                     break;             
        }
        /*MUESTRA LA OPERACION POR PANTALLA (NUM1,2... SON LOS NºS
        Y OPRANDOM1,2... SON LOS OPERADORES*/
            System.out.println(num1 + opRandom + num2 + opRandom1 + num3 + opRandom2 + num4 + opRandom3 + num5);
            s=String.valueOf(num1);
            s2=String.valueOf(num2);
            s3=String.valueOf(num3);
            s4=String.valueOf(num4);
            s5=String.valueOf(num5);

            String numRandom = num1 + opRandom + num2 + opRandom1 + num3 + opRandom2 + num4 + opRandom3 + num5;
            expMatArray[0] = s;
            expMatArray[1] = opRandom;
            expMatArray[2] = s2;
            expMatArray[3] = opRandom1;
            expMatArray[4] = s3;
            expMatArray[5] = opRandom2;
            expMatArray[6] = s4;
            expMatArray[7] = opRandom3;
            expMatArray[8] = s5;  
            
           return numRandom;
    }    

    /**
     * 
     * @param exp es el array de Strings que contiene la expresión
     * @return devuelve el resultado de la expresión
     */
    public static int evaluarExpresionArray (String [] exp) {

            int valor = 0;
            String [] expRed = new String [exp.length];
            expRed = Arrays.copyOf(exp, exp.length);

            for (int i=0; i<expRed.length; i++) {
                if (expRed[i] == "*") {
                    expRed[i+1] = multiplicar (expRed[i-1], expRed[i+1]);
                    expRed[i-1] = "0";
                    if (i-2>0 && expRed[i-2]=="-")
                        expRed[i] = "-";
                    else 
                        expRed[i] = "+";
                }
            }

            for (int i=0; i<expRed.length; i++) {
                
            }
            System.out.println ();

            String op = "";
            for (int i=0; i<expRed.length; i++) {
                if (i==0) {
                    valor = Integer.parseInt (expRed[i]);
                } else if (expRed[i] == "+") {
                    op = "suma";
                } else if (expRed[i] == "-") {
                    op = "resta";
                } else {
                    if (op == "suma") {
                        valor = valor + Integer.parseInt (expRed[i]);
                        op = "";
                    } else if (op == "resta") {
                        valor = valor - Integer.parseInt (expRed[i]);
                        op = "";
                    }
                }
            }
            return valor;
    }
    
    /**
     * 
     * @param num1 primer número que se va a multiplicar
     * @param num2 segundo número que se va a multiplicar
     * @return devuelve el resultado de la operación
     */
    private static String multiplicar (String num1, String num2) {
        int num1Int, num2Int, resInt;
        String resString;
        
        num1Int = Integer.parseInt (num1);
        num2Int = Integer.parseInt (num2);
        resInt = num1Int * num2Int;
        resString = Integer.toString (resInt);
        return resString;
        
        // También se podría poner en una sola línea:
        // Integer.toString (Integer.parseInt (num1) * Integer.parseInt (num2));
    }      
}