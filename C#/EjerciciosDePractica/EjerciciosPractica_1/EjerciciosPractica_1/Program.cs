using System;

namespace EjerciciosPractica_1
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

			int hora;
			int min;
			int seg;

			hora = 20;
			min = 50;
			seg = 0;

			if (hora < 0 || hora > 23 || min < 0 || min > 59 || seg < 0 || seg > 59)
			{
				Console.WriteLine("Error digite nuevamente los datos");
			}
			else{
				Console.WriteLine("La hora que digitó es: "+hora+"h "+min+"min "+seg+"seg");
				Console.WriteLine("Si se resta un segundo seria: ");

				seg = seg - 1;
				if (seg<0) {
					seg = 59;
					min = min - 1;
				}
				if (min<0) {
					min = 59;
					hora = hora -1;
				}
				if (hora<0) {
					hora = 23;
				}

				Console.WriteLine(hora+" "+min+" "+seg+"");
			}

			Console.ReadLine();
		}
	}
}
