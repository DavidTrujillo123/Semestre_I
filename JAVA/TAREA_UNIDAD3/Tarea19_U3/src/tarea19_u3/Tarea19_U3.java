/* Tarea 19.- Realizar una aplicación que me pida el orden de una pirámide y genere la 
siguiente salida. Ejm: orden 4
1
12
123
1234
 */
package tarea19_u3;

public class Tarea19_U3 {
    
    
    public static void main(String[] args) {
        int orden;
        int i;
        int cont;
        
        orden = 4;
        
        cont = 1;
        i= 1;
        
        for (; i<= orden; i++) {
            for (; cont <= i; cont++) {
                System.out.print(cont);
            }
            cont = 1;
            System.out.println("");
        }
        
        /*while(i<=orden){
            while(cont <= i){
                System.out.print(cont);
                cont++;
            }
            cont=1;
            i++;
            System.out.println("");
        }
        */
        
    } 
}
