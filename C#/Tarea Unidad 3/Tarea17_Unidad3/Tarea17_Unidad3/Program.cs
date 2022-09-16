using System;
/*Tarea 17.- Realizar una aplicación que genere la siguiente salida pidiendo el 
orden de la figura
@@@@
@@@
@@
@
 */
namespace Tarea17_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
            int orden;
            orden = 6;

            /*for (int i = orden; i>=1 ; i--){
                for (int a = 1 ; a<=i ; a++){
                    System.out.print("a");
                }   
                System.out.println("");
            }
            */

            int i;
            int cont;
            cont = 1;
            i = orden;
            while (i >= 1)
            {
                while (cont <= i)
                {
                    Console.Write("@");
                    cont++;
                }
                Console.WriteLine("");
                cont = 1;
                i--;
            }

            Console.ReadLine();
        }
	}
}
