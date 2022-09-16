using System;
/* Tarea 12.- Realizar un Método que me permita calcular la factorial de un número y 
probar su funcionamiento.
 */
namespace Tarea12_Unidad3
{
	class Program
	{
		static int Factorial(int num)
		{

			int fac;
			fac = 1;

			//for
			for (int i=1; i<=num; i++) {
				fac = fac * i;
			}
			return fac;
			
			//while
			int a;
			int fac1;
			fac1 = 1;
			a = 1;

			while (a <= num)
			{
				fac1 = fac1 * a;
				a++;
			}

			return fac1;
		}

		static void Main(string[] args)
		{
			int num;
			num = 3;

			Console.WriteLine(num+"!= "+Factorial(num));

			Console.ReadKey();
		}
	}
}
