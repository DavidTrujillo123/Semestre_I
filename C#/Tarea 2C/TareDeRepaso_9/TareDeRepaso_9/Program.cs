using System;
/*Tarea de repaso 9 - Que pida tres números y detecte si se han introducido 
en orden creciente.
 */
namespace TareDeRepaso_9
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int a, b, c;

            a = 1;
            b = 30;
            c = 101;

            if (a == b && a == c)
            {
                Console.WriteLine("Los numeros son iguales");
            }
            else if (a < b && a < c && b < c)
            {
                Console.WriteLine("Los numeros se han introducido en orden creciente: \n" + a + " " + b + " " + c);
            }
            else
            {
                Console.WriteLine("Los numeros no se han introducido en orden creciente: \n" + a + " " + b + " " + c);
            }
        }
	}
}
