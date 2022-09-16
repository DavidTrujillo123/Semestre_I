using System;
/*Definir una aplicación que me permita calcular los submúltiplos de cada uno de los números de un rango determinado.
 * Tiempo de la evaluación 30min.
 * 1.(2) Ingresar el rango a evaluar, la aplicación debe controlar que el rango sea correcto, de ser necesario se debe invertir el rango para que sea correcto.
 * 2.(1) Se debe indicar con un mensaje el número del que se va a visualizar los submúltiplos.
 * 3.(3) Imprimir todos los números que son submúltiplos de cada uno de los números del rango ingresado (no incluir el 1 como submúltiplo). 
 * 4.(1) Imprimir la cantidad de números que son submúltiplos de cada uno de los números del rango ingresado.
 * 5.(1) Imprimir la cantidad de números que no tienen submúltiplos. 
 * 6.(2) Preguntar ¿Desea repetir S/N?, solo se le debe permitir ingresar una de las dos opciones correctas y repetir o salir de la aplicación según lo ingresado (Usar do..while).
 * 
 */
namespace AL_E03_DavidTrujillo
{
	class Program
	{
		static void Main(string[] args)
		{
			int inicio;
			int fin;
			int aux;
			inicio = 10;
			fin = 20;

		

			int contmultiplos=0;
			int mult=0;
			int contceros = 0;
			char condicion;
			do
			{
				Console.Write("Digite un inicio: ");
				inicio = int.Parse(Console.ReadLine());
				Console.Write("Digite un fin: ");
				fin = int.Parse(Console.ReadLine());
				Console.WriteLine();
				
				if (fin < inicio)
				{
					aux = fin;
					fin = inicio;
					inicio = aux;
				}

				Console.WriteLine("RANGO ");
				for (int i = inicio; i <= fin; i++)
				{
					Console.Write(i + ",");
				}
				Console.WriteLine();

				for (int i = inicio; i <= fin; i++)
				{
					Console.WriteLine("Multiplo: " + i);
					for (int j = 1; j < i; j++)
					{
						if (i % j == 0 && j > 1)
						{
							contmultiplos++;
							mult = j;
							Console.WriteLine(mult);
						}
						mult = 0;
					}
					if (contmultiplos == 0)
					{
						contceros++;
						Console.WriteLine(mult);
					}
					
					Console.WriteLine("Submultiplo Cantidad " + contmultiplos);
					Console.WriteLine();
					contmultiplos = 0;
					
				}
				Console.WriteLine("Cantidad submultiplos cero " + contceros);

				Console.WriteLine("Desea continuar s/n");
				condicion = char.Parse(Console.ReadLine());

				if (condicion == 'n' || condicion == 'N') {
					Console.WriteLine("Saliendo..");
					break;
				}
				else if (condicion != 's' && condicion != 'n' ) {
					while (true)
					{
						Console.WriteLine("Error digite s o n");
						condicion = char.Parse(Console.ReadLine());
						if (condicion == 's' || condicion == 'n' || condicion == 'S' || condicion=='N') break;
					}
				}

			} while (condicion == 's' || condicion == 'S');
		}
	}
}
