using System;
/* Tarea 23.- Escribir un programa que solicite ingresar n notas de alumnos y nos informe 
cuántos tienen notas mayores o iguales a 7 y cuántos menores. El programa termina 
cuanto se ingrese un valor de 0.
 */
namespace Tarea23_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
            int nota;
            int condicion;
            int cont_mayor;
            int cont_menor;
            int i;
            i = 0;
            cont_mayor = 0;
            cont_menor = 0;
            condicion = 1;


            do
            {
                Console.WriteLine("Ingrese una nota o si desea salir digite 0");
                nota = int.Parse(Console.ReadLine());
                Console.WriteLine("");

                if (nota == 0)
                {
                    condicion = 0;
                }
                else
                {
                    if (nota >= 7)
                    {
                        cont_mayor++;
                    }
                    else
                    {
                        cont_menor++;
                    }
                    i++;
                }

            } while (condicion > 0);

            Console.WriteLine("");
            Console.WriteLine("Notas totales --> " + i);
            Console.WriteLine("Mayores o iguales a 7 --> " + cont_mayor);
            Console.WriteLine("Menores que 7 --> " + cont_menor);
        }
	}
}
