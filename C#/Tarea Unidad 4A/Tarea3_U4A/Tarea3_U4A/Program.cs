using System;
/*Tarea 03.-
Crear un arreglo de n posiciones y llenar un arreglo con números randomicos e imprimir un 
reporte solo con los números de las posiciones pares y otros reporte de los números de las 
posiciones impares.
 */
namespace Tarea3_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			
			int n; //posisiones
			n = 5;
			int[] num = new int[n];

			Random rnd = new Random();
			int random;
			
			for (int i=0; i<=n-1; i++) {
				random = rnd.Next(1, 100);
				num[i] = random;
			}

			int cont;
			cont = 1;
			Console.WriteLine("Arreglo completo");
			foreach (int i in num)
			{
				Console.WriteLine(cont+".- "+i);
				cont++;
			}

			Console.WriteLine("Arreglo posiciones impares");
			for (int i = 0; i <= n-1; i += 2) {
				Console.WriteLine((i+1) + ".- " + num[i]);
			}

			Console.WriteLine("Arreglo posiciones pares");
			for (int i = 1; i <= n - 1; i += 2)
			{
				Console.WriteLine((i + 1) + ".- " + num[i]);
			}
			Console.ReadKey();
		}
	}
}
