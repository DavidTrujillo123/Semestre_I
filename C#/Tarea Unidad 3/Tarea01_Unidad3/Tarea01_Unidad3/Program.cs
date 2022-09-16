using System;
/* Tarea 01.- Imprimir los números en orden descendente del 10 a 1
 */
namespace Tarea01_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{

			// For
			Console.WriteLine("For..." );
			for (int i = 10; i >= 1; i--)
				Console.WriteLine("Num: "+i);

			Console.WriteLine("");

			//while
			Console.WriteLine("While...");
			int a;
			a = 10;

			while (a >= 1)
			{
				Console.WriteLine("Num: " + a);
				a--;
				
			}
		}
	}
}
