using System;
/*Tarea de repaso 16 - Que pase de Kg a otra unidad de medida de masa, mostrar 
en pantalla un menú con las opciones posibles.
 
1 Kilogramo = 0.001 Toneladas
1 Kilogramo = 1000 Gramos
1 Kilogramo = 2.20462 Libras
1 Kilogramo = 35.274 Onzas
 */
namespace TareaDeRepaso_16
{
	class Program
	{
		static void Main(string[] args)
		{
			
            int opcion;
            double masa;
            double conversor;

             Console.WriteLine("Bienvenido al convertidor de Kilogramos\n");
            //Console.WriteLine("Digite la masa en kilogramos");
            masa = 1000;

            if (masa <= 0)
            {
                Console.WriteLine("Eror! Digite nuevamente la masa asegurese que sea positiva");
            }
            else
            {

                Console.WriteLine("         MENÚ         ");
                Console.WriteLine("--------------------------\n"
                        + "De Kilogramos a: ");
                Console.WriteLine("1) Tonelada \n"
                        + "2) Gramo \n"
                        + "3) Libra \n"
                        + "4) Onza \n"
                        + "5) Salir \n"
                        + "Digite un numero ente 1 y 5 \n");

                opcion = 1;

                switch (opcion)
                {

                    case 1:
                        conversor = masa * 0.001;
                        Console.WriteLine("Kilogramos a Toneladas");
                        Console.WriteLine(masa + " kilogramos son " + conversor + " toneladas\n");
                        Console.WriteLine("Fin del programa....");
                        break;

                    case 2:
                        conversor = masa * 1000;
                        Console.WriteLine("Kilogramos a Gramos");
                        Console.WriteLine(masa + " kilogramos son " + conversor + " gramos\n");
                        Console.WriteLine("Fin del programa....");
                        break;

                    case 3:
                        conversor = masa * 2.20462;
                        Console.WriteLine("Kilogramos a Libras");
                        Console.WriteLine(masa + " kilogramos son " + conversor + " libras\n");
                        Console.WriteLine("Fin del programa....");
                        break;

                    case 4:
                        conversor = masa * 35.274;
                        Console.WriteLine("Kilogramos a Onzas");
                        Console.WriteLine(masa + " kilogramos son " + conversor + " onzas\n");
                        Console.WriteLine("Fin del programa....");
                        break;

                    case 5:
                        Console.WriteLine("Fin del programa....");
                        break;

                    default:
                        Console.WriteLine("Error! Digite un numero entre 1 y 5");
                        break;
                }
            }
        }
	}
}
