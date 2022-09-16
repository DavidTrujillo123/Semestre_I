using System;
/*Tarea de repaso 6 -  Que pida 3 números y los muestre en pantalla de mayor a 
menor
-Si A es mayor que C y B entoces comprabar que B sea mayor que C y escribir A B C
si B no es mayor que C entoces escribir A C B
-Sino si B es mayor que A y C entoces comprabar que A sea mayor que C y escribir B A C
si A no es mayor que C entoces escribir B C A
-Sino si C es mayor que A y B entoces comprabar que A sea mayor que B y escribir C A B
si A no es mayor que B entoces escribir C B A
-Sino si A y B y C son iguales escribir los numeros son iguales
 */
namespace TareaDeRepaso_6
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int a, b, c;

            a = 10;
            b = 100;
            c = 1000;

            if (a == b && a == c)
            {
                Console.WriteLine("Los números son iguales " + a + " " + b + " " + c);
            }
            else
            {
                Console.WriteLine("La serie de mayor a menor es:");
                if (a > b && a > c)
                {
                    if (b > c)
                    {
                        Console.WriteLine(a + " " + b + " " + c);
                    }
                    else
                    {
                        Console.WriteLine(a + " " + c + " " + b);
                    }
                }
                else if (b > a && b > c)
                {
                    if (a > c)
                    {
                        Console.WriteLine(b + " " + a + " " + c);
                    }
                    else
                    {
                        Console.WriteLine(b + " " + c + " " + a);
                    }
                }
                else if (c > a && c > b)
                {
                    if (a > b)
                    {
                        Console.WriteLine(c + " " + a + " " + b);
                    }
                    else
                    {
                        Console.WriteLine(c + " " + b + " " + a);
                    }
                }
            }
        }
	}
}
