/*Tarea 02.- Imprimir los números en orden ascendente y descendente en un rango 
entre inicio y fin
 */
package tarea02_u3;


public class Tarea02_U3 {

    public static void main(String[] args) {
        int inicio;
        int fin;
        int aux;
        inicio = 10;
        fin = 15;

        if (fin < inicio) {
            aux = inicio;
            inicio = fin;
            fin = aux;
        }

        //for
        System.out.println("For...");
        System.out.println("Incremento");

        for (int i = inicio; i <= fin; i++) {
            System.out.print(i+" ");

        }

        System.out.println("");

        System.out.println("Decremento");

        for (int i = fin; i >= inicio; i--) {
            System.out.print(i+" ");

        }

        System.out.println("");

        //while
        int a;
        a = inicio;
        System.out.println("");
         System.out.println("While...");
        System.out.println("Incremento");
        while (a <= fin) {
            System.out.print(a+" ");
            a++;
        }

        System.out.println("");
        System.out.println("Decremento");
        a = fin;
        while (a >= inicio) {
            System.out.print(a+" ");
            a--;
        }
        System.out.println("");
    }

}
