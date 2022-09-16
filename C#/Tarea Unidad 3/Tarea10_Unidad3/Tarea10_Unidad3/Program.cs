using System;
/* Tares 10.- Realizar una aplicación que me imprima las letras del alfabeto en 
mayúsculas y minúsculas.
 */
namespace Tarea10_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
			char min;
			char may;
			
			

			for (int i = 0; i <= 25; i++)
			{
				min = (char)('a' + i);
				Console.WriteLine(min);
				may = (char)('A' + i);
				Console.WriteLine(may);
			}

			Console.WriteLine("");
			int aux;
			char min1;
			char may1;
			aux = 0;
			
			while (aux <= 25)
			{
				min1 = (char)('a' + aux);
				Console.WriteLine(min1);
				may1 = (char)('A' + aux);
				Console.WriteLine(may1);
				aux++;
			}

		}
	}
}
