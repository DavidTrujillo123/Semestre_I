/*Tarea 18.-
Definir y crear un arreglo bidimensional de (m x n - m filas x n columnas), llenar el arreglo con 
números secuenciales por columnas empezando en la posición correspondiente a la última fila 
y columna e imprimirlo en pantalla.
 */
package tarea18_u4b;

public class Tarea18_U4B {

    public static int[][] CrearArreglo(int m, int n) {
        int[][] matriz = new int[m][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[n];
        }
        return matriz;
    }
    public static void LlenarArreglo(int[][] A) {
        int cont;
        cont = 1;
        for (int j = A[0].length - 1; j >= 0; j--) {
            for (int i = A.length - 1; i >= 0; i--) {
                A[i][j] = cont;
                cont++;
            }
        }
    }
    public static void ImprimirArreglo(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int m, n;
        m = 3;
        n = 4;
        int[][] matriz;
        matriz = CrearArreglo(m, n);

        LlenarArreglo(matriz);
        System.out.println("Arreglo de " + m + "x" + n);
        ImprimirArreglo(matriz);
    }

}
