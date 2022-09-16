/*Tarea 17.- Realizar una aplicación que genere la siguiente salida pidiendo el 
orden de la figura
@@@@
@@@
@@
@
 */
package tarea17_u3;

public class Tarea17_U3 {

    public static void main(String[] args) {
        
        int orden;
        orden = 4;
        
        /*for (int i = orden; i>=1 ; i--){
            for (int a = 1 ; a<=i ; a++){
                System.out.print("@");
            }   
            System.out.println("");
        }
        */
        
        int i;
        int cont;
        cont = 1;
        i=orden;
        while (i >= 1){
            while(cont <= i){
                System.out.print("@");
                cont++;
            }
            System.out.println("");
            cont =1;
            i--;
        } 
    }  
}
