/*Tarea 05.- Imprimir las potencias de 2 de los números de un rango definido
 */
package tarea05_u3;

public class Tarea05_U3 {

    public static void main(String[] args) {
        int inicio;
        int fin;
        int aux;
        inicio = 15;
        fin = 10;

        if (fin < inicio) {
            aux = fin;
            fin = inicio;
            inicio = aux;
        }

        //for
        for (int i = inicio; i <= fin; i++) {
            System.out.println(i + "*" + i + "=" + i * i);

        }

        System.out.println("");

        //while
        int a;
        a = inicio;

        while (a <= fin) {
            System.out.println(a + "*" + a + "=" + a * a);
            a++;

        }

    }

}
