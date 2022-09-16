using System;
/*Tarea de repaso 15 - Que tome tres números y diga si el tercero es el resto 
de la división de los dos primeros es igual al tercero.
 */
namespace TareaDeRepaso_15
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int a, b, c, mod;

            a = 10;
            b = 6;
            c = 0;

            if (b == 0)
            {
                Console.WriteLine("Error! Division imposible");
            }
            else
            {
                mod = a % b;
                if (mod == c)
                {
                    Console.WriteLine("Sus numeros son: " + a + " " + b + " " + c + " el resto de " + a + "/" + b + " es " + mod);
                    Console.WriteLine("El tercero si es el resto de la division");
                }
                else
                {
                    Console.WriteLine("Sus numeros son: " + a + " " + b + " " + c + " el resto de " + a + "/" + b + " es " + mod);
                    Console.WriteLine("El tercero no es el resto de la division");
                }
            }


        }
	}
}
