/*Tarea 03.- Realizar una aplicación que calcule el Factorial de un número
  Factorial:
	5!=1*2*3*4*5 = 120
 */
package tarea03_u3;

public class Tarea03_U3 {

    public static void main(String[] args) {
        int num;
        int factorial;
        factorial = 1;
        num = 5;

        //for
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(num + "!= " + factorial);

        System.out.println("");

        //while
        int a;
        int factorial1;
        factorial1 = 1;
        a = 1;

        while (a <= num) {
            factorial1 = factorial1 * a;
            a++;
        }
        System.out.println(num + "!= " + factorial1);

    }

}
