using System;
/* Tarea 06.- Imprimir los números pares e impares en un rango
 */
namespace Tarea06_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
			int inicio;
			int fin;
			int aux;
			inicio = 10;
			fin = 15;


			if (fin < inicio) {
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			//for
			Console.WriteLine("Pares");
			for (int i = inicio; i <= fin; i +=2) {
				Console.WriteLine(i);
			}

			Console.WriteLine("");

			Console.WriteLine("Impares");
			for (int i = inicio+1; i <= fin; i +=2 )
			{
				Console.WriteLine(i);
			}

			Console.WriteLine("");

			//while
			int a;
			a = inicio;

			Console.WriteLine("Pares");
			while (a <= fin)
			{
				Console.WriteLine(a);
				a += 2;

			}

			Console.WriteLine("");

			Console.WriteLine("Impares");

			a = inicio + 1;
			while (a <= fin) {
				Console.WriteLine(a);
				a += 2;
			}

		}
	}
}
