using System;

namespace EjerciciosDePractica_Prueba
{
	class Program
	{
		static String Tiempo(int hora, int min, int seg) {

			if (seg == 59)
			{
				seg = 0;
				if (min == 59)
				{
					min = 0;
					if (hora == 23)
					{
						hora = 0;
					}
					else hora++;
				}
				else min++;
			}
			else seg++;

			return hora + "h " + min + "min " + seg + "seg";
		}


		static void Main(string[] args)
		{
			int hora;
			int min;
			int seg;

			hora = 23;
			min = 59;
			seg = 50;

			Console.WriteLine("Su hora inicial es "+hora+"h "+min+"min "+seg+"seg");
			Console.WriteLine("+1seg");
			Console.WriteLine("Su hora es: "+Tiempo(hora,min,seg));

			Console.ReadKey();

		}
	}
}
