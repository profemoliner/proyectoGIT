package ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Leer {
 
	
    @SuppressWarnings("finally")
	public static String pedirCadena()
    {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
        String cadenaLeida = "fallo";
        try{
            cadenaLeida=teclado.readLine();
        }
        catch (IOException e){
        	System.out.println("... ERROR FATAL en pedirCadena, SALIMOS DEL PROGRAMA ...");
            System.exit(0);
        }
        finally{
            return cadenaLeida;
        }
    }
    
    public static int pedirEntero()
    {
        String cadena;
        int num = 0;
        boolean correcto=false;
        do{
            cadena = pedirCadena();
            try{
                num = Integer.parseInt(cadena);
                correcto = true;
            }
            catch (NumberFormatException e){
            	System.out.println("El valor para int no es correcto !!!");
                System.out.println("Introduzca un int de nuevo: ");
            }
        }while (correcto == false);
        
        return num;
    } // ***** Fin pedirEntero() *****
    
    public static float pedirFloat()
    {
        String cadena;
        float num = 0;
        boolean correcto = false;
        do{
            cadena = pedirCadena();
            try {
                num = Float.parseFloat(cadena);
                correcto = true;
            }
            catch (NumberFormatException e){
            	System.out.println("El valor para float no es correcto !!!");
                System.out.println("Introduzca un float de nuevo: ");
            }
        }while (correcto == false);
        
        return num;
    } // ***** Fin pedirFloat() *****
    
    @SuppressWarnings("finally")
	public static char pedirCaracter()
    {
        char cLeido = ' ';
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
         try{
            cLeido = (char)teclado.read();
        }
        catch (IOException e){
            System.out.println("... ERROR FATAL en pedirCaracter, SALIMOS DEL PROGRAMA ...");
            System.exit(0);
        }
        finally{
            return cLeido;
        }
        
    } // ***** Fin pedirCaracter() *****
    
    public static long pedirLong()
    {
        String cadena;
        long num = 0;
        boolean correcto = false;
        do{
            cadena = pedirCadena();
            try {
                num = Long.parseLong(cadena);
                correcto = true;
            }
            catch (NumberFormatException e){
                System.out.println("El valor para long no es correcto !!!");
                System.out.println("Introduzca un long de nuevo: ");
            }
        }while (correcto == false);
        
        return num;
        
    } // ***** Fin pedirEntero() *****
    
    public static double pedirDouble()
    {
        String cadena;
        double num = 0;
        boolean correcto = false;
        do
        {
            cadena = pedirCadena();
            try {
                num = Double.parseDouble(cadena);
                correcto = true;
            }
            catch (NumberFormatException e)
            {
            	System.out.println("El valor para double no es correcto !!!");
                System.out.println("Introduzca un double de nuevo: ");
            }
        }while (correcto == false);
        
        return num;
        
    } // ***** Fin pedirFloat() *****
    
}
