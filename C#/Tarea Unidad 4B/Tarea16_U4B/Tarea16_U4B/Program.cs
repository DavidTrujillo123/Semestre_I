using System;
/*Tarea 16.-
Definir y crear un arreglo bidimensional de (m x n - m filas x n columnas), llenar el arreglo con 
números secuenciales por filas empezando en la posición correspondiente a la última fila y 
columna e imprimirlo en pantalla.

Arreglo de 3x3
    9    8    7
    6    5    4
    3    2    1
 */
namespace Tarea16_U4B
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
			for (int i = A.Length - 1; i >= 0; i--)
			{
				for (int j = A[i].Length - 1; j >= 0; j--)
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
			m = 5;
			n = 5;
			int[][] matriz;
			matriz = CrearArreglo(m, n);
			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo de " + m + "x" + n);
			ImprimirArreglo(matriz);
		}
	}
}
