using System;
/*Tarea 26.-
Definir y crear un arreglo bidimensional cuadrado de (m x m - m filas x m columnas), llenar el 
arreglo con números aleatorios, multiplicar los elementos de la diagonal principal por un escalar 
y almacenarlos en un arreglo unidimensional e imprimir los resultados.
 */
namespace Tarea26_U4B
{
	class Program
	{
		public static int Aleatorio()
		{
			Random aleatorio = new Random();
			return aleatorio.Next(0, 101);
		}
		public static int[][] CrearArreglo(int m)
		{
			int[][] A;
			A = new int[m][];
			for (int i = 0; i < A.Length; i++)
			{
				A[i] = new int[m];
			}
			return A;
		}
		public static void LlenarArreglo(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					A[i][j] = Aleatorio();
				}
			}
		}
		public static void ImprimirArreglo(int[] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				Console.Write("{0,5:0}",A[i]);
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
		public static int[] MultiplicarDiagonal(int[][] A, int mult)
		{
			int[] result = new int[A.Length];
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					if (i == j)
					{
						result[i] = A[i][j] * mult;
					}
				}
			}
			return result;
		}

		static void Main(string[] args)
		{
			int m,mult;
			int[][] matriz;
			int[] diagonal;
			m = 5;
			mult = 2;
			matriz = CrearArreglo(m);
			LlenarArreglo(matriz);

			diagonal = MultiplicarDiagonal(matriz, mult);

			Console.WriteLine("Arreglo de " + m + "x" + m);
			ImprimirArreglo(matriz);
			Console.WriteLine();
			Console.WriteLine("Diagonal Principal x "+mult);
			ImprimirArreglo(diagonal);

			Console.ReadKey();
		}
	}
}
