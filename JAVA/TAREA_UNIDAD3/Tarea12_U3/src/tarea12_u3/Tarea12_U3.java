/*Tarea 12.- Realizar un Método que me permita calcular la factorial de un 
número y probar su funcionamiento.
 */
package tarea12_u3;

public class Tarea12_U3 {

    static int Factorial(int num) {

        int fac;
        fac = 1;

        //for
        /*for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        return fac;
        */
        
        //while
        int a;
        int fac1;
        fac1 = 1;
        a = 1;

        while (a <= num) {
            fac1 = fac1 * a;
            a++;
        }

        return fac1;
        
    }

    public static void main(String[] args) {
        int num;
        num = 5;

        System.out.println(num + "!= " + Factorial(num));

    }

}


