/*Tarea 18.- Realizar una aplicación que me pida el orden de una pirámide y genere la 
siguiente salida. Ejm: orden 4
1
22
333
4444
 */
package tarea18_u3;

public class Tarea18_U3 {

    public static void main(String[] args) {
        int orden;
        int i;
        int cont;
        cont = 1;
        i= 1;
        orden = 5;
        
        for (; i<= orden; i++) {
            for (; cont <= i; cont++) {
                System.out.print(i);
            }
            cont = 1;
            System.out.println("");
        }
        
        /*
        while(i<=orden){
            while(cont <= i){
                System.out.print(i);
                cont++;
            }
            cont=1;
            i++;
            System.out.println("");
        }
        */
    } 
}
