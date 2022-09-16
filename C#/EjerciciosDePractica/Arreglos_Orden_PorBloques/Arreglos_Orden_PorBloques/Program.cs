using System;
/*Leer los datos correspondientes a dos tablas de 12 elementos numericos, y 
 * mezclarlos en una tecerda de la forma: 3 de la tabla A, 3 de la B, otros 3 de A,
 * otros 3 de la B, etc.
 */
namespace Arreglos_Orden_PorBloques
{
	class Program
	{
		static void Main(string[] args)
		{
			int[] A = { 1, 2, 3, 7, 8, 9 };
			int[] B = { 4, 5, 6, 10, 11, 12 };
			int[] C = new int[12];
			int aux1;
			int aux2;
			aux1 = 0;
			aux2 = 0;
			int j;
			j = 0;
			int aux;
			aux = 0;

			for (int i = 1; i <= 2; i++)
			{
				while (aux < 3)
				{
					C[j] = A[aux1];
					j++;
					aux1++;
					aux++;
				}

				aux = 0;

				while (aux < 3)
				{
					C[j] = B[aux2];
					j++;
					aux2++;
					aux++;
				}
				aux = 0;
			}

			foreach (int i in C) Console.WriteLine(i);
		}
	}
}
