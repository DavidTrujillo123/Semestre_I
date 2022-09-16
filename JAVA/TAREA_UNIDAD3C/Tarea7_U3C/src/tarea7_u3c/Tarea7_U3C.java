/*Tarea 07:
Transforma la cadena de texto “seguimos programando...” a mayúsculas. Guarda el valor en la 
variable y posteriormente conviértela nuevamente a minúsculas.
 */
package tarea7_u3c;


public class Tarea7_U3C {

    
    public static void main(String[] args) {
        String txt;
        txt="seguimos programando...";
        txt = txt.toUpperCase();
        System.out.println(txt);
        
        txt= txt.toLowerCase();
        System.out.println(txt);
    }
    
}
