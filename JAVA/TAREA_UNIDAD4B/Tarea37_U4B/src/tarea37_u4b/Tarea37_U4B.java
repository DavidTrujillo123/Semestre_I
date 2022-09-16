/*Tarea 37.-
Haga una aplicación que calcule la suma del triángulo inferior más el triángulo superior de una 
matriz cuadrada de n X n (2 ≤ n ≤ 50), dejando el resultado en el triángulo inferior de otra matriz 
cuadrada de dimensión n X n. La matriz resultante tendrá 0 en la diagonal y en el triángulo 
superior. Por ejemplo, si la matriz que proporciona el usuario es:

  12  18  16  13
   3  14  18  13
   7   4  11   6
  13   8   4   1

   0   0   0   0
  21   0   0   0
  23  22   0   0
  26  21  10   0

 */
package tarea37_u4b;

import java.util.Random;


public class Tarea37_U4B {

    public static int Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, 20);
    }
    public static void LlenarArreglo(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j]=Aleatorio();
            }
        }
    }
    public static int [][] SumaTriangulos(int [][] A){
        int a,b;
        a = 1;
        b = 0; 
        while(a<A.length){
            while(b<a){
                if(a!=b){
                   A[a][b]= A[a][b]+A[b][a];
                }
                b++;
            }
            b=0;
            a++;
        }
        
        int aux,aux2;
        aux2=1;
        
        aux = A[0].length;
        for (int i = 0; i < A.length; i++) {
            for (int j = aux2; j < aux;j++) {
                A[i][j]=0;
            }
            aux2++;
        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if(i==j) A[i][j]=0;
            }
        }
        return A;
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
        int[][] matriz = new int[4][4];
        LlenarArreglo(matriz);
        ImprimirArreglo(matriz);
        System.out.println("");
        matriz = SumaTriangulos(matriz);
        ImprimirArreglo(matriz);
    }
}
