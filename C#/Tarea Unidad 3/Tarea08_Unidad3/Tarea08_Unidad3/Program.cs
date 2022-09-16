using System;
/* Tarea 08.- Realizar una aplicación que me imprima si un número es Primo o no.
 */
namespace Tarea08_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
			int num;
			int cont;
			cont = 0;
			num = 100;

			//for
			for (int i = 1; i <= num; i++){
				if (num % i == 0) cont++;
			}
			if (cont <= 2 && num != 1 & num != 0) Console.WriteLine("El numero "+num+" es primo");
			else Console.WriteLine("El numero "+num+" no es primo");

			Console.WriteLine("");

			//while
			int a;
			cont = 0;
			a = 1;

			while (a <= num)
			{
				if (num % a == 0) cont++;
				a++;
			}
			if (cont <= 2 && num != 1 & num != 0) Console.WriteLine("El numero " + num + " es primo");
			else Console.WriteLine("El numero " + num + " no es primo");
		}
	}
}
