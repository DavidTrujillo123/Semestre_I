using System;
/* Tarea 21.- Realizar una aplicación que genere la siguiente salida pidiendo el orden de 
la figura
n=5
  i            aux          j
  1 @@@@@@@@@   9   -2      0    
  2 *@@@@@@@    7   -2      1
  3 **@@@@@     5   -2      2
  4 ***@@@      3   -2      3
  5 ****@       1   -2      4
                0
 */
namespace Tarea21_Unidad3
{
	class Program
	{
        public static void While(int n)
        {
            int i;
            int cont;
            int aux, aux2;
            int j;

            i = 1;
            cont = 1;
            j = 2;
            aux = n * 2 - 1;
            aux2 = 1;

            while (i <= n)
            {
                while (j <= aux2)
                {
                    Console.Write(" ");
                    j++;
                }
                j = 2;
                aux2++;
                while (cont <= aux)
                {
                    Console.Write("@");
                    cont++;
                }
                cont = 1;
                aux -= 2;
                i++;
                Console.WriteLine("");
            }
        }

        public static void For(int n)
        {
            int aux, aux2;
            aux = n * 2 - 1;
            aux2 = 1;

            for (int i = 1; i <= n; i++)
            {
                for (int j = 2; j <= aux2; j++)
                {
                    Console.Write(" ");
                }
                aux2++;
                for (int cont = 1; cont <= aux; cont++)
                {
                    Console.Write("@");
                }
                aux -= 2;
                Console.WriteLine("");
            }
        }
        static void Main(string[] args)
		{
            Console.WriteLine("For");
            For(40);
            Console.WriteLine("While");
            While(40);

            Console.ReadKey();

        }
    }
}
