/*Tarea 31.-
Definir y crear tres arreglos bidimensionales de (m x n - m filas x n columnas) de igual tamaño 
que representen matrices, llenar dos arreglos con números aleatorios y determinar la 
multiplicación de las matrices y almacenar el resultado en el tercer arreglo e imprimir las 
matrices originales y la matriz resultante de la multiplicación.

Multiplicacion de matrices
3x2       2x3
| |-> = <-| |
|           |
|--> 3x3 <--|

 */
package tarea31_u4b;

import java.util.Random;

public class Tarea31_U4B {

    public static int [][] CrearArreglo(int m, int n){
        int[][] matriz = new int[m][n];
        return matriz;
    }
    public static int Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, 11);
    }
    public static void LlenarArreglo(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j]=Aleatorio();
            }
        }
    }
    public static int [][] MultiplicaionDeMatrices(int[][]A,int [][]B) {
        int a;
        int suma;
        a=0;
        suma=0;
        int[][]C;
        C = CrearArreglo(A.length, B[0].length);
        for (int i = 0; i < A.length; i++) { 
            for (int j = 0; j < B[0].length; j++) {
                while(a<A[0].length){
                    suma = A[i][a]*B[a][j] + suma;
                    a++;
                }
                a=0;
                C[i][j]=suma;
                suma = 0;
            }
        }
        return C;
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
        int m,n,m1,n1;
        m=3;
        n=2;
        m1=n;
        n1=3;
        int[][] A,B;
        int[][] C;
        
        A = CrearArreglo(m,n);
        B = CrearArreglo(m1,n1);
        
        LlenarArreglo(A);
        LlenarArreglo(B);
     
        C=MultiplicaionDeMatrices(A, B);
        
        System.out.println("Representacion de matriz A "+m+"x"+n);
        ImprimirArreglo(A);
        System.out.println("");
        
        System.out.println("Representacion de matriz B "+m1+"x"+n1);
        ImprimirArreglo(B);
        System.out.println("");
        
        System.out.println("Representacion de matriz AxB "+m+"x"+n1);
        ImprimirArreglo(C);
    }
    
}
