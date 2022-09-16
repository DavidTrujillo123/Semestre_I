using System;
/*Tarea 09.- Realizar una aplicación que me imprima todos los números primos en un 
rango entre inicio y fin
 */
namespace Tarea09_Unidad3
{
	class Program
	{
		static bool Primo(int num)
		{
			int cont;
			cont = 0;
			for (int i = 1; i <= num; i++)
			{
				if (num % i == 0 ) cont++;
			}
			if (cont <= 2 && num!=1 && num!=0) return true;
			else return false;

		}
		static void Main(string[] args)
		{
			int inicio;
			int fin;
			int aux;
			inicio = 10;
			fin = 20;


			if (fin < inicio) {
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			for (int i=inicio; i<=fin; i++) {
				if (Primo(i) == true) Console.WriteLine(i);
			}

			Console.WriteLine("");

			//while 
			int a;
			a = inicio;
			while (a <= fin)
			{
				if (Primo(a) == true) Console.WriteLine(a);
				a++;
			}

		}
	}
}
