using System;

namespace SerieSeno
{
	class Program
	{
		public static double Potencia(double num, double expo)
		{
			double potencia = 1;
			for (int i = 1; i <= expo; i++)
			{
				potencia = num * potencia;
			}
			return potencia;
		}
		public static double Factorial(double num)
		{
			double fact = 1;
			for (int i = 1; i <=num ; i++)
			{
				fact = i * fact;
			}
			return fact;
		}
		public static double Seno(double x)
		{
			double suma = 0;
			for (int n = 0; n <= 10; n++)
			{
				suma = ((Potencia(-1, n)) / (Factorial((2 * n) + 1))) * Potencia(x, (2 * n) + 1) + suma;
			}
			return suma;
		}
		public static bool Primo(int num)
		{
			int cont = 0;
			for (int i = 2; i < num; i++)
			{
				if (num % i == 0) cont++;
			
			}

			if (cont >= 1) return false;
			else return true;
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
			Random alatorio = new Random();
			return alatorio.Next(inicio, fin+1);
		}
		public static void ImprimirArreglo(int[][] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[0].Length; j++)
				{
					Console.Write("{0,5:0}", A[i][j]);
				}
				Console.WriteLine();
			}
		}
		static void Main(string[] args)
		{
			Console.WriteLine("Sen(30)" + Seno(30 * (3.1416)/180));
			Console.WriteLine("Sen(45)" + Seno(45 * (3.1416) / 180));
			Console.WriteLine("Sen(60)" + Seno(60 * (3.1416) / 180));
			Console.WriteLine("Sen(90)" + Seno(90 * (3.1416) / 180));

			int num = 4;
			if (Primo(num)) Console.WriteLine("El numero " + num+" es primo");
			else Console.WriteLine("El numero " + num + " no es primo");

			int m = 3;
			int n = 3;
			int inicio, fin;
			inicio = 1;
			fin = 30;
			int[][] A = new int[m][];

			for (int i = 0; i < A.Length; i++)
			{
				A[i] = new int[n];
			}
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[0].Length; j++)
				{
					A[i][j] = Aleatorio(inicio, fin);
				}
			}
			ImprimirArreglo(A);
			Console.WriteLine("Numeros primos");
			for (int i = 0; i < A.Length; i++)
			{
				for (int j = 0; j < A[0].Length; j++)
				{
					if (Primo(A[i][j])) Console.Write(A[i][j]+"  ");
				}
			}
			

		}
	}
}
