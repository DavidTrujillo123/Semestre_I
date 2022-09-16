using System;
/*Tarea 29.-
Definir y crear un arreglo de bidimensional cuadrado de (m x m - m filas x m columnas), llenar el 
arreglo e indicar si es diagonal (si es a la vez triangular superior e inferior, sólo tienen elementos 
en la diagonal principal)
 */
namespace Tarea29_U4B
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
			return aleatorio.Next(0, 2);
		}
		public static void LlenarArreglo(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length; j++)
				{
					if(i==j) A[i][j] = 1;
					else A[i][j] = Aleatorio();
				}
			}
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
						if (A[i][j] == 0) triangular[0] = false;
					}
				}

			}

			if (triangular[0] == true)
			{
				int a, b;
				a = 1;
				b = 0;
				while (a<A.Length) {
					while (b<a) {
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

			Console.WriteLine("Arreglo de " + m + "x" + m);
			ImprimirArreglo(matriz);

			if (triangular[0] == false)
			{
				if (MatrizNula(matriz)) Console.WriteLine("Es una matriz nula");
				else Console.WriteLine("No tiene diagonal");
			}
			else
			{
				if (triangular[1] && triangular[2]) Console.WriteLine("Es diagonal");
				else if (triangular[1]) Console.WriteLine("Es triangular superior");
				else if (triangular[2]) Console.WriteLine("Es triangular inferior");
				else Console.WriteLine("Tiene diagonal pero no es triangular superior ni inferior");
				
			}
		}
	}
}
