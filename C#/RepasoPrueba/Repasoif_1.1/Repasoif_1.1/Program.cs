using System;

namespace Repasoif_1._1
{
	class Program
	{
		public static void Investigacion()
		{
			String s1;
			s1 = "Hola mundo bienvenidos";
			
			Console.WriteLine(s1.Contains("hola"));
		

		}

		public static double Potencia(int x, int n)
		{
			double result;
			result = 1;
			int i;
			i = 1;

			while (i<=n) {
				result = x * result;
				i++;
			}
			return result;
		}

		public static double Factorial(int x)
		{
			int fact;
			fact = 1;
			for (int i=1; i<=x; i++) {
				fact = fact * i;
			}
			return fact;
		}

		public static double Seno(int x, int n)
		{
			int i;
			int j;
			double suma_pares=1;
			double suma_impares=1;
			double a;
			i = 1;
			j = 3;
			while (i<=n) {
				suma_pares = (Potencia(x, i)) / Factorial(x);
				suma_pares = suma_pares + suma_pares;
				i +=4;
			}

			while (j <= n)
			{
				suma_impares= ((-1)*Potencia(x, j)) / Factorial(x);
				suma_impares = suma_impares + suma_impares;
				j += 4;
			}

			return suma_impares + suma_pares;
			
		}
		static void Main(string[] args)
		{
			
			Console.WriteLine(Seno(2, 40));
		}
	}
}
