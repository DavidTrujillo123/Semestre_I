using System;

namespace Metodos
{
	class Program
	{

		public static double AreaDelCirculo (double radio){
			double area = Math.PI * radio * radio;
			return area;

		}
		static void Main(string[] args)
		{
			double area1;

			area1 = AreaDelCirculo(2);
			Console.WriteLine(area1);

			Console.ReadLine();
		}

	}
}
