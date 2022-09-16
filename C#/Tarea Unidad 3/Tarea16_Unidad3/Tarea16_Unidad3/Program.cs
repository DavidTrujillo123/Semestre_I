using System;
/*Tarea 16.- Realizar una aplicación que me pida el orden de un cuadrado y lo imprima 
realizado con el carácter ‘@’
@@@@
@@@@
@@@@
@@@@
 */
namespace Tarea16_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
            int orden;
            orden = 5;
            /*
            for (int i = 1; i <= orden; i++)
            {
                for (int a = 1; a <= orden; a++)
                {
                    Console.Write("@");
                }
                Console.WriteLine("");
            }
            */
            
            int i;
            int a;
            i = 1;
            a = 1;

            while(i <= orden){
                while (a <= orden){
                    Console.Write("@");
                    a++;
                }
                a=1;
                Console.WriteLine("");
                i++;
            }

            Console.ReadKey();
        }
    }
}
