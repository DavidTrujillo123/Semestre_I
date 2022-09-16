using System;
/*Tarea de repaso 11 - . Que muestre un menú que contemple las opciones 
“Archivo”, “Buscar” y “Salir”, en caso de que no se introduzca una opción 
correcta se notificará por pantalla.
 */
namespace TareaDeRepaso_11
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            int menu;

            Console.WriteLine("                    | Menú |                     ");
            Console.WriteLine("_________________________________________________");
            Console.WriteLine("| 1)Archivo |    | 2)Buscar |      | 3)Salir | ");
            Console.WriteLine("Digite un número:  \n");
            //menu = entrada.nextInt();
            menu = 1;

            if (menu <= 0 || menu > 3)
            {
                Console.WriteLine("Error! Digite 1, 2 o 3 según sea su necesidad");
            }
            else
            {
                if (menu == 1)
                {
                    Console.WriteLine("Abriendo Archivo...");
                    Console.WriteLine("_________");
                    Console.WriteLine("...Fin del programa");

                }
                else if (menu == 2)
                {
                    Console.WriteLine("Buscando...");
                    Console.WriteLine("_________");
                    Console.WriteLine("...Fin del programa");
                }
                else
                {
                    Console.WriteLine("Saliendo...");
                    Console.WriteLine("_________");
                    Console.WriteLine("...Fin del programa");
                }
            }



        }
	}
}
