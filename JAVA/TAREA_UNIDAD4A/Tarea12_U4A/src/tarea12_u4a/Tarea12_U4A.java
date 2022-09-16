/*Tarea 12.-
Suponga un array con N notas de 0 a 10, calcule el promedio de aprobados y el promedio de 
los desaprobados e indique la cantidad de aprobados y desaprobados (Se aprueba con una 
nota >= 7). 
 */
package tarea12_u4a;

import java.util.Scanner;

public class Tarea12_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] notas;
        double prom_aprobados, prom_desaprobados;
        int aprobados, desaprobados;
        int n;
        n = 5;
        aprobados = 0;
        desaprobados = 0;

        notas = new int [n];

        for (int i= 0; i<n; i++) {
            System.out.print((i+1)+". Digite una nota: ");
            notas[i] = entrada.nextInt();
        }

        for (int i = 0; i <n ; i++)
        {
                if (notas[i] >= 7) aprobados++;
                else desaprobados++;

        }

        prom_aprobados = (aprobados*1.0) / n;
        prom_desaprobados = (desaprobados*1.0) / n;


        if (aprobados == 0) System.out.println("No existen aprobados");
        else System.out.println("Promedio Aprobados "+prom_aprobados);

        if (desaprobados == 0) System.out.println("No existen reprobados");
        else System.out.println("Promedio Desaprobados "+prom_desaprobados);

        System.out.println("Cantidad Aprobados "+aprobados);
        System.out.println("Cantidad Desaprobados "+desaprobados);
    }
}
