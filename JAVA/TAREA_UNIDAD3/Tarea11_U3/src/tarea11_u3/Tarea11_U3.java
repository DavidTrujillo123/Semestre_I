/*Tarea 11.- Realizar un Método que me permita calcular la potencia de un número
y probar su funcionamiento
 */
package tarea11_u3;

public class Tarea11_U3 {

    public static double Potencia(int basse, int exponente) {
        int result;
        result = 1;

        //for
        for (int i = 1; i <= exponente; i++) {
            result = result * basse;
        }
        return result;

        //while
        /*int a;
        int result1;
        result1 = 1;
        a = 1;
        while (a <= exponente) {
            result1 = result1 * basse;
            a++;
        }
        return result1;
         */
    }

    public static void main(String[] args) {
        int basse;
        int exponente;

        basse = 5;
        exponente = 3;

        System.out.println(basse + "^" + exponente + "=" + Potencia(basse, exponente));

    }

}
