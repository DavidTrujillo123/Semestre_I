/*Crear una aplicación que me cree un arreglo y lo llene con números aleatorios 
del 1 al 100. Luego ingrese un número y me indique si este existe en el arreglo 
y en que posición se encuentra. 
 */
package tarea9_u4a;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tarea9_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num; 

	Random aleatorio = new Random();

	int[] arreglo;
	arreglo = new int[100];

	for (int i = 0; i < arreglo.length; i++)
	{
            arreglo[i] = aleatorio.nextInt(1,100);
	}

//	Arrays.sort(arreglo);
//	for(int i : arreglo)
//	{
//            System.out.println(i);
//	}

	System.out.print("Digite un numero: ");
	num = entrada.nextInt();

	for (int i = 0; i < arreglo.length; i++)
	{
            if (arreglo[i] == num)
            {
		System.out.println("Su numero es: " + arreglo[i]);
		System.out.println("Esta en la posicion: " + i);
		break;
            }
            else if (i == arreglo.length - 1) System.out.println("Su numero no existe en el arreglo");
        }
    }   
}
