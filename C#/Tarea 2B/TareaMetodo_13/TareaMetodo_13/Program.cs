using System;
/* Tarea 13 -Realizar un método que me retorne los números de días que tiene un mes, dado un 
número del mes y del año.
Tienen 31 días: enero(1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10) y diciembre(12).
Tienen 30 días: abril(4), junio(6), septiembre(9) y noviembre(11).
Tiene 29 días: febrero(2) (si el año es bisiesto).
Tiene 28 días: febrero(2) (si el año no es bisiesto).
 */

namespace TareaMetodo_13
{
	class Program
	{
        public static bool año1(int año)
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

        public static int dias(int año, int mes)
        {

            int dia;
            if (mes == 2 && año1(año) == true)
            {
                dia = 29;
            }
            else if (mes == 2 && año1(año) == false)
            {
                dia = 28;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                dia = 30;
            }
            else
            {
                dia = 31;
            }

            return dia;
        }
        static void Main(string[] args)
		{

            int año;
            int mes;
            int dia;

            año = 2000;
            mes = 5;

            if (año <= 0 || mes <= 0 || mes > 12)
            {
                Console.WriteLine("Error!");
            }
            else
            {
                dia = dias(año, mes);
                Console.WriteLine("El año es " + año + ", el mes es " + mes + " y tiene " + dia + " dias");

            }

            Console.ReadLine();
        }
	}
}
