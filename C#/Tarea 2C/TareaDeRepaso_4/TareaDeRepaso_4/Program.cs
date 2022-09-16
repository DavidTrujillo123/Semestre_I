using System;
/* Tarea de repaso 4 - Que pida un número del 1 al 12 y diga el nombre del mes 
correspondiente
enero(1) - febrero(2)- marzo(3) - abril(4) - mayo(5) - junio(6) - julio(7)
agosto(8) - septiembre(9) - octubre(10) - noviembre(11) - diciembre(12) 
 */

namespace TareaDeRepaso_4
{
	class Program
	{
		static void Main(string[] args)
		{

            int mes;

            //Console.WriteLine("Ingrese un número entre 1 y 12 para saber el mes");        
            mes = 5;

            switch (mes)
            {
                case 1:
                    Console.WriteLine("El mes es enero");
                    break;

                case 2:
                    Console.WriteLine("El mes es febrero");
                    break;
                case 3:
                    Console.WriteLine("El mes es marzo");
                    break;

                case 4:
                    Console.WriteLine("El mes es abril");
                    break;
                case 5:
                    Console.WriteLine("El mes es mayo");
                    break;

                case 6:
                    Console.WriteLine("El mes es junio");
                    break;
                case 7:
                    Console.WriteLine("El mes es julio");
                    break;

                case 8:
                    Console.WriteLine("El mes es agosto");
                    break;
                case 9:
                    Console.WriteLine("El mes es septiembre");
                    break;
                case 10:
                    Console.WriteLine("El mes es octubre");
                    break;

                case 11:
                    Console.WriteLine("El mes es noviembre");
                    break;
                case 12:
                    Console.WriteLine("El mes es diciembre");
                    break;
                default:
                    Console.WriteLine("Error! Vuelva a ingresar los datos");
                    break;
            }

        }
	}
}
