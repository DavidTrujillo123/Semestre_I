/*Tarea 32.-
Sea M una matriz de enteros de “m” filas por “n” columnas, ambas positivas y menores que 10. 
Realice un programa que permita: 
a) Solicitar el ingreso de m y n, según las restricciones indicadas. 
b) Ingresar cada uno de los valores de la matriz. 
c) Mostrar, para cada fila, la suma de sus valores, y el menor valor almacenado. 
d) Mostrar, para cada columna, el promedio de sus valores y el mayor valor. 
e) El mayor valor almacenado en toda la Matriz, indicando en que fila y columna se 
encuentra
 */
package tarea32_u4b;

import java.util.Scanner;

public class Tarea32_U4B {
    
    public static int[][] CrearArreglo(int m, int n) {
        int[][] matriz = new int[m][n];
        return matriz;
    }
    public static void Comprobador(int m, int n){
        Scanner entrada = new Scanner(System.in);
        while(m>=10 || n>=10){
            System.out.println("");
            System.out.println("Error digite nuevamente, las filas o columnas no puedes pasar de 10");
            System.out.print("Digite un numero de filas: ");
            m = entrada.nextInt();
            
            System.out.println("");
            System.out.print("Digite un numero de columnas: ");
            n=entrada.nextInt();
        }
    }
    public static void LlenarMatriz(int [][] A){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println();
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Valor de la posicion ("+i+","+j+") ");
                A[i][j]= entrada.nextInt();   
            }
        }
    }
    public static void SumaFilasyMenor(int [][] A){
        int[] suma;
        int[] menor;
        int aux;
        aux = 9999;
        suma = new int[A.length];
        menor = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                suma[i] = A[i][j]+suma[i];
                if(A[i][j]<aux){
                    aux=A[i][j];
                }
                menor[i]=aux;
            }
            aux=999;
        }
        System.out.println("");
        System.out.println("Suma de Filas");
        ImprimirArreglo(suma);
        System.out.println("Valor Menor por Filas");
        ImprimirArreglo(menor);
    }
    public static void PromedioColmnasyMayor(int [][] A) {
        double[] promedio = new double[A[0].length];
        int[] mayor = new int[A[0].length];
        int suma=0;
        int aux;
        aux=-999;
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                suma = A[j][i] + suma;  
                if(A[j][i]>aux){
                    aux = A[j][i];
                }
                mayor[i]=aux;
            } 
            promedio[i] = (1.0)*(suma)/(A[0].length);
            suma=0;
            aux=-999;
        }
        System.out.println("");
        System.out.println("Promedio Columnas");
        ImprimirArreglo(promedio);
        System.out.println("Valor mayor por Columnas");
        ImprimirArreglo(mayor);
    }
    public static void Mayor(int [][] A){ 
        int mayor;
        int a,b;
        int aux;
        aux=-999;
        a=0;
        b=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(A[i][j]>aux){
                    aux=A[i][j];
                    a=i;
                    b=j;
                }
            }
        }
        mayor = aux;
        System.out.println("");
        System.out.println("Valor mayor "+mayor);
        System.out.println("Posicion ("+a+","+b+")");
    }
    
    public static void ImprimirArreglo(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println((i+1)+". "+A[i]);
        }
    }
    public static void ImprimirArreglo(double[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println((i+1)+". "+String.format("%.2f", A[i]));
        }
    }
    public static void ImprimirArreglo(int[][] A) {
        System.out.println("");
        System.out.println("Matriz de "+A.length+"x"+A[0].length); 
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m,n;
        System.out.print("Digite un numero de filas: ");
        m=entrada.nextInt();
        
        System.out.println("");
        System.out.print("Digite un numero de columnas: ");
        n=entrada.nextInt();
        
        Comprobador(m, n);
        
        int[][] matriz;
        matriz = CrearArreglo(m, n);
        LlenarMatriz(matriz);
        ImprimirArreglo(matriz);
        SumaFilasyMenor(matriz);
        PromedioColmnasyMayor(matriz);
        Mayor(matriz);
    }
}
