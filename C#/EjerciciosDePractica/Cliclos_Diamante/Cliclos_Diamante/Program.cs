using System;
/*	....*.......*.......*.......*.......*.......*.......*.......*.......*.......*.......
	...***.....***.....***.....***.....***.....***.....***.....***.....***.....***.....
	..*****...*****...*****...*****...*****...*****...*****...*****...*****...*****...
	.*******.*******.*******.*******.*******.*******.*******.*******.*******.*******.
	*********************************************************************************
	.*******.*******.*******.*******.*******.*******.*******.*******.*******.*******.
	..*****...*****...*****...*****...*****...*****...*****...*****...*****...*****...
	...***.....***.....***.....***.....***.....***.....***.....***.....***.....***.....
	....*.......*.......*.......*.......*.......*.......*.......*.......*.......*.......
 */
namespace Cliclos_Diamante
{
	class Program
	{
		static void DiamanteWhile(int n, int vueltas)
		{
			int i, espacios;
			int j, x;
			int cont;
			int espaciosInicio;
			espaciosInicio = n - 1;
			i = 1;
			j = 1;
			espacios = 2*n-3;
			cont = 1;
			x = 1;
			while (i <= n)
			{
				while (j<=espaciosInicio) {
					Console.Write(".");
					j++;
					
				}
				j = 1;
				espaciosInicio--;

				while (x <= vueltas)
				{
					while (j <= cont)
					{
						if (j == 2 * n - 1) break;
						Console.Write("*");
						j++;
					}
					j = 1;
					
					while (j <= espacios)
					{
						Console.Write(".");
						j++;
					}
					
					j = 1;
					x++;
				}

				x = 1;
				cont += 2;
				espacios -= 2;
				if (i == n) Console.Write("*");
				Console.WriteLine();
				i++;
			}

			i = 2;
			espaciosInicio = 1;
			cont = 2 * n - 3;
			espacios = 1;
			x = 1;
			while (i<=n) {
				while (j<=espaciosInicio) {
					Console.Write(".");
					j++;
				}
				j = 1;
				espaciosInicio++;

				while (x<=vueltas) {
					while (j <= cont) {
						Console.Write("*");
						j++;
					}
					j = 1;


					while (j <= espacios)
					{
						Console.Write(".");
						j++;
					}
					j = 1;
					x++;
				}
				x = 1;
				cont -= 2;
				espacios += 2;
				i++;
				Console.WriteLine();
			}

		}

		static void DiamanteFor(int n, int vueltas)
		{
			int diam;
			int aux, aux2;
			aux = n - 1;
			aux2 = 2 * n - 3;
			diam = 1;

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= aux; j++)
				{
					Console.Write(".");
				}
				aux--;

				for (int x = 1; x <= vueltas; x++)
				{
					for (int k = 1; k <= diam; k++)
					{
						if (k == 2 * n - 1) break;
						Console.Write("*");
					}
					for (int e = 1; e <= aux2; e++)
					{
						Console.Write(".");
					}
				}
				aux2 -= 2;
				diam += 2;
				if (i == n) Console.Write("*");
				Console.WriteLine();
			}

			aux2 = 1;
			diam = 2 * n - 3;
			aux = 1;
			for (int i=2; i<=n; i++) {

				for (int j = 1; j <= aux2; j++)
				{
					Console.Write(".");
				}
				aux2 ++;

				for (int x = 1; x <= vueltas; x++)
				{
					for (int k = 1; k <= diam; k++)
					{
						Console.Write("*");
					}
					for (int e = 1; e <= aux; e++)
					{
						Console.Write(".");
					}
				}
				aux += 2; 
				diam -= 2;

				Console.WriteLine();
			}

		}
		static void Main(string[] args)
		{
			//DiamanteWhile(15,1);
			DiamanteFor(5, 10);
		}
	}
}
