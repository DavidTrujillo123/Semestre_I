using System;

namespace RepasoPrueba_2
{
	class Program
	{

		

		static void Main(string[] args)
		{
			
			double a;
			double b;
			double c;
			double raiz;
			double x1,x2;

			a = 1;
			b = 2;
			c = 3;


			raiz = (b * b) - (4 * a * c);

			//Console.WriteLine("Su ecuacion es :"+a+"x^2"+b+"x"+c);
			Console.WriteLine("Soluciones...");
			if (raiz < 0)
			{
				raiz = raiz * -1;
				x1 = (-b + Math.Sqrt(raiz)) / (2 * a);
				x2 = (-b - Math.Sqrt(raiz)) / (2 * a);
				if (x1 == x2)
				{
					Console.WriteLine("x =" + x1+"i");
				}
				else
				{
					Console.WriteLine("x1 ="+x1+"i");
					Console.WriteLine("x2 ="+x2+"i");
				}

			}
			else
			{
				x1 = (-b + Math.Sqrt(raiz)) / (2 * a);
				x2 = (-b - Math.Sqrt(raiz)) / (2 * a);
				if (x1 == x2)
				{
					Console.WriteLine("x =" + x1 );
				}
				else
				{
					Console.WriteLine("x1 =" + x1);
					Console.WriteLine("x2 =" + x2);
				}
			}

		}
	}
}
