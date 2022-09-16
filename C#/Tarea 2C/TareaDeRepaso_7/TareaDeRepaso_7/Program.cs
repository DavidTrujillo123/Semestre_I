using System;
/*Tarea de repaso 7 - Que pida un número y diga si es positivo o negativo
 */

namespace TareaDeRepaso_7
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            double num;

            //Console.WriteLine("Digite un numero para saber si es positivo o negativo");
            num = 25;

            if (num > 0)
            {
                Console.WriteLine("El número " + num + " es positivo");
            }
            else if (num < 0)
            {
                Console.WriteLine("El número " + num + " es negativo");
            }
            else
            {
                Console.WriteLine("El número es cero");
            }

        }
	}
}
