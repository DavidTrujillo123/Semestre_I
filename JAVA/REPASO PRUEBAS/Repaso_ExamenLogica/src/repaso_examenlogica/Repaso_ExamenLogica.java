/*
 */
package repaso_examenlogica;

import java.util.Random;


public class Repaso_ExamenLogica {

    public static int Aleatorio(int inicio, int fin){
        int aux;
        if(fin< inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        Random aleatorio = new Random();
        return aleatorio.nextInt(inicio, fin+1);
    }
    public static void LlenarArreglo(int [][] A, int inicio, int fin){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j]= Aleatorio(inicio, fin);
            }
        }
    }
    public static int [] SumaColumna(int [][] A){
        int suma = 0;
        int [] columna = new int[A[0].length];
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                suma = suma + A[j][i];
            }
            columna[i]= suma;
            suma = 0;
        }
        return  columna;
    }
    public static int [] SumaFilas(int [][] A){
        int suma = 0;
        int [] fila = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                suma = suma + A[i][j];
            }
            fila[i]= suma;
            suma = 0;
        }
        return  fila;
    }
    public static void ImprimirArreglo(int [] A){
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%4d", A[i]); 
        }
        System.out.println("");
    }
    public static void ImprimirArreglo(int [][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.printf("%4d", A[i][j]); 
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int inicio = 1;
        int fin = 5;
        int[][] A = new int[m][n];
        int[] columna;
        int[] fila;
        
        LlenarArreglo(A, inicio, fin);
        ImprimirArreglo(A);
        System.out.println("Suma columnas");
        columna = SumaColumna(A);
        ImprimirArreglo(columna);
        System.out.println("");
        fila = SumaFilas(A);
        System.out.println("Suma filas");
        ImprimirArreglo(fila);
        System.out.println("");
        
        if(m==n){
            int[] principal = new int[m];
            for (int i = 0; i < A.length; i++) {
                principal[i]=A[i][i];
            }
            System.out.println("Diagonal principal");
            ImprimirArreglo(principal);
            System.out.println("");
            
            int[] seculdaria = new int[m];
            int x = 0;
            int y = n-1;
            while(x< A.length){
                seculdaria[x]=A[x][y];
                x++;
                y--;
            }
            System.out.println("Diagonal secundaria");
            ImprimirArreglo(seculdaria);
            System.out.println("");
        }
    }
    
}
