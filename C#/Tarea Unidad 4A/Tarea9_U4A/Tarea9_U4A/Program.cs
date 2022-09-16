using System;
/*Tarea 09.-
Crear una aplicación que me cree un arreglo y lo llene con números aleatorios del 1 al 100. 
Luego ingrese un número y me indique si este existe en el arreglo y en que posición se 
encuentra. 
*/
namespace Tarea9_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int num; 

			Random aleatorio = new Random();

			int[] arreglo;
			arreglo = new int[100];

			for (int i = 0; i < arreglo.Length; i++)
			{
				arreglo[i] = aleatorio.Next(1,100);
			}

			//Array.Sort(arreglo);
			//foreach (int i in arreglo)
			//{
			//	Console.WriteLine(i);
			//}

			Console.Write("Digite un numero: ");
			num = int.Parse(Console.ReadLine());

			for (int i = 0; i < arreglo.Length; i++)
			{
				if (arreglo[i] == num)
				{
					Console.WriteLine("Su numero es: " + arreglo[i]);
					Console.WriteLine("Esta en la posicion: " + i);
					break;
				}
				else if (i == arreglo.Length - 1) Console.WriteLine("Su numero no existe en el arreglo");
			}
			Console.ReadKey();
		}
	}
}
