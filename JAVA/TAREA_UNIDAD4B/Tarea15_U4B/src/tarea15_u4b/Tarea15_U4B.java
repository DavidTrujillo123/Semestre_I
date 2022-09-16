/*Tarea 15.-
Definir y crear un arreglo bidimensional de (m x n - m filas x n columnas), llenar el arreglo con 
números aleatorios, imprimirlo en pantalla e indicar el número de filas y columnas del arreglo 
bidimensional.
 */
package tarea15_u4b;

import java.util.Random;

public class Tarea15_U4B {

    public static int Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, 100);
    }
    public static int [][] CrearArreglo(int m, int n){
        int[][] matriz = new int[m][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i]= new int[n];
        }
        return matriz;
    }
    public static void LlenarArreglo(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j]=Aleatorio();
            }
        }
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
        int[][] matriz;
        m=5;
        n=5;
        matriz = CrearArreglo(m, n);
        LlenarArreglo(matriz);
        ImprimirArreglo(matriz);
        
    }
    
}
