/*Tarea 09.- Realizar una aplicación que me imprima todos los números primos en un 
rango entre inicio y fin.
 */
package tarea09_u3;

public class Tarea09_U3 {

    public static boolean Primo(int num) {
        int cont;
        cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont <= 2 && num != 1 && num != 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        int inicio;
        int fin;
        int aux;
        inicio = 10;
        fin = 20;

        if (fin < inicio) {
            aux = fin;
            fin = inicio;
            inicio = aux;
        }

        for (int i = inicio; i <= fin; i++) {
            if (Primo(i) == true) {
                System.out.println(i);
            }
        }

        System.out.println("");

        //while 
        int a;
        a = inicio;
        while (a <= fin) {
            if (Primo(a) == true) {
                System.out.println(a);
            }
            a++;
        }

    }

}
