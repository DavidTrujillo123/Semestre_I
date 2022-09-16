using System;
/*Definir y crear un arreglo de bidimensional de (m x n - m filas x n columnas), llenar el arreglo 
con números secuenciales según los patrones definidos a continuación e imprimirlo en 
pantalla.

Tarea 20
Arreglo 4x4
    1    8    9   16
    2    7   10   15
    3    6   11   14
    4    5   12   13

 */
namespace Tarea20_U4B
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
			int a, b;
			cont = 1;
			a = 0;
			b = 0;
			while (b < A[0].Length)
			{
				while (a < A.Length)
				{
					A[a][b] = cont;
					cont++;
					a++;
				}
				if (b == A[0].Length - 1) break;

				a--;//a sobrepasa el valor de la logitud de la matriz por eso se resta
				b++;

				while (a >= 0)
				{
					A[a][b] = cont;
					a--;
					cont++;
				}
				a++;//a sale del ciclo con -1
				b++;
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
			n = 4;
			int[][] matriz;

			matriz = CrearArreglo(m, n);
			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo " + m + "x" + n);
			ImprimirArreglo(matriz);
		}
	}
}
