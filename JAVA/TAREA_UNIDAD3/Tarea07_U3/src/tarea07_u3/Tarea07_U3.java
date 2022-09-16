/*Tarea 07.- Imprimir la serie de Fibonacci dado un límite máximo
  0,1,1,2,3,5,8......
 */
package tarea07_u3;

public class Tarea07_U3 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int lim;

        a = 0;
        b = 1;
        lim = 8;

        //for
        for (int i = 1; i <= lim; i++) {
            System.out.println(i + ".- " + a);
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("");
        //while
        a = 0;
        b = 1;
        int aux;
        aux = 1;
        while (aux <= lim) {
            System.out.println(aux + ".- " + a);
            c = a + b;
            a = b;
            b = c;
            aux++;
        }

    }

}
