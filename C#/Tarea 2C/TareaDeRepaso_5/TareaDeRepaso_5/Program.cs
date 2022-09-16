using System;
/*Tarea de Repaso 5 - Que pida 3 números y los muestre en pantalla de menor a
mayor 
-Si A es mayor que C y B entoces comprabar que B sea mayor que C y escribir C B A
si B no es mayor que C entoces escribir B C A
-Sino si B es mayor que A y C entoces comprabar que A sea mayor que C y escribir C A B
si A no es mayor que C entoces escribir A C B
-Sino si C es mayor que A y B entoces comprabar que A sea mayor que B y escribir B A C
si A no es mayor que B entoces escribir A B C
-Sino si A y B y C son iguales escribir los numeros son iguales
*/

namespace TareaDeRepaso_5
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int a, b, c;

            a = 100;
            b = 5;
            c = -1;

            if (a == b && a == c)
            {
                Console.WriteLine("Los números son iguales " + a + " " + b + " " + c);
            }
            else
            {
                Console.WriteLine("La serie de menor a mayor es: ");
                if (a > b && a > c)
                {
                    if (b > c)
                    {
                        Console.WriteLine(c + " " + b + " " + a);
                    }
                    else
                    {
                        Console.WriteLine(b + " " + c + " " + a);
                    }
                }
                else if (b > a && b > c)
                {
                    if (a > c)
                    {
                        Console.WriteLine(c + " " + a + " " + b);
                    }
                    else
                    {
                        Console.WriteLine(a + " " + c + " " + b);
                    }
                }
                else if (c > a && c > b)
                {
                    if (a > b)
                    {
                        Console.WriteLine(b + " " + a + " " + c);
                    }
                    else
                    {
                        Console.WriteLine(a + " " + b + " " + c);
                    }
                }

            }
        }
	}
}
