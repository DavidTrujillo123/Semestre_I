/*Tarea 03.-
Crear un arreglo de n posiciones y llenar un arreglo con números randomicos e imprimir un 
reporte solo con los números de las posiciones pares y otros reporte de los números de las 
posiciones impares.
 */
package tarea3_u4a;

import java.util.Random;

public class Tarea3_U4A {

    public static void main(String[] args) {
        int n; //posisiones
        n = 6;
        
        int[] num = new int[n];
        Random rnd = new Random();
        int random;
        
        for (int i = 0; i < n ; i++) {
            random = rnd.nextInt(1, 100);
            num[i] = random;
        }
        
        int cont;
        cont = 1;
        System.out.println("Arreglo completo");
        for(int i : num)
	{
	    System.out.println(cont + ".- " + i);
            cont++;
        }
        
        System.out.println("Arreglo posiciones impares");
        for (int i = 0; i < n; i += 2) {
            System.out.println((i + 1) + ".- " + num[i]);
        }
        
        System.out.println("Arreglo posiciones pares");
        for (int i = 1; i < n ; i += 2) {
            System.out.println((i + 1) + ".- " + num[i]);
        }

    }

}
