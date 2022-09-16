/*Tarea 06.-
Construir una aplicación que permita encontrar el número mayor y el número menor de una 
serie de números ingresados por teclado, como primera entrada se le dará el tamaño del 
arreglo y luego los datos, también se debe indicar cuantas veces se repiten tanto el mayor 
como el menor. 
 */
package tarea6_u4a;

import java.util.Scanner;

public class Tarea6_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n;
	//System.out.println("Digite un numero de elementos");
	//n = entrada.nextInt();
	n = 5;
	int[] num = new int[n];
	int menor;
	int mayor;
	int contMenor, contMayor;
	contMenor = 0;
	contMayor = 0;
	mayor = 0;
	menor = 99999;
        
	for (int i = 0; i < n; i++)
	{
            System.out.print((i + 1) + ". Digite un número: ");
            num[i] = entrada.nextInt();
	}
        
	for (int i = 0; i < n; i++)
	{
            if (num[i] < menor) menor = num[i];
            if (num[i] > mayor) mayor = num[i];
	}
        
	for(int i : num) {
            if (i == menor) contMenor++;
            if (i == mayor) contMayor++;
	}
	System.out.println("");
        
	if (mayor != menor)
	{
            System.out.println("El número mayor es: " + mayor +" y se repite "+contMayor+" veces");
            System.out.println("El número menor es: " + menor + " y se repite " + contMenor + " veces");
	}
	else System.out.println("Todos los numeros son iguales");
    }
}
