using System;
/* Tarea 24.- Se ingresan un conjunto de n edades de personas por teclado. El programa 
finalizara cuando el promedio de las edades sea superior a 25.
 */
namespace Tarea24_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
            int edad;
            int suma_edad;
            double promedio_edad;
            int n;

            suma_edad = 0;
            n = 0;

            do
            {
                n++;
                Console.WriteLine("Ingrese una edad ");
                edad = int.Parse(Console.ReadLine());

                suma_edad += edad;
                promedio_edad = (suma_edad) * 1.0 / n;

            } while (promedio_edad <= 25);
            Console.WriteLine("");
            Console.WriteLine("El promedio de edad es: " + promedio_edad);
            Console.WriteLine("Fin app...");

            Console.ReadKey();
        }
	}
}
