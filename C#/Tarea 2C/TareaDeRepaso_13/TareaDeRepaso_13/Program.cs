using System;
/*Tarea de repaso 13 - Que tome dos números y diga si ambos son pares o impares.
 */
namespace TareaDeRepaso_13
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int a, b;

            a = 2;
            b = 3;

            if (a % 2 == 0 && b % 2 == 0)
            {
                Console.WriteLine("Ambos son pares");
            }
            else if (a % 2 != 0 && b % 2 != 0)
            {
                Console.WriteLine("Ambos son impares");
            }
            else
            {
                if (a % 2 == 0)
                {
                     Console.WriteLine("El numero " + a + " es par y el numero " + b + " es impar");
                }
                else
                {
                    Console.WriteLine("El numero " + b + " es par y el numero " + a + " es impar");
                }
            }

        }
	}
}
