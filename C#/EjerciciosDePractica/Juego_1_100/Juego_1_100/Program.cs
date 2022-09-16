using System;
/*
 JUEGO 1 AL 100
 */

namespace TareaInvertigacionCiclos
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido al juego del 100!");

			int aleatorio;

			aleatorio = new Random().Next(1, 100);



			for (int i = 1; i <= aleatorio; i++)
			{
				//Console.WriteLine(i);
				Console.WriteLine("Ingrese un numero entre 1 y 100: ");
				int numero = int.Parse(Console.ReadLine());


				if (numero > aleatorio)
				{
					Console.WriteLine("Es alejandose\n");

				}
				else
				{
					if (numero < aleatorio)
					{
						Console.WriteLine("Es acercandose\n");
					}

					else
					{
						Console.WriteLine("FELICIDADES!!");
						Console.WriteLine("Su numero de intentos fue: " + i);
						Console.WriteLine("Fin del juego...");
						i = aleatorio;
					}
				}

			}

			Console.ReadLine();
		}
	}
}
