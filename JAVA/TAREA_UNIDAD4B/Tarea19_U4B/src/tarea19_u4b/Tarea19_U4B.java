/*Definir y crear un arreglo de bidimensional de (m x n - m filas x n columnas), llenar el arreglo 
con números secuenciales según los patrones definidos a continuación e imprimirlo en 
pantalla.
Arreglo 6x5
   1   2   3   4   5
  10   9   8   7   6
  11  12  13  14  15
  20  19  18  17  16
  21  22  23  24  25
  30  29  28  27  26
 */
package tarea19_u4b;

public class Tarea19_U4B {

    public static int[][] CrearArreglo(int m, int n) {
        int[][] matriz = new int[m][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[n];
        }
        return matriz;
    }

    public static void LlenarArreglo(int[][] A) {
        int cont;
        int a, b;
        cont = 1;
        a = 0;
        b = 0;
        while (a < A.length) {
            while (b < A[0].length) {
                A[a][b] = cont;
                cont++;
                b++;
            }
            if(a==A.length-1) break;
            
            b--;//b sobrepasa el valor de la logitud de la matriz por eso se resta
            a++;
            
            while (b >= 0) {
                A[a][b] = cont;
                b--;
                cont++;
            }
            b++;//b sale del ciclo con -1
            a++;
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
        int m,n;
        m=4;
        n=5;
        int [][] matriz;
        
        matriz = CrearArreglo(m, n);
        LlenarArreglo(matriz);
        System.out.println("Arreglo "+m+"x"+n);
        ImprimirArreglo(matriz);
    }

}
