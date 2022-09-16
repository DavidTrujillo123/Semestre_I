using System;
/* Tarea 19.- Realizar una aplicación que me pida el orden de una pirámide y genere la 
siguiente salida. Ejm: orden 4
1
12
123
1234
 */
namespace Tarea19_Unidad3
{
	class Program
	{
		static void Main(string[] args)
		{
            int orden;
            int i;
            int cont;

            orden = 6;

            cont = 1;
            i = 1;
            
            /*
            for (; i <= orden; i++)
            {
                for (; cont <= i; cont++)
                {
                    Console.Write(cont);
                }
                cont = 1;
                Console.WriteLine("");
            }
            */
            while(i<=orden){
                while(cont <= i){
                    Console.Write(cont);
                    cont++;
                }
                cont=1;
                i++;
                Console.WriteLine("");
            }
            

        }
    }
}
