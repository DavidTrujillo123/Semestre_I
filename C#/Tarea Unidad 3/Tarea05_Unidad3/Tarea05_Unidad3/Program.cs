using System;
/*Tarea 05.- Imprimir las potencias de 2 de los números de un rango definido
 */
namespace Tarea05_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
			int inicio;
			int fin;
			int aux;
			inicio = 15;
			fin = 10;

			if (fin < inicio) {
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			//for
			for (int i = inicio; i <= fin; i++) {
				Console.WriteLine(i+"*"+i+"="+i*i);

			}

			Console.WriteLine("");

			//while
			int a;
			a = inicio;

			while (a <= fin)
			{
				Console.WriteLine(a+"*"+a+"="+a * a);
				a++;
				
			}
		}
	}
}
