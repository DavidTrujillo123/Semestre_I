/*Suponga un array que contiene N notas de 0 a 20 generados aleatoriamente y mostradas en 
pantalla, de acuerdo a la nota contenida, indique cuántos estudiantes son: 
Deficientes 0-5 
Regulares 6-10 
Buenos 11-15 
Excelentes 16-20
 */
package tarea13_u4a;

import java.util.Random;

public class Tarea13_U4A {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        int alumnos;
        alumnos = 10;
        int deficientes, regulares, buenos, excelentes;
        deficientes = 0;
        regulares = 0;
        buenos = 0;
        excelentes = 0;

        int [] arreglo;
        arreglo = new int[alumnos];

        for (int i = 0; i < arreglo.length; i++)
        {
                arreglo[i] = aleatorio.nextInt(0, 20);
        }

        System.out.println("NOTAS:");
        for (int i = 0; i < arreglo.length; i++) System.out.println((i+1)+". "+arreglo[i]);

        for (int i = 0; i < arreglo.length; i++)
        {
                if (arreglo[i] >= 0 && arreglo[i] <= 5) deficientes++;
                else if (arreglo[i] >= 6 && arreglo[i] <= 10) regulares++;
                else if (arreglo[i] >= 11 && arreglo[i] <= 15) buenos++;
                else excelentes++;

        }

        System.out.println("\nAlumnos Totales: "+alumnos);
        System.out.println("Deficientes(0-5)-->"+deficientes);
        System.out.println("Regulares(6-10)-->"+regulares);
        System.out.println("Buenos(11-15)-->"+buenos);
        System.out.println("Excelentes(16-20)-->"+excelentes);
    }
}
