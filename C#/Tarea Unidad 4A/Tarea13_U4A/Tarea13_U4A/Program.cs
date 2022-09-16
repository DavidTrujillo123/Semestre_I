using System;
/*Suponga un array que contiene N notas de 0 a 20 generados aleatoriamente y mostradas en 
pantalla, de acuerdo a la nota contenida, indique cuántos estudiantes son: 
Deficientes 0-5 
Regulares 6-10 
Buenos 11-15 
Excelentes 16-20
 */
namespace Tarea13_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			Random aleatorio = new Random();

			int alumnos;
			alumnos = 10;
			int deficientes, regulares, buenos, excelentes;
			deficientes = 0;
			regulares = 0;
			buenos = 0;
			excelentes = 0;

			int [] arreglo;
			arreglo = new int[alumnos];

			for (int i = 0; i < arreglo.Length; i++)
			{
				arreglo[i] = aleatorio.Next(0, 20);
			}

			Console.WriteLine("NOTAS:");
			for (int i = 0; i < arreglo.Length; i++) Console.WriteLine((i+1)+". "+arreglo[i]);

			for (int i = 0; i < arreglo.Length; i++)
			{
				if (arreglo[i] >= 0 && arreglo[i] <= 5) deficientes++;
				else if (arreglo[i] >= 6 && arreglo[i] <= 10) regulares++;
				else if (arreglo[i] >= 11 && arreglo[i] <= 15) buenos++;
				else excelentes++;

			}

			Console.WriteLine("\nAlumnos Totales: "+alumnos);
			Console.WriteLine("Deficientes(0-5)-->"+deficientes);
			Console.WriteLine("Regulares(6-10)-->"+regulares);
			Console.WriteLine("Buenos(11-15)-->"+buenos);
			Console.WriteLine("Excelentes(16-20)-->"+excelentes);
			Console.ReadKey();
		}
	}
}
