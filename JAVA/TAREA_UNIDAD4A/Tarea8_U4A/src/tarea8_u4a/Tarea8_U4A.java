/*Tarea 08.-
Crear una aplicación que me cree un arreglo unidimensional y que me vaya ingresando 
números por teclado y los almacene en el arreglo de forma ordenada ascendente. 
 */
package tarea8_u4a;

import java.util.Scanner;

public class Tarea8_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int pos, j;
        int aux;
        int cont;
        cont = 0;
        j = 0;
        n = 6;
        int[] num = new int[n];
        int[] num_original = new int[n];

        //Ordena los numeros en forma ascendente
        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            num[i] = entrada.nextInt();
            num_original[i] = num[i];
            pos = i;

            while (pos != 0 && j < i) {
                if (num[pos] < num[pos - 1]) {
                    aux = num[pos];
                    num[pos] = num[pos - 1];
                    num[pos - 1] = aux;
                    pos--;
                }
                j++;
            }
            j = 0;
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) cont++;
        }

        //Desplaza los ceros al final
        j = 1;
        while (j <= cont) {
            for (int i = 0; i < num.length; i++) {
                pos = i;
                while (num[i] == 0 && pos < num.length - 1) {
                    aux = num[pos];
                    num[pos] = num[pos + 1];
                    num[pos + 1] = aux;
                    pos++;
                }
            }
            j++;
        }

        System.out.println("\nArreglo original: ");
        for (int i : num_original) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("\nArreglo ordenado: ");
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
