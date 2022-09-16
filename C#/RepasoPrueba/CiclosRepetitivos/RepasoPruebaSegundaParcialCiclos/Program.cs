using System;

namespace RepasoPruebaSegundaParcialCiclos
{
	class Program
	{
		public static void Pregunta1(int n)
		{
			int cont=1;
			for (int i = 1; i <= n ; i++)
			{
				for (int j = 1; j <= i ; j++)
				{
					Console.Write("{0,5:0}",cont);
					cont++;
					if (cont > n)
					{
						i = n;
						break;
						
					}
				}
				
				Console.WriteLine();
			}
		}
		public static void Pregunta2(int n2)
		{
			int cont = 1;
			int i = 1;
			int j = 1;
			while (i<=n2) {
				while (j<=i) {
					Console.Write("{0,5:0}", cont);
					cont++;
					j++;
				}
				cont = 1;
				j = 1;
				i++;
				Console.WriteLine();
			}

			j = 1;
			i = n2-1;
			
			while (i >= 1)
			{
				while (j<=i) {
					Console.Write("{0,5:0}", cont);
					cont++;
					j++;
				}
				cont = 1;
				j = 1;
				Console.WriteLine();
				i--;
			}

		}
		public static void Pregunta3(int n3)
		{
			int i, j, cont;
			j = 1;
			i = n3;
			cont = 1;
			while (i >= 1)
			{
				while (j <= i)
				{
					Console.Write("{0,5:0}", cont);
					cont++;
					j++;
				}
				cont = 1;
				j = 1;
				Console.WriteLine();
				i--;
			}

			cont = 1;
			i = 1;
			j = 1;
			while (i <= n3)
			{
				while (j <= i)
				{
					Console.Write("{0,5:0}", cont);
					cont++;
					j++;
				}
				cont = 1;
				j = 1;
				i++;
				Console.WriteLine();
			}

		}
		static void Main(string[] args)
		{
			int n = 18;
			int n1 = 5;

			Pregunta1(n);
			Pregunta2(n1);
			Pregunta3(n1);
		}
	}
}
