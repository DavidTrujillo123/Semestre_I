/*Tarea 06.- Imprimir los números pares e impares en un rango
 */
package tarea06_u3;

public class Tarea06_U3 {

    public static void main(String[] args) {
        int inicio;
        int fin;
        int aux;
        inicio = 10;
        fin = 15;

        if (fin < inicio) {
            aux = fin;
            fin = inicio;
            inicio = aux;
        }

        //for
        System.out.println("Pares");
        for (int i = inicio; i <= fin; i += 2) {
            System.out.println(i);
        }

        System.out.println("");

        System.out.println("Impares");
        for (int i = inicio + 1; i <= fin; i += 2) {
            System.out.println(i);
        }

        System.out.println("");

        //while
        int a;
        a = inicio;

        System.out.println("Pares");
        while (a <= fin) {
            System.out.println(a);
            a += 2;

        }

        System.out.println("");

        System.out.println("Impares");

        a = inicio + 1;
        while (a <= fin) {
            System.out.println(a);
            a += 2;
        }

    }

}
