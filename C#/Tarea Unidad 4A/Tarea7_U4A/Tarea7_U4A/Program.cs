using System;
/*Tarea 07.-
Dado un arreglo A de n números enteros, se pide obtener los arreglos B y C a partir del arreglo 
A. En el arreglo B se deben poner los números pares y en el arreglo C se deben poner los 
números impares. 
int [ ] A = { 2, 8, 15, 3, 22, 14, 5, 6, 7}; 
int [ ] B = { 2, 8, 22, 14, 6}; 
int [ ] C = {15, 3, 5, 7};
 */
namespace Tarea7_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int contPar=0;
			int contImpar = 0;
			int[] A = { 2, 8, 15, 3, 22, 14, 5, 6, 7 };
			
			for (int i=0; i< A.Length; i++) {
				if (A[i] % 2 == 0) contPar++;
				else contImpar++;
			}

			int[] B = new int[contPar];
			int[] C = new int[contImpar];

			contImpar = 0;
			contPar = 0;
			for (int i = 0; i < A.Length; i++)
			{
				if (A[i] % 2 == 0)
				{
					B[contPar] = A[i];
					contPar++;
				}
				else
				{
					C[contImpar] = A[i];
					contImpar++;
				}
			}

			Console.Write("Arreglo A\n");
			foreach (int i in A)
			{
				Console.Write(i+" ");
			}
			Console.WriteLine();

			Console.Write("Arreglo B\n");
			foreach (int i in B) {
				Console.Write(i+" ");
			}
			Console.WriteLine();

			Console.Write("Arreglo C\n");
			foreach (int i in C)
			{
				Console.Write(i+" ");
			}
			Console.ReadKey();
		}
	}
}
