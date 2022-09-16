using System;
/*Tarea 02.-
Crear un arreglo de n posiciones y llenarlo con los múltiplos de un número en particular, imprimir 
su resultado de forma inversa a como fue llenado.
 */
namespace Tarea2_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int n;
			int numero;
			int cont;

			numero = 5;
			n = 5;
			cont = n;

			int[] multiplos = new int[n];

			Console.WriteLine("El numero de elementos es: " + n);
			for (int i = 0; i < n ; i++)
			{
				multiplos[i] = (i + 1) * numero;
			}


			for (int i = n-1; i >= 0; i--)
			{
				Console.WriteLine(cont+"*"+numero+"="+multiplos[i]);
				cont--;
			}

			Console.ReadKey();
		}
	}
}
