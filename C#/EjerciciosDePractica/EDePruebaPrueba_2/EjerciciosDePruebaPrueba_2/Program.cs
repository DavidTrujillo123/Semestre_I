using System;

namespace EjerciciosDePruebaPrueba_2
{
	class Program
	{
		static String Sol(int a, int b, int c)
		{
			double x1;
			double x2;
			double raiz;
			raiz = (b * b) - (4 * a * c);
		
			if (raiz < 0)
			{
				raiz = raiz * (-1);
				x1 = ((-b + Math.Sqrt(raiz)) / (2 * a));
				x2 = ((-b - Math.Sqrt(raiz)) / (2 * a));
				return "Las soluciones son x1="+x1 + "i  y  x2=" + x2+"i";
			}
			else
			{
				x1 = ((-b + Math.Sqrt(raiz)) / (2 * a));
				x2 = ((-b - Math.Sqrt(raiz)) / (2 * a));
				return "Las soluciones son x1="+x1+" y x2=" + x2;
			}
			
			
		}

		static void Main(string[] args)
		{
			int a, b, c;

			a = 25;
			b = 60;
			c = 36;

			Console.WriteLine(Sol(a,b,c));

		}
	}
}
