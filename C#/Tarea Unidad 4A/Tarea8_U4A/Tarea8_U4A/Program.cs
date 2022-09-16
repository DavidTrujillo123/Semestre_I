using System;
/*Tarea 08.-
Crear una aplicación que me cree un arreglo unidimensional y que me vaya ingresando 
números por teclado y los almacene en el arreglo de forma ordenada ascendente. 
 */
namespace Tarea8_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int n = 5;
			int[] num = new int[n];
			int[] num_orig = new int[n];
			int aux, pos;
			int j = 0;

			for (int i = 0; i < num.Length; i++)
			{
				Console.Write((i+1)+". Digite un numero: ");
				num[i] = int.Parse(Console.ReadLine());
				num_orig[i] = num[i];
				pos = i;

				//ordena
				while (pos != 0 && j <= i)
				{
					if (num[pos] < num[pos - 1])
					{
						aux = num[pos];
						num[pos] = num[pos - 1];
						num[pos - 1] = aux;
						pos--;
					}
					j++;
				}
				j = 0;
			}

			Console.WriteLine();
			//arreglo original
			Console.WriteLine("Arreglo original");
			foreach (int i in num_orig) Console.Write(i + " ");
			Console.WriteLine();

			//arreglo ordenado
			Console.WriteLine("Arreglo ordenado");
			foreach (int i in num) Console.Write(i + " ");
			Console.ReadKey();
		}
	}
			
}
	

