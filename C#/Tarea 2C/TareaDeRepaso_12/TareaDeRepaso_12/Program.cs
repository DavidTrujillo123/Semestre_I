using System;
/*Tarea de repaso 12 - Que tome dos números del 1 al 5 y diga si ambos son primos.
 */
namespace TareaDeRepaso_12
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenidos!");

            int a, b;

            a = 3;
            b = 3;

            if (a <= 0 || a > 5 | b <= 0 || b > 5)
            {
                Console.WriteLine("Error! Ingrese nuevamente los datos");

            }
            else
            {
                if (a == 4 && b == 4)
                {
                    Console.WriteLine("Ambos son primos");
                }
                else if (a != 4 && b != 4)
                {
                    Console.WriteLine("Ambos no son primos");
                }
                else
                {
                    if (a == 4)
                    {
                        Console.WriteLine("El nuemero " + a + " es primo y el numero " + b + " no es primo");
                    }
                    else
                    {
                        Console.WriteLine("El nuemero " + b + " es primo y el numero " + a + " no es primo");
                    }
                }
            }

        }
	}
}
