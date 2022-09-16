using System;
/*Tarea 15.-
Definir y crear un arreglo bidimensional de (m x n - m filas x n columnas), llenar el arreglo con 
números aleatorios, imprimirlo en pantalla e indicar el número de filas y columnas del arreglo 
bidimensional.
 */
namespace Tarea_15
{
	class Program
	{
		public static int Aleatorio()
		{
			Random aleatorio = new Random();
			return aleatorio.Next(0, 100+1);
		}
		public static int[][] CrearArreglo(int m, int n)
		{
			int[][] matriz;
			matriz = new int[m][];
			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int [n];
			}
			return matriz;
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
			int m,n;
			m = 5;
			n = 6;
			int[][] matriz;
			matriz = CrearArreglo(m,n);
			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo de "+m+"x"+n);
			ImprimirArreglo(matriz);
		}
	}
}
