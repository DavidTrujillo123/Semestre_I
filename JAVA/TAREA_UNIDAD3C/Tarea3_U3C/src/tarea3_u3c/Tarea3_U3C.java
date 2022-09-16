/*Tarea 03:
Invertir el texto: “Anita lava la tina”
 */
package tarea3_u3c;

public class Tarea3_U3C {

   
    public static void main(String[] args) {
        String txt;
        txt="Anita lava la tina";
        
        for(int i=txt.length()-1; i>=0; i--){
            System.out.print(txt.charAt(i));
        }
        System.out.println("");
    }
    
}
