using System;

namespace EjerciciosDePracticaPrueba_1._1
{
	class Program
	{
		static String Tiempo(int hora, int min, int seg)
		{
			if (seg == 0)
			{
				seg = 59;
				if (min == 0)
				{
					min = 59;
					if (hora == 0)
					{
						hora = 23;
					}
					else hora--;
				}
				else min--;

			}
			else seg--;

			return hora + "h " + min + "min " + seg + "seg";

		}

		static void Main(string[] args)
		{
			int hora, min , seg;
			hora = 0;
			min = 0;
			seg = 30;

			Console.WriteLine("Su hora es "+hora+"h "+min+"min "+seg+"seg" );
			Console.WriteLine("-1 seg");
			Console.WriteLine(Tiempo (hora, min, seg));

			Console.ReadKey();
		}
	}
}
