/*Tarea 40.- 
Elabore una aplicación que, dado un número entero, positivo e impar, que representa el número 
de filas y columnas de una matriz, obtenga e imprima un cuadro mágico. Un cuadro mágico es 
una matriz cuadrada, de orden n, que contiene los números naturales consecutivos del 1 al n2 y 
donde la suma de cualquiera de las filas, columnas o diagonales principales debe ser la misma:

Cuadrado Magico de N = 3
   8   1   6
   3   5   7
   4   9   2

Cuadrado Magico de N = 5
  17  24   1   8  15
  23   5   7  14  16
   4   6  13  20  22
  10  12  19  21   3
  11  18  25   2   9

El algoritmo para crear un cuadro mágico consiste en: 
a) El número 1 se coloca en la casilla central de la primera fila. 

b) El siguiente número se coloca en la casilla correspondiente a la fila anterior y 
columna posterior. La fila anterior a la primera es la última y la columna posterior a 
la última es la primera. 

c) Si el número es un sucesor múltiplo de n, no aplica la regla b) sino que, se coloca el 
número en la casilla de la fila posterior y en la misma columna.

 */
package tarea40_u4b;

public class Tarea40_U4B {

    public static int[][] CuadradoMagico(int[][] matriz, int n) {
        int a;
        int b;
        int tamanio;
        int longitud;
        int medio;

        tamanio = n + 1;

        matriz = new int[tamanio][tamanio];

        longitud = matriz.length - 1;
        medio = longitud / 2;

        matriz[0][longitud] = -1;//fila 0 columna final
        b = medio;
        a = 1;

        int cont;
        cont = 1;
        while (cont <= longitud * longitud) {
            //la primera fila pasa al ultimo
            if (a == 0) {
                a = longitud;
            }
            //ultima columna pasa al inicio
            if (b == longitud) {
                b = 0;
            }

            matriz[a][b] = cont;

            a--;
            b++;

            //Compruba si esta lleno en esa posicion
            if (matriz[a][b] != 0) {
                a += 2;
                b--;
            }
            
            cont++;
        }
        
        return matriz;
    }
    public static void ImprimirArreglo(int [][] A){
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[0].length-1; j++) {
                System.out.printf("%4d",A[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n;
        n=7;//solamente impares
        int[][] matriz = new int[n][n];
        matriz = CuadradoMagico(matriz,n);
        System.out.println("Cuadrado Magico de N = "+n);
        ImprimirArreglo(matriz);
        
    }
}
