using System;
/*
1h 59min 59seg				1h 50min 56seg				23h 59min 59seg			0h 0min 0seg
+ 1 seg						+1seg						+1seg

2h 0min 0seg				1h 50min 57seg				0h 0min 0seg
-----------------

	*/
namespace RepasoIf_1
{
	class Program
	{
		static String Tiempo( int hora, int min, int seg)
		{
			if (hora <= 23 && min <= 59 && seg <= 59)
			{
				if (seg == 59 && min == 59 && hora == 23)
				{
					seg = 0;
					min = 0;
					hora = 0;
				}
				else
				{
					if (seg == 59)
					{
						seg = 0;
						if (min == 59)
						{
							min = 0;
							hora++;
						}
						else
						{
							min++;
						}
					}
					else
					{
						seg++;
					}

				}

				return (hora + "h " + min + "min " + seg+"seg");
			}
			else
			{
				return "error!";
			}
		}

		static void Main(string[] args)
		{
			int hora;
			int min;
			int seg;

			hora = 23;
			min = 58;
			seg = 59;
			
			Console.WriteLine("Su tiempo inicial es: "+hora+"h "+min+"min "+seg+"seg" );
			Console.WriteLine("+1 segundo");
			Console.WriteLine(Tiempo(hora,min,seg));
			

			Console.ReadKey();
		}
	}
}
