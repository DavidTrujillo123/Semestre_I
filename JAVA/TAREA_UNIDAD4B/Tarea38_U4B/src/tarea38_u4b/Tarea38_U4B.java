/*Tarea 38.- 
Un observatorio astronómico requiere de un programa que analice una fotografía del cielo 
tomada por la noche. La información de la fotografía está almacenada en forma de tabla (A) de 
6 filas por 8 columnas, donde cada elemento representa la cantidad de luz que se registró para 
cada punto. Los valores registrados en la tabla únicamente van del 0 al 20, por ejemplo:

Cantidad de luz
   7  14   9   9   6   8   1   4
   7   2   8  12   7   6   2   9
   3   3   7   0   3   9   6   8
   2   8   6   8   1   7   0  14
   2   3  11   4   0   6   3   8
   4   1   3  14  14  11  12   4

La persona encargada de analizar la información supone que hay una estrella en (i, j) si: 
• El punto no se encuentra en las orillas de la fotografía; es decir, no se encuentra en 
la primera fila o columna ni en la última fila o columna.

• Si la suma de (A[i, j] + A[i - 1, j] + A[i + 1, j] + A[i, j - 1] + A[i, j + 1]) > 30 
Si se cumple con ambas condiciones, se debe de mostrar como resultado del análisis, una tabla 
(B) en donde aparecerá un “*” en el lugar, que, según las mediciones anteriores, existe una 
estrella. El resto de la tabla debe quedar lleno de espacios. La tabla B que resulta del ejemplo 
anterior es:

Posibles estrellas:
  1  2  3  4  5  6  7  8
1                        
2     *  *  *  *  *  .   
3     .  .  .  .  *  .   
4     .  *  .  .  .  .   
5     .  .  *  .  .  .   
6  

Conocido esto, se le solicita a usted que elabore una aplicación que permita: 
a) Leer los valores de cada elemento de la tabla A. 
b) Interprete los valores de la Tabla A y construya la Tabla B. 
c) Imprima la tabla A y B
 */
package tarea38_u4b;

import java.util.Random;
import java.util.Scanner;

public class Tarea38_U4B {

    public static int Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, 15);
    }
    public static void LlenarArreglo(int[][] A){
        Scanner entrada = new Scanner (System.in);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                //System.out.print("Pos: ("+i+","+j+")");
                A[i][j]=Aleatorio();
                //A[i][j]= entrada.nextInt();
            }
            //System.out.println("");
        }
    }
    public static void ComprobarEstrella(int [][] A){
        int suma;
        char[][] ubicacion = new char[A.length][A[0].length];
        
        for (int i = 1; i < A.length-1; i++) {
            for (int j = 1; j < A[0].length-1; j++) {
                suma = A[i][j]+A[i+1][j]+A[i-1][j]+A[i][j+1]+A[i][j-1];
                if (suma>30){
                   ubicacion[i][j]='*';
                }
                else ubicacion[i][j]='.';
            }
           suma=0;
        }
        ImprimirArreglo(ubicacion);
        
    }
    public static void ImprimirArreglo(int[] A){
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%4d",A[i]);
        }
    }
    public static void ImprimirArreglo(char [][] A){
        System.out.println("  1  2  3  4  5  6  7  8");
        for (int i = 0; i < A.length; i++) {
            System.out.print((i+1));
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3c",A[i][j]);
            }
            System.out.println("");
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
        m=6;
        n=8;
        int[][] matriz = new int[m][n];
        
        System.out.println("Cantidad de luz");
        LlenarArreglo(matriz);
        ImprimirArreglo(matriz);
        System.out.println("");
        
        System.out.println("Posibles estrellas:");
        ComprobarEstrella(matriz);
    }
}
