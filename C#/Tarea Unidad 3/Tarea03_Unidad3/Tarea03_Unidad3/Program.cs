using System;
/* Tarea 03.- Realizar una aplicación que calcule el Factorial de un número
  Factorial:
	5!=1*2*3*4*5 = 120
 */
namespace Tarea03_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
			/*int num;
			int factorial;
			factorial = 1;
			num = 5;

			//for
			for (int i = 1; i <=num ; i++)
			{
				factorial = factorial * i;			
			}

			Console.WriteLine(num+"!= "+factorial);

			Console.WriteLine("");

			//while
			int a;
			int factorial1;
			factorial1 = 1;
			a = 1;

			while (a <= num) {
				factorial1 = factorial1 * a;
				a++;
			}
			Console.WriteLine(num + "!= " + factorial1);
			
			Console.ReadKey();
			*/


			string texto = "Bienvenidos todos";
			int aux;
			aux = 0;
			foreach (char letras in texto) {
				if (letras == 'o')
				{
					aux++;
				}

			}

			Console.WriteLine(aux);

		}
	}
}
