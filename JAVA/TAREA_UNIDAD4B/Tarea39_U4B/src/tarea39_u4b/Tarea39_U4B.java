/*Tarea 39.- 
La administración de una empresa quiere conocer cuál fue el ausentismo registrado en cada uno 
de los 6 departamentos de la compañía en una semana laboral (cinco días). Elabore una 
aplicación que lea el número diario de ausentes en cada departamento e imprima: el ausentismo 
diario de cada departamento, el ausentismo semanal total por departamento, y, por último, 
indicar cuáles son los días de la semana en que se presentó más ausentismo y cuáles en los que 
menos. 

 */
package tarea39_u4b;

import java.util.Random;

public class Tarea39_U4B {

    public static int Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(1,11);
    }
    public static void LlenarFaltas(int [][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j]=Aleatorio();
            }
        }
    }
    public static int [] FaltasSemanales(int [][] A){
        int[] semanal= new int[A.length];
        int suma= 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                suma = A[i][j]+suma;
            }
            semanal[i]=suma;
            suma=0;
        }
        return semanal;
    }
    public static int [] FaltasDiarias(int [][] A){
        int[] diario = new int[A[0].length];
        int suma=0;
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                suma = A[j][i]+suma;
            }
            diario[i]=suma;
            suma=0;
        }
        //ImprimirArreglo(diario);
        return diario;
    }
    public static int [] MayorMenorDiaFaltas(int [][] A){
        int auxmen,auxmay;
        int[] faltasDiarias;
        int[] mayorMenor = new int[2];//mayor 0 - menor 1
        int mayor=-1;
        int menor=999;
        auxmay=0;
        auxmen=0;
        faltasDiarias = FaltasDiarias(A);
        
        for (int i = 0; i < faltasDiarias.length; i++) {
            if(faltasDiarias[i]>mayor){
                mayor = faltasDiarias[i];
                auxmay=i;
            }
            if(faltasDiarias[i]<menor){
                menor = faltasDiarias[i];
                auxmen=i;
            }
        }
        mayorMenor[0]=auxmay;
        mayorMenor[1]=auxmen;
        return mayorMenor;
    }
    public static void ImprimirArreglo(int [] A){
        for (int i = 0; i < A.length; i++) {
            System.out.println("Depart. "+(i+1)+" -> "+A[i]);
        }
    }
    public static void ImprimirArreglo(int [][] A){
        for (int i = 0; i < A.length; i++) {
            System.out.print("Depart. "+(i+1)+" ");
            for (int j = 0; j < A[0].length; j++) {
                System.out.printf("%8d",A[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] faltas = new int [6][5];
        int[] faltaSemanales;
        int[] mayormenor;
        String[] dias = {"Lunes","Martes","Miescoles","Jueves","Viernes"};
        
        System.out.println("Faltas diarias ");
        System.out.print("             Lunes  Martes  Miercoles  Jueves  Viernes");
        System.out.println("");
        LlenarFaltas(faltas);
        ImprimirArreglo(faltas);
        System.out.println("");
        
        System.out.println("Faltas semanales ");
        faltaSemanales = FaltasSemanales(faltas);
        ImprimirArreglo(faltaSemanales);
        System.out.println("");
        
        System.out.println("Faltas Diarias");
        mayormenor = MayorMenorDiaFaltas(faltas);
        System.out.println("Mayores Faltas -> "+dias[mayormenor[0]]);
        System.out.println("Menores Faltas -> "+dias[mayormenor[1]]);
    }
}
