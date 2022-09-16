/*Tarea 36.-
El sábado pasado, en la parroquia de El Sagrario se ha realizado las elecciones para escoger a la 
nueva Junta Parroquial. En dichas elecciones se presentaron 5 candidatos y la municipalidad 
colocó en 4 parques distintos una mesa de votación para que los vecinos pudieran emitir su voto

                             Candidatos
                 A       B       C       D       E
Mesa de     1
Votacion    2
            3
            4

Elabore una aplicación que:
a) Lea e imprima una tabla indicando los votos obtenidos en cada una de las mesas de 
votaciones por cada uno de los 5 candidatos. 
b) Calcule el total de votos recibidos por cada candidato y el porcentaje del total de votos 
emitidos. 
c) Calcule el candidato más votado. 
d) Si un candidato recibió más del 50% de los votos, indicar que es el ganador. 
e) Si ningún candidato recibió más del 50% de los votos, el programa debe imprimir los dos 
candidatos más votados, que serán los que pasen a la segunda ronda de las elecciones.
 */
package tarea36_u4b;

import java.util.Random;
import java.util.Scanner;

public class Tarea36_U4B {
    
    public static int Aleatorio(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, 100);
    }
    public static void LlenarTabla(int [][] A){
        Scanner entrada = new Scanner(System.in);
        char[] candidatos = {'A','B','C','D','E'};
        for (int i = 0; i < A.length; i++) {
           //System.out.println();
            //System.out.println("Mesa "+(i+1));
            for (int j = 0; j < A[i].length; j++) {
               //System.out.print("Candidato "+candidatos[j]+" ");
                //A[i][j]= entrada.nextInt();   
                A[i][j]= Aleatorio();
            }
        }
    }
    public static int [] CantidaVotos(int [][] A){
        int[] total = new int[5];
        int suma=0;
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
               suma = A[j][i]+suma;
            }
            total[i]=suma;
            suma=0;
        }
        return total;
    }
    public static double [] PorcentajeCandidato(int [] A) {
        double[] porcentaje = new double [A.length];
        int totalVotos=0;
        for (int i = 0; i < A.length; i++) {
            totalVotos = A[i]+totalVotos;
        }
        
        System.out.println("Total de votos "+totalVotos);
 
        for (int i = 0; i < A.length; i++) {
            porcentaje[i] = ((A[i])*1.0/(totalVotos))*100;
        }
        return porcentaje;
    }
    public static int CandidatoMasVotado(int [] A) {
        int mayor=-1;
        int pos=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>mayor){
                mayor=A[i];
                pos = i;
            }
        }
        return pos;
    }
    public static void Ganador(double [] B,int masvotado){
        char[] candidatos = {'A','B','C','D','E'};
        double mayor=-1;
        int pos=0;
        
        if(B[masvotado]>=50){
            System.out.println("El ganador es el Candidato "+candidatos[masvotado]);
        }
        else{
            for (int i = 0; i < B.length; i++) {
                if(i!=masvotado){
                    if(B[i]>mayor){
                        mayor = B[i];
                        pos=i;
                    }
                }
            }
            System.out.println("Los Candidatos que pasan a la segunda ronda son: "+candidatos[masvotado]+" y "+candidatos[pos]);
        }
            
    }
    public static void ImprimirArreglo(int [] A) {
        char[] candidatos = {'A','B','C','D','E'};
        
        for (int i = 0; i < A.length; i++) {
            System.out.println("Candidato "+(candidatos[i])+" -> "+A[i]);
        }
    }
    public static void ImprimirArreglo(double [] A) {
        char[] candidatos = {'A','B','C','D','E'};
        
        for (int i = 0; i < A.length; i++) {
            System.out.println("Candidato "+(candidatos[i])+" -> "+String.format("%.2f",A[i])+"%");
        }
    }
    public static void ImprimirArreglo(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(i+1);
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%15d", A[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        int[] totalcandidato = new int[matriz[0].length];
        double[] porcentaje = new double[matriz[0].length];
        char[] candidatos = {'A','B','C','D','E'};
        int pos;
        
        LlenarTabla(matriz);
        System.out.print("MESA      Candidato A    Candidato B    Candidato C    Candidato D    Candidato E\n");
        ImprimirArreglo(matriz);
        System.out.println("");
        
        totalcandidato = CantidaVotos(matriz);
        System.out.println("Total de votos por Candidatos");
        ImprimirArreglo(totalcandidato);
        System.out.println("");
        
        System.out.println("Porcentaje");
        porcentaje = PorcentajeCandidato(totalcandidato);
        ImprimirArreglo(porcentaje);
        System.out.println("");
        
        pos=CandidatoMasVotado(totalcandidato);
        System.out.println("El Candidato "+candidatos[pos]+" es el mas votado" );
        System.out.println("");
        
        Ganador(porcentaje, pos);
    }
}
