/*Tarea 11.-
Suponga un array con N números enteros generados aleatoriamente y mostrados en pantalla, 
N debe ser un número impar, mostrar en pantalla el valor que ocupa el centro del array. 
 */
package tarea11_u4a;

import java.util.Scanner;

public class Tarea11_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int n1;
        int pos;

        System.out.print("Digite un numero de elementos impar: ");
        n = entrada.nextInt();

        if (n % 2 == 0)
        {
            n1 = n + 1;
            System.out.println("Se cambio los elementos a "+n1);
        }
        else n1 = n;

        pos = n1 / 2;

        int[] num;
        num = new int[n1];

        System.out.println();
        for (int i = 0; i < n1; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            num[i]= entrada.nextInt();
        }

        System.out.println("\nArreglo");
        for (int i : num) System.out.print(i + " ");
        System.out.println("");
        System.out.println("");
        System.out.println("Posicion centro: "+pos);
        System.out.println("Valor: "+num[pos]);
    } 
}
