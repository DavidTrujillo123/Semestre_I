using System;
/*Tarea 12.- Realizar un método que me retorne si un año es bisiesto.
Bisiesto = divisible para 4 y cuando son multiplos de 100 debe ser divisible
para 400
 */
namespace TareaMetodos_12
{
	class Program
	{
        public static bool año(int año)
        {

            bool bisiesto;

            bisiesto = true;
            if (año % 4 == 0)
            {
                if (año % 100 == 0)
                {
                    if (año % 400 == 0)
                    {

                    }
                    else
                    {
                        bisiesto = false;
                    }
                }
                else
                {

                }
            }
            else
            {
                bisiesto = false;

            }
            return (bisiesto);
        }
        static void Main(string[] args)
		{
            int Año;
            bool prueba;
            Año = 2000;

            if (Año <= 0)
            {
                Console.WriteLine("Error!");
            }
            else
            {
                prueba = año(Año);

                if (prueba == true)
                {
                    Console.WriteLine("El año " + Año + " es biciesto");
                }
                else
                {
                    Console.WriteLine("El año " + Año + " no es biciesto");
                }
            }
            Console.ReadLine();
        }
	}
}
