/*Tarea 05.-
Construir una aplicación que me permita encontrar el número mayor y el número menor de 
una serie de números ingresados por teclado, como primera entrada se le dará el tamaño del 
arreglo y luego los datos. 
 */
package tarea5_u4a;

import java.util.Scanner;

public class Tarea5_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n;
	//Console.WriteLine("Digite un numero de elementos");
	//n = int.Parse(Console.ReadLine());
	n = 5;
	int[] num = new int[n];
	int menor = 99999;
	int mayor = 0;

	for (int i = 0; i < n; i++) {
            System.out.print((i+1)+". Digite un número: ");
            num[i] = entrada.nextInt();
	}

	for (int i = 0; i < n; i++)
	{
            if (num[i] < menor) menor = num[i];
				
            if (num[i] > mayor) mayor = num[i];
	}

	System.out.println("");
	if (mayor != menor)
	{
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
	}
	else System.out.println("Todos los numeros son iguales");
    }
}
