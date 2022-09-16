using System;
/*Tarea de repaso 10 - Que pida tres números y detecte si se han introducido en 
orden decreciente.
 */
namespace TareaDeRepaso_10
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int a, b, c;

            a = 10;
            b = 6;
            c = 3;

            if (a == b && a == c)
            {
                Console.WriteLine("Los números son iguales");
            }
            if (a > b && a > c && b > c)
            {
                Console.WriteLine("Los números se han introducido en orden decreciente\n " + a + " " + b + " " + c);

            }
            else
            {
                Console.WriteLine("Los números no se han introducido en orden decreciente\n " + a + " " + b + " " + c);
            }
        }
	}
}
