/*Tarea 35.-
Una empresa automotriz tiene cinco agencias y cuenta con la información acerca de las ventas 
mensuales de automóviles logradas el año pasado por cada una de éstas. A partir de esta 
información la empresa construyó la siguiente matriz ventas:

           Agencia 1    Agencia 2   Agencia 3   Agencia 4   Agencia 5
Enero 
Febrero 
… 
Noviembre 
Diciembre

Se le solicita a usted que elabore una aplicación que permita lo siguiente: 
a) Registrar la información de las ventas por mes de cada una de las agencias. 
b) Mostrar en pantalla el resumen de ventas de cada agencia. 
c) Mostrar cuál fue el total de ventas en el año de la Agencia 3. 
d) Mostar el promedio de ventas en el mes de diciembre. 
e) Mostrar el número de la agencia que tuvo mayores ventas en el mes de mayo. 
f) Indicar en qué mes se registraron las menores ventas del año, considerando todas 
las agencias.

 */
package tarea35_u4b;

import java.util.Random;
import java.util.Scanner;

public class Tarea35_U4B {

    public static double Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextDouble(0, 100);
    }
    public static void LlenarMatriz(double [][] A){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Llenado de matriz");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
               // System.out.print("Valor del mes "+(i+1)+" en la Agencia "+(j+1)+": ");
                //A[i][j]= entrada.nextDouble();   
                A[i][j]=Aleatorio();
            }
        }
    }
    public static void TotalVentasAgencia3(double [][] A){
        double suma = 0;
        for (int i = 0; i < A.length; i++) {
            suma = A[i][2]+suma;
        }
        System.out.println("");
        System.out.println("Total Ventas Agencia 3: "+String.format("%.2f", suma));
    }
    public static void PromedioVentasDiciembre(double [][] A){
        double suma = 0;
        double promedio;
        for (int i = 0; i < A[0].length; i++) {
            suma = A[11][i]+suma;
        }
        promedio=suma/A[0].length;
        System.out.println("");
        System.out.println("Promedio de ventas en Diciembte: "+String.format("%.2f", promedio));
    }
    public static void MayorVentasAgencia(double [][] A){
        double mayor;
        int aux=0;
        mayor=-999;
        for (int i = 0; i < A[0].length; i++) {
            if(A[4][i]>mayor){
                mayor = A[4][i];
                aux = i;
            }
        }
        System.out.println("");
        System.out.println("La Agencia "+(aux+1)+" fue la que vendio mas en Mayo");
        System.out.println("Ventas Agencia"+(aux+1)+" : "+String.format("%.2f", mayor));
    }
    public static void MenoresVentas(double [][] A){
        double menor = 999;
        double suma = 0;
        double[] total = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                suma = A[i][j]+suma;
            }
            total[i]=suma;
            suma=0;
        }
        
        int aux=0;
        for (int i = 0; i < total.length; i++) {
            if(total[i]<menor){
                menor = total[i];
                aux=i;
            }
        }
        System.out.println("");
        System.out.println("El mes "+(aux+1)+" fue el que menos se vendio");
        System.out.println("Ventas mes "+(aux+1)+" : "+String.format("%.2f", menor));
    }
    public static void ImprimirArreglo(double [] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println((i+1)+". "+A[i]);
        }
    }
    public static void ImprimirArreglo(double[][] A) {
        System.out.println("");
        System.out.println("Matriz de "+A.length+"x"+A[0].length); 
        System.out.print("MES  Agencia1  Agencia2  Agencia3  Agencia4  Agencia5\n");
        for (int i = 0; i < A.length; i++) {
            System.out.print(i+1);
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%10.2f", A[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        double [][] matriz = new double[12][5];
        LlenarMatriz(matriz);
        ImprimirArreglo(matriz);
        TotalVentasAgencia3(matriz);
        PromedioVentasDiciembre(matriz);
        MayorVentasAgencia(matriz);
        MenoresVentas(matriz);
    } 
}
