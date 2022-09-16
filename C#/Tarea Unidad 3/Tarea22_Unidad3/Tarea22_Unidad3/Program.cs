using System;
/* Tarea 22.- Escribir un programa que solicite la carga de un numero entre 0 y 999, y nos 
muestre un mensaje de cuantos dígitos tiene el mismo. Finalizar el programa cuando 
se cargue el valor 0.
 */
namespace Tarea22_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
			int num;
			int opcion;
			int digitos;
			
			digitos = 0;
			opcion = 1;

			do
			{
				Console.WriteLine("Ingrese un numero, entre 0 y 999");
				num = int.Parse(Console.ReadLine());
				if (num <0 || num > 1000) {
					Console.WriteLine("Error!");
					Console.WriteLine("Fin app...");
					opcion = 0;
				}
				else if (num == 0)
				{
					opcion = 0;
					Console.WriteLine("Fin app...");
				}
				else
				{
					if (num > 0 && num < 10) digitos = 1;
					else if (num < 100 && num >= 10) digitos = 2;
					else if (num < 1000 && num >= 100) digitos = 3;
					Console.WriteLine("El numero " + num + " tiene " + digitos + " digitos");
					Console.WriteLine("");

					Console.WriteLine("¿Desea continuar? 0)No   1)Si");
					opcion = int.Parse(Console.ReadLine());
					Console.WriteLine("");

					if (opcion == 0) Console.WriteLine("Fin app...");
				}
			} while (opcion > 0);

			Console.ReadKey();
		}
	}
}
