using System;
/* Tarea de repaso 1 - Que pida un número del 1 al 5 y diga si es primo o no
 */
namespace TareaDeRepaso_1
{
	class Program
	{
		static void Main(string[] args)
		{

            int numero;

            numero = 2;

            if (numero <= 0 && numero < 5)
            {
                Console.WriteLine("Error! Vuelva a ingresar un número");
            }
            else
            {
                if (numero == 4)
                {
                    Console.WriteLine("El numero " + numero + " es primo");
                }
                else
                {
                    Console.WriteLine("El numero " + numero + " no es primo");
                }
            }


        }
	}
}
