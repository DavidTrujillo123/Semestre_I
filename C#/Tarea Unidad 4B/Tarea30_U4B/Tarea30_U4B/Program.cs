using System;
/*Tarea 30.-
Definir y crear cuatro arreglos bidimensionales cuadrados de (m x m - m filas x m columnas) de 
igual tamaño que representen matrices, llenar dos arreglos con números aleatorios y determinar 
la suma y la resta de las matrices y almacenar el resultado en el tercer y cuarto arreglo 
respectivamente e imprimir las matrices originales y las resultantes
 */
namespace Tarea30_U4B
{
	class Program
	{
		public static int[][] CrearArreglo(int m)
		{
			int[][] matriz = new int[m][];
			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[m];
			}
			return matriz;
		}
		public static int Aleatorio()
		{
			Random aleatorio = new Random();
			return aleatorio.Next(0, 100 + 1);
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
		public static int[][] SumaDeMatrices(int[][]A, int[][]B)
		{
			int[][] C;
			C = CrearArreglo(A.Length);
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					C[i][j] = A[i][j] + B[i][j];
				}
			}
			return C;
		}
		public static int[][] RestaDeMatrices(int[][] A, int[][] B)
		{
			int[][] D;
			D = CrearArreglo(A.Length);
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					D[i][j] = A[i][j] - B[i][j];
				}
			}
			return D;
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
			int m;
			m = 3;
			int[][] A,B;
			int[][] C,D;

			A = CrearArreglo(m);
			B = CrearArreglo(m);

			LlenarArreglo(A);
			LlenarArreglo(B);

			C = SumaDeMatrices(A, B);
			D = RestaDeMatrices(A, B);

			Console.WriteLine("Arreglo A");
			ImprimirArreglo(A);
			Console.WriteLine();

			Console.WriteLine("Arreglo B");
			ImprimirArreglo(B);
			Console.WriteLine();

			Console.WriteLine("Arreglo A+B");
			ImprimirArreglo(C);
			Console.WriteLine();

			Console.WriteLine("Arreglo Resta A-B");
			ImprimirArreglo(D);
		}
	}
}
