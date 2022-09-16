using System;
/*Tarea de repaso 8 -  Que pida una letra y detecte si es una vocal.
 */
namespace TareaDeRepaso_8
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            char letra;
            //Console.WriteLine("Digite una letra minuscula");
            letra = 'C';

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
              || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
            {

                Console.WriteLine("La letra " + letra + " es vocal");
            }
            else
            {
                Console.WriteLine("La letra " + letra + " no es vocal");
            }
        }
	}
}
