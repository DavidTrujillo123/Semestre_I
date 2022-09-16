using System;
/*Tarea 12.-
Suponga un array con N notas de 0 a 10, calcule el promedio de aprobados y el promedio de 
los desaprobados e indique la cantidad de aprobados y desaprobados (Se aprueba con una 
nota >= 7). 
 */
namespace Tarea12_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int[] notas;
			double prom_aprobados, prom_desaprobados;
			int aprobados, desaprobados;
			int n;
			n = 5;
			aprobados = 0;
			desaprobados = 0;

			notas = new int [n];

			for (int i= 0; i<n; i++) {
				Console.Write((i+1)+". Digite una nota: ");
				notas[i] = int.Parse(Console.ReadLine());
			}

			for (int i = 0; i <n ; i++)
			{
				if (notas[i] >= 7) aprobados++;
				else desaprobados++;
				
			}

			prom_aprobados = (aprobados*1.0) / n;
			prom_desaprobados = (desaprobados*1.0) / n;


			if (aprobados == 0) Console.WriteLine("No existen aprobados");
			else Console.WriteLine("Promedio Aprobados "+prom_aprobados);

			if (desaprobados == 0) Console.WriteLine("No existen reprobados");
			else Console.WriteLine("Promedio Desaprobados "+prom_desaprobados);

			Console.WriteLine("Cantidad Aprobados "+aprobados);
			Console.WriteLine("Cantidad Desaprobados "+desaprobados);
			Console.ReadKey();
		}
	}
}
