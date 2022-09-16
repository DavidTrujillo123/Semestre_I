/*Tarea 04.- Realizar una aplicación que calcule la Potencia de un número base 
elevado a un exponente
  2^3 = 2*2*2 = 8
 */
package tarea04_u3;

public class Tarea04_U3 {

    public static void main(String[] args) {
        int basse;
        int exponente;
        int potencia;
        potencia = 1;
        basse = 5;
        exponente = 3;

        //for
        for (int i = 1; i <= exponente; i++) {
            potencia = basse * potencia;
        }
        System.out.println("La potecia de " + basse + "^" + exponente + " es " + potencia);

        //while
        int a;
        int potencia1;
        potencia1 = 1;
        a = 1;
        while (a <= exponente) {
            a++;
            potencia1 = basse * potencia1;

        }
        System.out.println("La potecia de " + basse + "^" + exponente + " es " + potencia1);

    }

}
