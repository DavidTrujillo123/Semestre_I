using System;

namespace RepasoArreglosBidimensionales
{
	class Program
	{
		public static int[][] CrearArreglo(int m, int n)
		{
			int[][] matriz = new int[m][];
			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int [n];
			}
			return matriz;
		}
		public static int Aleatorio(int inicio, int fin)
		{
			int aux;
			if (fin < inicio)
			{
				aux = fin;
				fin = inicio;
				inicio = aux;
			}
			Random aleatiorio = new Random();
			return aleatiorio.Next(inicio, fin);
		}
		public static void LlenarArreglo(int[][] A, int inicio, int fin)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[0].Length; j++)
				{
					A[i][j] = Aleatorio(inicio, fin+1);
				}
			}
		}
		public static void ImprimirArreglo(int [] A) 
		{
			for (int i = 0; i < A.Length; i++)
			{
				Console.Write(A[i]+"  ");
			}
		}
		public static void ImprimirArreglo(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[0].Length; j++)
				{
					Console.Write("{0,5:0}",A[i][j]);
				}
				Console.WriteLine();
			}
		}
		static void Main(string[] args)
		{
			int m;
			int n;
			int inicio, fin;
			inicio = 1;
			fin = 10;
			m = 3;
			n = 4;
			int[][] matriz = CrearArreglo(m, n);
			LlenarArreglo(matriz, inicio , fin);
			int[] columnas = new int[matriz[0].Length];
			int[] filas = new int [matriz.Length];
			int suma = 0;
			for (int i = 0; i < matriz[0].Length; i++)
			{
				for (int j = 0; j < matriz.Length; j++)
				{
					suma = matriz[j][i] + suma;
				}
				columnas[i] = suma;
				suma = 0;
			}

			for (int i = 0; i < matriz.Length; i++)
			{
				for (int j = 0; j < matriz[0].Length; j++)
				{
					suma = matriz[i][j] + suma;
				}
				filas[i] = suma;
				suma = 0;
			}
			Console.WriteLine("Matriz");
			ImprimirArreglo(matriz);
			Console.WriteLine("Columnas");
			ImprimirArreglo(columnas);
			Console.WriteLine();
			Console.WriteLine("Filas");
			ImprimirArreglo(filas);
			Console.WriteLine();

			if (m == n)
			{
				int[] diagonalprincipal = new int[m];
				int[] diagonalsecundaria = new int[m];
				for (int i = 0; i < matriz.Length; i++)
				{
					for (int j = 0; j < matriz[0].Length; j++)
					{
						if (j == i) diagonalprincipal[i] = matriz[i][j];
					}
				}
				int k = matriz[0].Length-1;
				for (int i = 0; i < matriz.Length; i++)
				{
					diagonalsecundaria[i] = matriz[i][k];
					k--;
				}
				Console.WriteLine("Diagonal principal");
				ImprimirArreglo(diagonalprincipal);
				Console.WriteLine();
				Console.WriteLine("Diagonal secundaria");
				ImprimirArreglo(diagonalsecundaria);
			}

		
			
		}
	}
}
