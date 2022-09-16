using System;
/*Tarea 06.-
Construir una aplicación que permita encontrar el número mayor y el número menor de una 
serie de números ingresados por teclado, como primera entrada se le dará el tamaño del 
arreglo y luego los datos, también se debe indicar cuantas veces se repiten tanto el mayor 
como el menor. 
 */
namespace Tarea6_U4A
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
			int menor;
			int mayor;
			int contMenor, contMayor;
			contMenor = 0;
			contMayor = 0;
			mayor = 0;
			menor = 99999;

			for (int i = 0; i < n; i++)
			{
				Console.Write((i + 1) + ". Digite un número: ");
				num[i] = int.Parse(Console.ReadLine());
			}

			for (int i = 0; i < n; i++)
			{
				if (num[i] < menor) menor = num[i];

				if (num[i] > mayor) mayor = num[i];
			}

			foreach (int i in num) {
				if (i == menor) contMenor++;
				if (i == mayor) contMayor++;
			}

			Console.WriteLine("");
			if (mayor != menor)
			{
				Console.WriteLine("El número mayor es: " + mayor +" y se repite "+contMayor+" veces");
				Console.WriteLine("El número menor es: " + menor + " y se repite " + contMenor + " veces");
			}
			else Console.WriteLine("Todos los numeros son iguales");
			Console.ReadKey();
		}
	}
}
