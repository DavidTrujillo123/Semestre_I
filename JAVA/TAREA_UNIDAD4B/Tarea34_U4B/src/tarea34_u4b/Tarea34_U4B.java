/*Tarea 34.-
Definir y crear un arreglo bidimensional de (m x n - m filas x n columnas) que represente una 
matriz, llenar el arreglo con números aleatorios, crear otro arreglo dimensional para almacenar 
la transpuesta de la matriz inicial, imprimir en pantalla la matriz original y su transpuesta.

1   2   3
4   5   6
7   8   9

1   4   7
2   5   8   
3   6   9
 */
package tarea34_u4b;

import java.util.Random;

public class Tarea34_U4B {

    public static int Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, 100);
    }
    public static void LlenarArreglo(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j]=Aleatorio();
            }
        }
    }
    public static int[][] Transpuesta(int [][] A){
        int [][] B = new int[A[0].length][A.length];
        int a,b;
        a = 1;
        b = 0; 
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i][j]=A[j][i];
            }
        }
        return B;
    }
    public static void ImprimirArreglo(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%4d",A[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int m,n;
        m=3;
        n=3;
        
        int[][] matriz = new int[m][n];
        int[][] transpuesta;
        
        System.out.println("Matriz Inicial");
        LlenarArreglo(matriz);
        ImprimirArreglo(matriz);
        
        System.out.println("Matriz Transpuesta");
        transpuesta = Transpuesta(matriz);
        ImprimirArreglo(transpuesta);
    }
}
