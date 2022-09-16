using System;
/*Tarea 28.-
Definir y crear un arreglo bidimensional cuadrado de (m x m - m filas x m columnas), llenar el 
arreglo e indicar si es triangular superior (todos los elementos por debajo de la diagonal principal 
son nulos) o inferior (son nulos todos los elementos situados por encima de dicha diagonal) 

 */
namespace Tarea28_U4B
{
	class Program
	{
		public static int[][] CrearArreglo(int m)
		{
			int[][] matriz;
			matriz = new int[m][];

			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[m];
			}
			return matriz;
		}
		public static int Aleatorio()
		{
			Random aleatorio = new Random();
			return aleatorio.Next(0, 3);
		}
		public static void LlenarArreglo(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					//if(i==j) A[i][j] = 1;
					A[i][j] = 1;
				}
			}
			A[1][0] = 0;
			A[2][0] = 0;
			A[2][1] = 0;
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
		public static bool[] MatrizTriangular(int[][] A)
		{
			bool[] triangular = new bool[3];//diagonal 0 - superior 1 - inferior 2
			triangular[0] = true;
			triangular[1] = true;
			triangular[2] = true;

			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A.Length; j++)
				{
					if (i == j)
					{
						if (A[i][j] == 0) triangular[0]=false; 
					}
				}

			}

			if (triangular[0] == true)
			{
				int a, b;
				a = 1;
				b = 0;
				while (a < A.Length)
				{
					while (b < a)
					{
						if (A[a][b] != 0 && a != b) triangular[1] = false; //superio
						if (A[b][a] != 0 && a != b) triangular[2] = false; //inferior
						b++;
					}
					b=0;
					a++;
				}
			}
			else
			{
				triangular[1] = false;
				triangular[2] = false;
			}
			return triangular;
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
			int[][] matriz;
			bool[] triangular;
			m = 3;
			matriz = CrearArreglo(m);
			LlenarArreglo(matriz);

			triangular = MatrizTriangular(matriz);

			Console.WriteLine("Arreglo de "+m+"x"+m);
			ImprimirArreglo(matriz);


			if (triangular[1]) Console.WriteLine("Es triangular superior");
			if (triangular[2]) Console.WriteLine("Es triangular inferior");
			if (triangular[0] == false || (triangular[1]==false && triangular[2]==false)) Console.WriteLine("No tiene diagonal superior ni inferior");
			if (MatrizNula(matriz)) Console.WriteLine("Es una matriz nula");
		}
	}
}
