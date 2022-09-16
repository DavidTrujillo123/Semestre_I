using System;
/* Tarea 13.- Realizar una aplicación que me despliegue un menú con las opciones para 
sumar, restar, multiplicar, dividir, potencia, factorial y salir, solicitar por teclado el 
ingreso de la operación a realizar y los datos necesarios para realizar la operación 
seleccionada. Repetir el proceso hasta que el usuario elija la opción de salir.
 */
namespace Tarea13_Unidad3
{
	class Program
	{
		public static double Potencia(int basse, int exponente)
		{
			int result;
			result = 1;
			//for
			for (int i = 1; i <= exponente; i++)
			{
				result = result * basse;
			}
			return result;
		}

		static int Factorial (int num)
		{
			//while
			int a;
			int fac1;
			fac1 = 1;
			a = 1;
			while (a <= num)
			{
				fac1 = fac1 * a;
				a++;
			}
			return fac1;
		}

		static void Main(string[] args)
		{
			bool salir;
			double num1, num2;
			salir = true;

			Console.WriteLine("Bienvenido...");
			Console.WriteLine("---------------");
			
			do
			{
				Console.WriteLine("Escoja una operacion segun sea su nececidad...");
				Console.WriteLine("|1)Suma| |2)Resta| |3)Division| |4)Multipliacion| |5)Factoria| |6)Potencia| |7)Salir|");
				int opcion = int.Parse(Console.ReadLine());

				if (opcion == 1)    //suma
				{
					Console.WriteLine("Ha escogido la opcion de Suma..." + "\n");

					Console.WriteLine("Ingrese un número");
					num1 = double.Parse(Console.ReadLine());

					Console.WriteLine("Ingrese un número");
					num2 = double.Parse(Console.ReadLine());

					Console.WriteLine(num1 + "+" + num2 + "=" + (num1 + num2) + "\n");

				}
				else if (opcion == 2)   //resta
				{
					Console.WriteLine("Ha escogido la opcion de Resta..." + "\n");

					Console.WriteLine("Ingrese un número");
					num1 = double.Parse(Console.ReadLine());

					Console.WriteLine("Ingrese un número");
					num2 = double.Parse(Console.ReadLine());

					Console.WriteLine(num1 + "-" + num2 + "=" + (num1 - num2) + "\n");

					
				}
				else if (opcion == 3)   //division
				{
					Console.WriteLine("Ha escogido la opcion de Division..." + "\n");

					Console.WriteLine("Ingrese un número");
					num1 = double.Parse(Console.ReadLine());

					Console.WriteLine("Ingrese un número");
					num2 = double.Parse(Console.ReadLine());

					if (num2 == 0) Console.WriteLine("Error!");
					else Console.WriteLine(num1 + "/" + num2 + "=" + (num1 / num2) + "\n");

					
				}
				else if (opcion == 4)   //multiplicacion
				{
					Console.WriteLine("Ha escogido la opcion de Multiplicacion..." + "\n");
;
					Console.WriteLine("Ingrese un número");
					num1 = double.Parse(Console.ReadLine());

					Console.WriteLine("Ingrese un número");
					num2 = double.Parse(Console.ReadLine());

					Console.WriteLine(num1 + "*" + num2 + "=" + (num1 * num2) + "\n");

				
				}
				else if (opcion == 5)   //factorial
				{
					Console.WriteLine("Ha escogido la opcion de Factorial..." + "\n");
					int fac;

					Console.WriteLine("Ingrese un número");
					fac = int.Parse(Console.ReadLine());

					Console.WriteLine(fac + "! =" + Factorial(fac) + "\n");

					
				}
				else if (opcion == 6)	//potencia
				{
					Console.WriteLine("Ha escogido la opcion de Potencia..." + "\n");
					int basse;
					int exponente;
					Console.WriteLine("Ingrese una base");
					basse = int.Parse(Console.ReadLine());

					Console.WriteLine("Ingrese un exponente");
					exponente = int.Parse(Console.ReadLine());

					Console.WriteLine(basse + "^" + exponente + "=" + Potencia(basse, exponente) + "\n");
				}
				else if (opcion == 7) {
					Console.WriteLine("Fin app...");
					salir = false;
				} 
				else Console.WriteLine("Error!");

				if (opcion != 7) {
					Console.WriteLine("¿Desea continuar? 1)Si 2)No");
					opcion = int.Parse(Console.ReadLine());

					if (opcion == 2)
					{
						Console.WriteLine("Fin app...");
						salir = false;
					}
				}


			} while (salir == true);


			Console.ReadKey();
		}
	}
}
