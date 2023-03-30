/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente 
manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto 
de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a - @
e - #
i - $
o - %
u - *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author cmartinez
 */
public class MatLecEjer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
       Scanner leer = new Scanner(System.in);
       System.out.println("Por favor ingrese una frase: ");
       String palabra = leer.nextLine();

       System.out.println("la frase codificada es: "+codificacion(palabra) );
                   

    }
    public static String codificacion (String texto){
        String frase="";
        int tam=0;
        
        tam = texto.length();
        System.out.println("el tamaño es: " + tam);
        
        for (int i=0; i<tam; i++){
            String  letra = texto.substring(i,i+1);
            letra = letra.toLowerCase();
            
            switch (letra){
                case "a":
                    frase= frase+"@";
                    break;
                case "e":
                    frase= frase+"#";
                    break;
                case "i":
                    frase= frase+"$";
                    break;
                case "o":
                    frase= frase+"%";
                    break;
                case "u":
                    frase= frase+"*";
                    break;
                default:
                    frase= frase+texto.substring(i,i+1);
            }
                    
        }
        
        
        return frase;
    }
            
}
