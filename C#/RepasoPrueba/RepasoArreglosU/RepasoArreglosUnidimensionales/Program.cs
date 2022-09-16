using System;

namespace RepasoArreglosUnidimensionales
{
	class Program
	{
		public static int Aleatorio(int inicio, int fin)
		{
			Random aleatorio = new Random();
			return aleatorio.Next(inicio, fin+1);
		}
		public static int[] LlenarArreglo(int[] arreglo, int inicio, int fin)
		{
			for (int i = 0; i < arreglo.Length; i++)
			{
				arreglo[i] = Aleatorio(inicio, fin);
			}
			return arreglo;
		}
		public static void ImprimirArreglo(int[] arreglo)
		{
			for (int i = 0; i < arreglo.Length; i++)
			{
				Console.WriteLine((i+1)+". "+arreglo[i]);
			}
		}
		public static void ParesImpares(int [] arreglo)
		{
			int contPares;
			int contImpares;
			contImpares = 0;
			contPares = 0;
			for (int i = 0; i < arreglo.Length; i++)
			{
				if (arreglo[i] % 2 == 0) contPares++;
				else contImpares++;
			}

			int[] pares = new int[contPares];
			int[] impares = new int[contImpares];
			int a, b;
			a = contPares-1;
			b = 0;
			for (int i = 0; i < arreglo.Length; i++)
			{
				if (arreglo[i] % 2 == 0)
				{
					pares[a] = arreglo[i];
					a--;
				}
				else
				{
					impares[b] = arreglo[i];
					b++;
				}
			}

			Console.WriteLine("Arreglo Pares");
			ImprimirArreglo(pares);
			Console.WriteLine("Arreglo Impares");
			ImprimirArreglo(impares);

		}
		static void Main(string[] args)
		{
			int[] arreglo = new int[20];
			LlenarArreglo(arreglo, 10, 50);
			Console.WriteLine("Numeros");
			ImprimirArreglo(arreglo);
			ParesImpares(arreglo);
		}
	}
}
