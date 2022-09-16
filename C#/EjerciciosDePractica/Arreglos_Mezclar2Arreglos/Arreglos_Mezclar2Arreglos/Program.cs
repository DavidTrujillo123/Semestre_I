using System;
/*Leer por teclado dos tablas de 10 numeros enteros y meszclarlas en una tercera
 * de la forma: el 1 de A, el 1 de B, el 2 de A, el 2 de B, etc
 */
namespace Arreglos_Mezclar2Arreglos
{
	class Program
	{
		static void Main(string[] args)
		{
			int[] A = { 1, 3, 5, 7, 9 };
			int[] B = { 2, 4, 6, 8, 10};
			int[] C = new int[10];
			int j;
			j = 0;

			for (int i = 0; i < 5; i++)
			{
				C[j] = A[i];
				j++;
				C[j] = B[i];
				j++;
				
			}

			for (int i = 0; i < 10; i++) Console.WriteLine(C[i]);
		}
	}
}
