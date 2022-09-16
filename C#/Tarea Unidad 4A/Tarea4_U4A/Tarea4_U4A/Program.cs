using System;
/*Tarea 04.-
Pedir por teclado el tamaño de un arreglo de números y pedir los valores numéricos con los que 
se rellena. Los valores no se pueden repetir. Mostrar el arreglo con los valores al final.
 */
namespace Tarea4_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int tamaño;
			
			//Console.WriteLine("Digite el tamaño del arreglo");
			//tamaño = int.Parse(Console.ReadLine());
			tamaño = 5;
			
			int[] num = new int [tamaño];

			for (int i = 0; i < tamaño; i++) {

				Console.Write((i+1)+". Digite un numero: ");
				num[i] = int.Parse(Console.ReadLine());

				for (int j = 0; j < i; j++)
				{
					if (num[i] == num[j])
					{
						Console.WriteLine("Error, no repita el número");
						i--;
					}

				}
				
			}

			Console.WriteLine("Su arreglo es: ");
			foreach (int i in num) {
				Console.Write(i+" ");
			}

			Console.ReadKey();
		}
	}
}
