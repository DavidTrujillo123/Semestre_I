using System;
/*Tarea 25.-
Definir y crear un arreglo bidimensional cuadrado de (m x m - m filas x m columnas), llenar el 
arreglo con números aleatorios e imprimir los elementos de la diagonal principal.
 */
namespace Tarea25_U4B
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
		public static void ImprimirArreglo(int[][]A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					Console.Write("{0,5:0}",A[i][j]);
				}
				Console.WriteLine();
			}
		}
		public static void ImprimirDiagonal(int[][]A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					if (i != j) A[i][j]=0;
				}
			}
			ImprimirArreglo(A);
		}
		static void Main(string[] args)
		{
			int m;
			int[][] matriz;
			m = 5;
			matriz = CrearArreglo(m);
			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo de "+m+"x"+m);
			ImprimirArreglo(matriz);
			Console.WriteLine();
			Console.WriteLine("Diagonal Principal");
			ImprimirDiagonal(matriz);
		}
	}
}
