using System;
/*Tarea 02.- Imprimir los números en orden ascendente y descendente en un rango 
entre inicio y fin
 */

namespace Tarea02_Unidad3
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
				aux = inicio;
				inicio = fin;
				fin = aux;
			}

			//for
			Console.WriteLine("Incremento");

			for (int i=inicio; i<=fin; i++) {
				Console.WriteLine(i);

			}

			Console.WriteLine("");

			Console.WriteLine("Decremento");

			for (int i = fin ; i >= inicio; i--)
			{
				Console.WriteLine(i);

			}

			Console.WriteLine("");

			//while
			int a;
			a = inicio;
			Console.WriteLine("");
			Console.WriteLine("Incremento");
			while (a <= fin)
			{
				Console.WriteLine(a);
				a++;
			}

			Console.WriteLine("");
			Console.WriteLine("Decremento");
			a = fin;
			while (a >= inicio)
			{
				Console.WriteLine(a);
				a--;
			}

			Console.ReadKey();
		}
	}
}
