/*Tarea 06:
Divide la cadena de texto “Si no duele, no te estas esforzando...” en dos partes “Si no duele,” y 
“no te estas esforzando…”. Para posteriormente concaténalas y mostrarlas de nuevo.
 */
package tarea6_u3c;


public class Tarea6_U3C {

    
    public static void main(String[] args) {
        String txt1, txt2, txt3;
        txt1="Si no duele, no te estas esforzando...";
        txt2= txt1.substring(0, 12);
        txt3= txt1.substring(12);
        System.out.println(txt2);
        System.out.println(txt3);
        System.out.println(txt2+txt3);
    }
    
}
