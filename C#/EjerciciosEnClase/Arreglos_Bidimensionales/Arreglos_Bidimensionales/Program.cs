using System;

namespace Arreglos_Bidimensionales
{
	class Program
	{
		public static int Aleatorio(int inicio, int fin)
		{
			Random aleatorio = new Random();
			return aleatorio.Next(inicio, fin);
		}

		public static int Aleatorio()
		{
			int rnd;
			rnd = Aleatorio(0, 100);
			return rnd;
		}

		public static void LlenarArreglo(int[] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				A[i] = Aleatorio();
			}

		}

		public static void LlenarArreglo(int [][] A)
		{

			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					A[i][j] = Aleatorio();
				}
			}
		}

		public static void LlenarArreglo(int[,] A)
		{
			for (int i = 0; i < A.GetLength(0); i++)
			{
				for (int j = 0; j < A.GetLength(1); j++)
				{
					A[i,j] = Aleatorio();
				}
			}
		}
		public static void ImprimirArreglo(int [] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				Console.WriteLine((i+1)+". "+A[i]);
			}
		}
		public static void ImprimirArreglo(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					Console.Write("{0,4:0}", A[i][j]); //{} para dar los espacios 
				}
				Console.WriteLine();
			}
		}

		public static void ImprimirArreglo(int[,] A)
		{
			for (int i = 0; i < A.GetLength(0); i++)
			{
				for (int j = 0; j < A.GetLength(1); j++)
				{
					Console.Write("{0,5:0}",A[i,j]);
				}
				Console.WriteLine();
			}
		}

		public static void ArreglosdeArreglos()
		{
			int[][] matriz;
			matriz = new int[3][];



			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[5];
			}

			LlenarArreglo(matriz);

			ImprimirArreglo(matriz);

			//foreach (int[] i in matriz)
			//{
			//	foreach (int j in i)
			//	{
			//		Console.Write("	"+j);
			//	}
			//	Console.WriteLine();
			//}
		}

		public static void ArreglosBidimensionales()
		{
			int[,] matriz;
							//0 1 
			matriz = new int[4, 5];

			Console.WriteLine(matriz.Length);
			Console.WriteLine(matriz.GetLength(0));
			Console.WriteLine(matriz.GetLength(1));

			LlenarArreglo(matriz);
			ImprimirArreglo(matriz);
	
		}
		static void Main(string[] args)
		{
			ArreglosdeArreglos();
			ArreglosBidimensionales();
						
		}
	}
}
