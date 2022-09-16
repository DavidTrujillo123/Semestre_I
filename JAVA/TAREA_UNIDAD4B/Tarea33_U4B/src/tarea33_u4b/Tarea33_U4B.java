/*Tarea 33.-
Definir y crear un arreglo de bidimensional cuadrado de (m x m - m filas x m columnas), llenar el 
arreglo e indicar si el arreglo representa una matriz simétrica o no.
 */
package tarea33_u4b;

import java.util.Random;

public class Tarea33_U4B {

    public static int Aleatorio() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, 10);
    }

    public static int[][] CrearArreglo(int m) {
        int[][] matriz = new int[m][m];
        return matriz;
    }

    public static void LlenarArreglo(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = Aleatorio();
            }
        }
    }

    public static boolean Comprobar(int[][] A) {
        boolean control = true;
        int a,b;
        a = 1;
        b = 0; 
        while(a<A.length){
            while(b<a){
                if(A[a][b] != A[b][a] && a!=b) control = false;
                b++;
            }
            b=0;
            a++;
        }
        return control;
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
        int m;
        m=4;
        int[][] matriz;
        matriz = CrearArreglo(m);
        
//        while(true){
//            LlenarArreglo(matriz);
//            if(Comprobar(matriz)) break;
//        } 
        LlenarArreglo(matriz);
        ImprimirArreglo(matriz);
        
        if(Comprobar(matriz)) System.out.println("Es Simetrica");
        else System.out.println("No es Simetrica");
    }
}
