﻿using System;
/*Tarea 11.- Realizar un Método que me permita calcular la potencia de un número y 
probar su funcionamiento
 */
namespace Tarea11_Unidad3
{
	class Program
	{
		public static double Potencia(int basse, int exponente)
		{
			int result;
			result = 1;

			//for
			for (int i=1; i <= exponente; i++) {
				result = result * basse;
			}
			return result;
			
			//while
			int a;
			int result1;
			result1 = 1;
			a = 1;
			while (a <= exponente) {
				result1 = result1 * basse;
				a++;
			}
			return result1;

		}

		static void Main(string[] args)
		{
			int basse;
			int exponente;

			basse = 2;
			exponente = 5;
			
			Console.WriteLine(basse+"^"+exponente+"="+Potencia(basse, exponente));

			Console.ReadKey();
		}
	}
}
