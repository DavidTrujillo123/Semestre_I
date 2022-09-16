/*Tarea 11:
Escribir un método, que dado un objeto de la clase String cuente diferentes tipos de caracteres. 
En particular, el método deberá imprimir el número de letras, dígitos y espacios en blanco de la 
cadena. Intenta hacer un programa que escriba el conteo (por ejemplo) de la cadena. “Hola, soy 
<<Aquí tu nombre>>, y soy programador desde el 2021...”.
 */
package tarea11_u3c;

/**
 *
 * @author Usuario
 */
public class Tarea11_U3C {

    public static String ContarCaracteres(String ejemplo){
        char caracteres;
        int contEspacios, contDigitos, contLetras;
        contEspacios=0;
        contDigitos=0;
        contLetras=0;
        
        for(int i=0; i<=ejemplo.length()-1;i++){
            caracteres=ejemplo.charAt(i);
            if(Character.isSpaceChar(caracteres)) contEspacios++;
            else if(Character.isDigit(caracteres)) contDigitos++;
            else if(Character.isLetter(caracteres))contLetras++;
        }
        return "Espacios ->"+contEspacios+"\n"
                + "Digitos ->"+contDigitos+"\n"
                + "Letras ->"+contLetras;
    }
    public static void main(String[] args) {
        System.out.println(ContarCaracteres("Hola, soy David, y soy programador desde el 2021..."));
        
    }
    
}
