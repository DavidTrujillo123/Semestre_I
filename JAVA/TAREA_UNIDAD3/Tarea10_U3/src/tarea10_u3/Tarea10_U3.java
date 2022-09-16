/*Tares 10.- Realizar una aplicación que me imprima las letras del alfabeto en 
mayúsculas y minúsculas.
 */
package tarea10_u3;

public class Tarea10_U3 {

    public static void main(String[] args) {
        char min;
        char may;

        for (int i = 0; i <= 25; i++) {
            min = (char) ('a' + i);
            System.out.println(min);
            may = (char) ('A' + i);
            System.out.println(may);
        }

        System.out.println("");
        int aux;
        char min1;
        char may1;
        aux = 0;

        while (aux <= 25) {
            min1 = (char) ('a' + aux);
            System.out.println(min1);
            may1 = (char) ('A' + aux);
            System.out.println(may1);
            aux++;
        }

    }

}
