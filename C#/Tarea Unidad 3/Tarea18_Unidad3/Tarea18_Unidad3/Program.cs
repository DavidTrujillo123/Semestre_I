using System;
/*Tarea 18.- Realizar una aplicación que me pida el orden de una pirámide y genere la 
siguiente salida. Ejm: orden 4
1
22
333
4444
 */
namespace Tarea18_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
            int orden;
            int i;
            int cont;
            cont = 1;
            i = 1;
            orden = 6;

            for (; i<= orden; i++) {
                for (; cont <= i; cont++) {
                    Console.Write(i);
                }
                cont = 1;
                Console.WriteLine("");
            }


            /*
            while (i <= orden)
            {
                while (cont <= i)
                {
                    Console.Write(i);
                    cont++;
                }
                cont = 1;
                i++;
                Console.WriteLine("");
            }
            */
            Console.ReadKey();
        }
	}
}
