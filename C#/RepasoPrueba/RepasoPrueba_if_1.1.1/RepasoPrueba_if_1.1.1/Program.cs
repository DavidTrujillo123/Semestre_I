using System;

namespace RepasoPrueba_if_1._1._1
{
	class Program
	{
		static bool AñoBisisesto(int año)
		{

			if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0))
			{
				return true;

			}
			else return false;

		}

		static int EdadC(int pedro, int pablo, int juan)
		{
			// 0 -> edades iguales
			// 1 -> Contemporaneos Pedro y Pablo
			// 2 -> Contemporaneos Pedro y Juan
			// 3 -> Contemporaneos Juan y Pablo
			// 4 -> Ninguno es contemporaneo
			if (pedro == pablo)
			{
				if (pedro == juan) return 0;
				else return 1;
			}
			else
			{
				if (pedro == juan) return 2;
				else {
					if (juan == pablo) return 3;
					else return 4;
				}
			}

		}

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

			return hora + " " + min + " " + seg;
		}


		static void Main(string[] args)
		{
			/*int año;
			año = 1800;

			if (AñoBisisesto(año)==true) Console.WriteLine("El año es bisiesto");
			else Console.WriteLine("No es bisiesto");
			*/

			/*int pedro;
			int pablo;
			int juan;

			pedro = 10;
			pablo = 30;
			juan = 20;

			if (EdadC(pedro, pablo, juan) == 0) Console.WriteLine("Los tres son contemporaneos"); 
			else if (EdadC(pedro, pablo, juan) == 1) Console.WriteLine("Pedro y Pablo son contemporaneos");
			else if (EdadC(pedro, pablo, juan) == 2) Console.WriteLine("Pedro y Juan son contemporaneos");
			else if (EdadC(pedro, pablo, juan) == 3) Console.WriteLine("Juan y Pablo son contemporaneos");
			else Console.WriteLine("Ninguno es contemporaneo");
			*/

			Console.WriteLine(Tiempo(0, 0, 0) );
			Console.WriteLine(Tiempo(0, 59, 0));
			Console.WriteLine(Tiempo(1, 0, 0));
			Console.WriteLine(Tiempo(12, 50, 59));
		}
	}
}
