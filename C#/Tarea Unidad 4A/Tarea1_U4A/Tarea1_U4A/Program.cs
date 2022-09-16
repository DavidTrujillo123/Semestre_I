using System;
/*Tarea 01.-
Crear un arreglo de n posiciones y llenarlo con los múltiplos de un número en particular, imprimir 
su resultado.
 */
namespace Tarea1_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int n;
			int numero;
			int cont;
			cont = 0;

			numero = 2;
			n = 100;

			int[] multiplos = new int [n];

			Console.WriteLine("El numero de elementos es: "+n);
			for (int i = 0; i < n; i++) {
				multiplos[i] = (i+1)*numero;
			}

			Console.WriteLine("Multiplos del " + numero);
			foreach (int i in multiplos) {	
				cont++;
				Console.WriteLine(cont + "*" + numero + "=" + i);
			}

			Console.ReadKey();

		}
	}
}
