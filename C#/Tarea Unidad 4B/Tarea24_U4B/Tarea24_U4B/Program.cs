using System;
/*Definir y crear un arreglo de bidimensional de (m x n - m filas x n columnas), llenar el arreglo 
con números secuenciales según los patrones definidos a continuación e imprimirlo en 
pantalla.

Tarea 24
Arreglo 5x5
   25   24   23   22   21
   10    9    8    7   20
   11    2    1    6   19
   12    3    4    5   18
   13   14   15   16   17
 */
namespace Tarea24_U4B
{
	class Program
	{
		public static int[][] CrearArreglo(int m, int n)
		{
			int[][] matriz = new int[m][];
			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[n];
			}
			return matriz;
		}
		public static void LlenarArreglo(int[][] A)
		{
			int cont, auxcolumna, auxfila, x;
			int a, b, nelementos;
			nelementos = (A.Length * A[0].Length);
			auxcolumna = A[0].Length - 1;
			auxfila = A.Length - 1;
			cont = nelementos;
			a = 0;
			b = 0;
			x = 0;
			while (true)
			{
				//avanza →
				while (b <= auxcolumna)
				{
					A[a][b] = cont;
					b++;
					cont--;
				}
				if (cont < 1) break;
				b--;
				a++;

				//avanza ↓ 
				while (a <= auxfila)
				{
					A[a][b] = cont;
					cont--;
					a++;
				}
				if (cont < 1) break;
				a--;
				b--;

				//avanza ←
				while (b >= x)
				{
					A[a][b] = cont;
					b--;
					cont--;
				}
				if (cont < 1) break;
				b++;
				x++;
				a--;

				//avanza ↑
				while (a >= x)
				{

					A[a][b] = cont;
					a--;
					cont--;
				}
				if (cont < 1) break;
				a++;
				b++;
				auxcolumna--;
				auxfila--;
			}
		}
		public static void ImprimirArreglo(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					Console.Write("{0,5:0}", A[i][j]);
				}
				Console.WriteLine();
			}
		}

		static void Main(string[] args)
		{
			int m, n;
			m = 5;
			n = 5;
			int[][] matriz;

			matriz = CrearArreglo(m, n);
			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo " + m + "x" + n);
			ImprimirArreglo(matriz);
		}
	}
}
