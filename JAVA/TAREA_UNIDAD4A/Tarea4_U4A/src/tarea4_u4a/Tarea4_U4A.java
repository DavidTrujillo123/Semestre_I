/*Tarea 04.-
Pedir por teclado el tamaño de un arreglo de números y pedir los valores numéricos con los que 
se rellena. Los valores no se pueden repetir. Mostrar el arreglo con los valores al final.
 */
package tarea4_u4a;

import java.util.Scanner;

public class Tarea4_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int tamaño;

        //System.out.println("Digite el tamaño del arreglo");
        //tamaño = entrada.nextInt();
        tamaño = 4;

        int[] num = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            num[i] = entrada.nextInt();

            for (int j = 0; j < i ; j++) {
                if (num[i] == num[j]) {
                    System.out.println("Error, no repita el número");
                    i--;
                }
            }
        }

        System.out.println("Su arreglo es: ");
        for(int i : num) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

}
