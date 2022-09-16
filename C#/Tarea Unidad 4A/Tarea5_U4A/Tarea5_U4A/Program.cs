using System;
/*Tarea 05.-
Construir una aplicación que me permita encontrar el número mayor y el número menor de 
una serie de números ingresados por teclado, como primera entrada se le dará el tamaño del 
arreglo y luego los datos. 
 */
namespace Tarea5_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int n;
			//Console.WriteLine("Digite un numero de elementos");
			//n = int.Parse(Console.ReadLine());
			n = 5;
			int[] num = new int[n];
			int menor = 99999;
			int mayor = 0;

			for (int i = 0; i < n; i++) {
				Console.Write((i+1)+". Digite un número: ");
				num[i] = int.Parse(Console.ReadLine());
			}

			for (int i = 0; i < n; i++)
			{
				if (num[i] < menor) menor = num[i];
				
				if (num[i] > mayor) mayor = num[i];
			}

			Console.WriteLine("");
			if (mayor != menor)
			{
				Console.WriteLine("El número mayor es: " + mayor);
				Console.WriteLine("El número menor es: " + menor);
			}
			else Console.WriteLine("Todos los numeros son iguales");
			Console.ReadKey();
		}
	}
}
