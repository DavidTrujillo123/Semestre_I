using System;

namespace Repaso_Examen_ForWhile
{
	class Program
	{
		public static void MultiplosRango(int inicio, int fin, int num)
		{
			int aux;
			if (fin < inicio)
			{
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			int i;
			int mult;
			int suma;
			int cont;
			cont = 0;
			suma = 0;
			i = inicio;
			Console.WriteLine("Tabla del "+num);
			while (i<= fin) {
				mult = i * num;
				cont++;
				Console.WriteLine(+cont+") "+num+"*"+i+"="+mult);
				suma = suma + mult;
				
				i++;
			}
			double promedio;
			promedio = (suma)*1.0 / cont;
			Console.WriteLine("Cantidad multiplos -->"+cont);
			Console.WriteLine("Suma multiplos -->"+suma);
			Console.WriteLine("Promedio multiplos --> "+promedio);

		}

		static void Pregunta1(int n)
		{
			Console.WriteLine("Pregunta 1");
			int aux;
			aux = 1;
			for (int i = 1; i<=n; i++) {
				for (int cont = 1; cont<=i; cont++) {
					Console.Write(aux+"| ");
					aux++;
					if (aux > n) {
						break;
					}

				}
				if (aux > n) break;
				Console.WriteLine();
			}

		}
		static void Pregunta2(int n)
		{
			Console.WriteLine("Pregunta 2");
			int i;
			int cont;
			i = 1;
			cont = 1;
			while (i<=n) {
				while (cont<=i) {
					Console.Write(cont);
					cont++;
				}
				cont = 1;
				i++;
				Console.WriteLine();
			}

			//i = 1;
			i = n-1;

			while (i >=1) {
				while (cont <= i)
				{
					Console.Write(cont);
					cont++;
				}
				cont = 1;
				i--;
				Console.WriteLine();
			}
		}

		static void Pregunta3(int n)
		{
			Console.WriteLine("Pregunta 3");
			int i;
			int cont;
			i = n;
			cont = 1;

			while (i >= 1)
			{
				while (cont <= i)
				{
					Console.Write(cont);
					cont++;
				}
				cont = 1;
				i--;
				Console.WriteLine();
			}

			i = 2;
			while (i <= n)
			{
				while (cont <= i)
				{
					Console.Write(cont);
					cont++;
				}
				cont = 1;
				i++;
				Console.WriteLine();
			}
		}

		static void Main(string[] args)
		{
			
			Pregunta1(16);
			Console.WriteLine("  ");

			Pregunta2(8);
			Console.WriteLine("");

			Pregunta3(10);
			Console.WriteLine();
		}
	}
}
