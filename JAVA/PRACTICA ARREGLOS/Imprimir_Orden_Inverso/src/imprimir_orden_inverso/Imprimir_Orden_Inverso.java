/*Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el 
siguiente orden: el primero, el último, el segundo, el penúltimo....

 */
package imprimir_orden_inverso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Imprimir_Orden_Inverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] num = new int [10];
        
        for(int i=0; i<10 ; i++){
            System.out.print((i+1)+". Digite un numero: ");
            num[i]=entrada.nextInt();
        }
        System.out.println("");
        int aux;
        aux=9;
        for(int i=0; i<5 ; i++){
            System.out.print(num[i]+" ");
            System.out.print(num[aux]+" ");
            aux--;
        }
        
    }
    
}
