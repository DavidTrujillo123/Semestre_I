/*Tarea 10.-
Crear una aplicación que me cree un arreglo unidimensional y lo llene con números aleatorios 
del 1 al 100. Luego ingrese un número y me indique si este existe en el arreglo y me elimine 
todas sus repeticiones. 
 */
package tarea10_u4a;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tarea10_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont, ceros;
        int pos;
        int aux;
        int j = 1;
        cont = 0;
        ceros = 0;

        Random aleatorio = new Random();

        int[] arreglo;
        int[] arreglo_final;
        arreglo = new int[100];
        
        //Llenado de arreglo con numeros aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = aleatorio.nextInt(1, 100+1);
        }
        Arrays.sort(arreglo);
        System.out.println("Arreglo original");
        int k;
        k = 1;
        for (int i : arreglo) {
            System.out.println(k + ".- " + i);
            k++;
        }
        System.out.println("");

        System.out.print("Digite un numero: ");
        num = entrada.nextInt();
        
        //Convierte los numeros repetidos en 0
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) cont++; //excluye el primer numero
            if (cont > 1 && arreglo[i] == num) arreglo[i] = 0;
        }

        if (cont > 0) ceros = cont - 1;
        
        //Recorre los ceros al final
        while (j <= ceros) {
            for (int i = 0; i < arreglo.length; i++) {
                pos = i;
                while (arreglo[i] == 0 && pos < arreglo.length - 1) {
                    aux = arreglo[pos];
                    arreglo[pos] = arreglo[pos + 1];
                    arreglo[pos + 1] = aux;
                    pos++;
                }
            }
            j++;
        }

        //Llenado del arreglo sin los ceros
        arreglo_final = new int [100-ceros];
        for (int i = 0; i < arreglo_final.length ; i++) {
            if(arreglo[i]!=0){
                arreglo_final[i]=arreglo[i];
            }
        }
        
        
        System.out.println("Arreglo final");
        k = 1;
        for (int i : arreglo_final) {
            System.out.println(k + ".- " + i);
            k++;
        }
        System.out.println("");

        if (cont == 1) {
            System.out.println("Su numero si existe en el arreglo pero no se repite");
        } else if (cont > 1) {
            System.out.println("Su numero si existe en el arreglo y las repeticiones fueron eliminadas");
        } else if (cont == 0) {
            System.out.println("Su numero no extiste en el arreglo");
        }

    }

}
