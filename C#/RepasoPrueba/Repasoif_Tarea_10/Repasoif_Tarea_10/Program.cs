using System;
/*
 Tarea 11: Uso del IF
Dadas dos fechas en el formato día (1 a 31), mes (1 a 12) y año (entero de cuatro dígitos), 
correspondientes a la fecha de nacimiento y fecha actual, respectivamente. Redactar un 
programa que deduzca y visualice la edad del individuo expresada en días, meses y años
 */
namespace Repasoif_Tarea_10
{
	class Program
	{

		static void Main(string[] args)
		{
			int diaAct, diaNac, diaTotal;
			int mesAct, mesNac, mesTotal;
			int añoAct, añoNac, añoTotal;

			diaAct = 21;
			mesAct = 11;
			añoAct = 2000;

			diaNac = 18;
			mesNac = 05;
			añoNac = 2000;

			if (diaAct < diaNac)
			{
				diaAct += 30;
				mesAct--;
				
			}
			if (mesAct < mesNac) {
				mesAct += 12;
				añoAct -= 1;
			
			}
			


			diaTotal = diaAct - diaNac;
			mesTotal = mesAct - mesNac;
			añoTotal = añoAct - añoNac;

			Console.WriteLine(añoTotal+"/"+mesTotal+"/"+diaTotal);
		}
	}
}
