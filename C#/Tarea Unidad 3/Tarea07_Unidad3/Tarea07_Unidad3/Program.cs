using System;
/*Tarea 07.- Imprimir la serie de Fibonacci dado un límite máximo
  0,1,1,2,3,5,8......
 */
namespace Tarea07_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
			int a;
			int b;
			int c;
			int lim;

			a = 0;
			b = 1;
			lim = 8;

			//for
			for (int i = 1; i <= lim; i++)
			{
				Console.WriteLine(i+".- "+a);
				c = a + b;
				a = b;
				b = c;
			}

			Console.WriteLine("");
			//while
			a = 0;
			b = 1;
			int aux;
			aux = 1;
			while (aux <= lim)
			{
				Console.WriteLine(aux + ".- " + a);
				c = a + b;
				a = b;
				b = c;
				aux++;
			}
		}
	}
}
