/*Tarea 01.- Imprimir los números en orden descendente del 10 a 1
 */
package tarea01_u3;

public class Tarea01_U3 {

    public static void main(String[] args) {

        // For
        System.out.println("For...");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Num: " + i);
        }

       System.out.println("");

        //while
        System.out.println("While...");
        int a;
        a = 10;

        while (a >= 1) {
           System.out.println("Num: " + a);
            a--;
        }
    }

}


