using System;
/*Tarea 27.-
Realizar un método que me retorne si un arreglo bidimensional representa una matriz nula o no 
(todos los elementos son ceros). 
 */
namespace Tarea27_U4B
{
	class Program
	{
		public static int Aleatorio()
		{
			Random aleatorio = new Random();
			return aleatorio.Next(0, 2);
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
		public static int[][] CrearArreglo(int m, int n)
		{
			int[][] matriz;
			matriz = new int[m][];

			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[n];
			}
			return matriz;
		}

		public static bool MatrizNula(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					if (A[i][j] != 0) return false;
				}
			}
			return true;
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
			int[][] matriz;
			m = 3;
			n = 3;
			matriz = CrearArreglo(m, n);
			LlenarArreglo(matriz);
			ImprimirArreglo(matriz);
			
			if (MatrizNula(matriz))	Console.WriteLine("Es una matriz nula");
			else Console.WriteLine("No es una matriz nula");

		}
	}
}
