using System;
/*Tarea 10.- Realizar un método que me retorne la suma de dos números.
 */
namespace TareaMetodos_10
{
	class Program
	{

		public static double suma(double a, double b)
		{
			return (a + b);

		}

		static void Main(string[] args)
		{

			double suma1;
			double numA, numB;

			numA = 10.75;
			numB = 3.56;

			suma1 = suma(numA, numB);

			Console.WriteLine("La suma de " + numA + " + " + numB + " = " + suma1);

			Console.ReadLine();
		}
		
	}
}
