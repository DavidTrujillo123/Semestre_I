using System;
/*Tarea 17.-
Definir y crear un arreglo bidimensional de (m x n - m filas x n columnas), llenar el arreglo con 
números secuenciales por columnas empezando en la posición correspondiente a la primera fila 
y columna e imprimirlo en pantalla.
 */
namespace Tarea17_U4B
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
			int cont;
			cont = 1;

			for (int j = 0; j < A[0].Length; j++)
			{
				for (int i = 0; i < A.Length; i++)
				{
					A[i][j] = cont;
					cont++;
					
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
			int m, n;
			m = 4;
			n = 6;
			int[][] matriz;

			matriz = CrearArreglo(m,n);
			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo de " + m + "x" + n);
			ImprimirArreglo(matriz);
		}
	}
}
