using System;
/*Tarea 18.-
Definir y crear un arreglo bidimensional de (m x n - m filas x n columnas), llenar el arreglo con 
números secuenciales por columnas empezando en la posición correspondiente a la última fila 
y columna e imprimirlo en pantalla.
 */
namespace Tarea18_U4B
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
			for (int j = A[0].Length - 1; j >= 0; j --)
			{
				for (int i = A.Length - 1; i >= 0; i--)
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
			m = 3;
			n = 4;
			int[][] matriz;
			matriz = CrearArreglo(m,n);

			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo de " + m + "x" + n);
			ImprimirArreglo(matriz);
		}
	}
}
