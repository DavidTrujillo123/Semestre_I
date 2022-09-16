using System;
/*
  Tarea de repaso 2 - Que pida un número y diga si es par o impar
 */

namespace TareaDeReapaso_2
{
	class Program
	{
		static void Main(string[] args)
		{

            int numero;

            numero = 168;

            if (numero % 2 == 0)
            {
                Console.WriteLine("El número " + numero + " es par");
            }
            else
            {
                Console.WriteLine("El número " + numero + " es impar");
            }
        }
	}
}
