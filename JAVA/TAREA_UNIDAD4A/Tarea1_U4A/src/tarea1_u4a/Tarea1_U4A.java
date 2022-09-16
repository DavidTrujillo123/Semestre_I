/*Tarea 01.-
Crear un arreglo de n posiciones y llenarlo con los múltiplos de un número en particular, imprimir 
su resultado.
 */
package tarea1_u4a;

public class Tarea1_U4A {

    public static void main(String[] args) {
        int n;
        int numero;
        int cont;
        cont = 0;

        numero = 10;
        n = 5;

        int[] multiplos = new int[n];

        System.out.println("El numero de elementos es: " + n);
        for (int i = 0; i < n; i++) {
            multiplos[i] = (i + 1) * numero;
        }

        System.out.println("Multiplos del " + numero);
        for (int i : multiplos) {
            cont++;
            System.out.println(cont + "*" + numero + "=" + i);
        }

    }

}
