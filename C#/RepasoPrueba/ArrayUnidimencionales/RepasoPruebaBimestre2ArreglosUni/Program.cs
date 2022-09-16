using System;

namespace RepasoPruebaBimestre2ArreglosUni
{
	class Program
	{
		public static int Aleatorio(int inicio, int fin)
		{
			int aux;
			if (fin < inicio)
			{
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			Random aleatorio = new Random();

			return aleatorio.Next(inicio, fin+1);
		}
		public static void ImprimirArreglo(int[] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				Console.WriteLine((i+1)+". "+A[i]);
			}
		}
		static void Main(string[] args)
		{
			int m = 10;
			int inicio;
			int fin;
			int contpar = 0;
			int contimpar = 0;

			inicio = 10;
			fin = 20;
			int[] A = new int[m];
			int[] pares;
			int[] impares;
			for (int i = 0; i < A.Length; i++)
			{
				A[i] = Aleatorio(inicio,fin);
			}

			
			for (int i = 0; i < A.Length; i++)
			{
				if (A[i] % 2 == 0) contpar++;
				else contimpar++;
			}
			pares = new int[contpar];
			impares = new int[contimpar];

			int a = A.Length-1;
			int b = 0;
			int j = 0;
			int k = 0;
			while (a>=0) {
				if (A[a] % 2 == 0)
				{
					pares[j] = A[a];
					j++;
				}
				if (A[b] % 2 != 0)
				{
					impares[k] = A[b];
					k++;
				}
				a--;
				b++;			
			}

			ImprimirArreglo(A);
			Console.WriteLine("Pares\n");
			ImprimirArreglo(pares);
			Console.WriteLine("Impares\n");
			ImprimirArreglo(impares);
		}
	}
}
