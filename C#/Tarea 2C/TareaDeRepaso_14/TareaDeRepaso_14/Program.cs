using System;
/*Tarea de repaso 14 -  Que tome tres números y diga si la multiplicación de
los dos primeros es igual al tercero.
 */
namespace TareaDeRepaso_14
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int a, b, c, mult;

            a = 1;
            b = 3;
            c = 3;

            mult = a * b;

            if (c == mult)
            {
                Console.WriteLine("Sus numeros son: " + a + " " + b + " " + c + " y la multiplicación de " + a + "*" + b + " es " + mult);
                Console.WriteLine("El tercero si es igual a la multiplicación de los dos primeros");

            }
            else
            {
                Console.WriteLine("Sus numeros son: " + a + " " + b + " " + c + " y la multiplicación de " + a + "*" + b + " es " + mult);
                Console.WriteLine("El tercero no es igual a la multiplicación de los dos primeros");
            }
        }
	}
}
