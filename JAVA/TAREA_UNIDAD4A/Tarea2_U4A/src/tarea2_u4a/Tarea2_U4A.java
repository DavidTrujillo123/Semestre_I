/*Tarea 02.-
Crear un arreglo de n posiciones y llenarlo con los múltiplos de un número en particular, imprimir 
su resultado de forma inversa a como fue llenado.
 */
package tarea2_u4a;

public class Tarea2_U4A {

    public static void main(String[] args) {
        int n;
        int numero;
        int cont;

        numero = 2;
        n = 6;
        cont = n;

        int[] multiplos = new int[n];

        System.out.println("El numero de elementos es: " + n);

        for (int i = 0; i < n ; i++) {
            multiplos[i] = (i + 1) * numero;
        }
        
        System.out.println("Multiplos");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(cont + "*" + numero + "=" + multiplos[i]);
            cont--;
        }

    }

}
