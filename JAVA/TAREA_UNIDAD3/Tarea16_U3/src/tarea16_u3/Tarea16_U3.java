/*Tarea 16.- Realizar una aplicación que me pida el orden de un cuadrado y lo imprima 
realizado con el carácter ‘@’
@@@@
@@@@
@@@@
@@@@
 */
package tarea16_u3;


public class Tarea16_U3 {

   
    public static void main(String[] args) {
       
        int orden;
        orden = 3;
        
        /*for(int i = 1; i<= orden ; i++){
            for (int a = 1; a <= orden ; a++ ){
                System.out.print("@");
            }
            System.out.println("");    
        }
        */
        int i;
        int a;
        i = 1;
        a = 1;
        
        while(i <= orden){
            while (a <= orden){
                System.out.print("@");
                a++;
            }
            a=1;
            System.out.println("");
            i++;
        }
        
    }
    
}
