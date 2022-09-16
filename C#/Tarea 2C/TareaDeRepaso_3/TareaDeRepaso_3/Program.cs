using System;
/*Tarea de repaso 3 -  Que pida un número del 1 al 7 y diga el día de la semana 
correspondiente.
Lunes(1)-Martes(2)-Miercoles(3)-Jueves(4)-Viernes(5)-Sabado(6)-Domingo(7)
 */
namespace TareaDeRepaso_3
{
	class Program
	{
		static void Main(string[] args)
		{

            int dia;

            //Console.WriteLine("Ingrese un número entre 1 y 7 para saber el dia de la semana");
            dia = 7;

            if (dia <= 0 || dia > 7)
            {
                Console.WriteLine("Error! Ingrese nuevamente los datos");
            }
            else
            {
                if (dia == 1)
                {
                    Console.WriteLine("El día es lunes");
                }
                else if (dia == 2)
                {
                    Console.WriteLine("El día es martes");
                }
                else if (dia == 3)
                {
                    Console.WriteLine("El día es miercoles");
                }
                else if (dia == 4)
                {
                    Console.WriteLine("El día es jueves");
                }
                else if (dia == 5)
                {
                    Console.WriteLine("El día es viernes");
                }
                else if (dia == 6)
                {
                    Console.WriteLine("El día es sabado");
                }
                else
                {
                    Console.WriteLine("El día es domingo");
                }
            }

        }
	}
}
