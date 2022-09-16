using System;
/* Tarea 20.- Realizar una aplicación que genere la siguiente salida pidiendo el orden de 
la figura
n=4
  i         aux     j
  1  @@@@   4       0
  2  *@@@   3       1
  3  **@@   2       2
  4  ***@   1       3
 */
namespace Tarea20_Unidad3
{
	class Program
	{
        public static void While(int n)
        {
            int i;
            int j;
            int cont;
            int aux;
            aux = n;
            i = 1;
            cont = 1;
            j = 1;

            while (i <= n)
            {
                while (j <= i - 1)
                {
                    Console.Write(" ");
                    j++;
                }
                j = 1;
                while (cont <= aux)
                {
                    Console.Write("@");
                    cont++;
                }
                cont = 1;
                aux--;
                i++;
                Console.WriteLine("");
            }
        }

        public static void For(int n)
        {
            int aux;
            aux = n;

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i - 1; j++)
                {
                    Console.Write(" ");
                }
                for (int cont = 1; cont <= aux; cont++)
                {
                    Console.Write("@");
                }
                aux--;
                Console.WriteLine("");
            }


        }
        static void Main(string[] args)
		{
            Console.WriteLine("For");
            For(7);
            Console.WriteLine("While");
            While(7);
            Console.ReadLine();
        }
    }
}
