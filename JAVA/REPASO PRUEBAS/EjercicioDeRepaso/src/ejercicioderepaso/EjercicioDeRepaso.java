/*
 */
package ejercicioderepaso;

import java.util.Random;


public class EjercicioDeRepaso {

    public static double Potencia(double num, double expo){
        double potencia = 1;
        for (int i = 1; i <= expo; i++) {
            potencia = num*potencia;
        }
        return potencia;
    }
    public static  double Factorial(double num){
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static double Seno(double x){
        double suma = 0;
        for (int n = 0; n <=20 ; n++) {
            suma = ((Potencia(-1, n))/Factorial(2*n+1))*(Potencia(x, (2*n+1))) + suma;
        }
        return suma;
    }
    public static boolean Primo(int num){
        int cont=0;
        
        for (int i = 2; i < num; i++) {
            if(num % i == 0) cont++;
        }
       
        if(cont > 0 || num==1) return false;
        else return true;
    }
    public static int [][] CrearMatiz(int m, int n){
        int[][] A = new int[m][];
        for (int i = 0; i < A.length; i++) {
            A[i]= new int[n];
        }
        return A;
    }
    public static int Aleatorio(int inicio, int fin){
        int aux;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        Random aleatorio = new Random();
        return aleatorio.nextInt(inicio, fin+1);
    }
    public static void main(String[] args) {
        double rad;
        rad = 3.1416/180;
        System.out.println("Sen(30) ="+Seno(30*rad));
        System.out.println("Sen(45) ="+Seno(45*rad));
        System.out.println("Sen(60) ="+Seno(60*rad));
        System.out.println("Sen(90) ="+Seno(90*rad));
        
        int m,n;
        int inicio, fin;
        m=3;
        n=4;
        inicio = 10;
        fin=1;
        
        int[][] A= CrearMatiz(m, n);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <A[0].length ; j++) {
                A[i][j]=Aleatorio(inicio, fin);
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <A[0].length ; j++) {
                System.out.printf("%4d",A[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Primos");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <A[0].length ; j++) {
                if(Primo(A[i][j])) System.out.println(A[i][j]); 
            }
        }
    }
    
}
