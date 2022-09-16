/*Tarea 08.- Realizar una aplicación que me imprima si un número es Primo o no.
 */
package tarea08_u3;

public class Tarea08_U3 {

    public static void main(String[] args) {
        int num;
        int cont;
        cont = 0;
        num = 11;

        //for
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont <= 2 && num != 1 & num != 0) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }

        System.out.println("");

        //while
        int a;
        cont = 0;
        a = 1;

        while (a <= num) {
            if (num % a == 0) {
                cont++;
            }
            a++;
        }
        if (cont <= 2 && num != 1 & num != 0) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }

    }

}
