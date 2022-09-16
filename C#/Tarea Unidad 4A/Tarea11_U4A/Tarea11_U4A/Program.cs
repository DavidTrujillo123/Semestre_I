using System;
/*Tarea 11.-
Suponga un array con N números enteros generados aleatoriamente y mostrados en pantalla, 
N debe ser un número impar, mostrar en pantalla el valor que ocupa el centro del array. 
 */
namespace Tarea11_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int n;
			int n1;
			int pos;

			Console.Write("Digite un numero de elementos impar: ");
			n = int.Parse(Console.ReadLine());

			if (n % 2 == 0)
			{
				n1 = n + 1;
				Console.WriteLine("Se cambio los elementos a "+n1);
			}
			else n1 = n;

			pos = n1 / 2;

			int[] num;
			num = new int[n1];

			Console.WriteLine();
			for (int i = 0; i < n1; i++)
			{
				Console.Write((i+1)+". Digite un numero: ");
				num[i]= int.Parse(Console.ReadLine());

			}

			Console.WriteLine("\nArreglo");
			foreach (int i in num)	Console.Write(i + " ");
			
			Console.WriteLine("");
			Console.WriteLine("");
			Console.WriteLine("Posicion centro: "+pos);
			Console.WriteLine("Valor: "+num[pos]);
			Console.ReadKey();
		}
	}
}
