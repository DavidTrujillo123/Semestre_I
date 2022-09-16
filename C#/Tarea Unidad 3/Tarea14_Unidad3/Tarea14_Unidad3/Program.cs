using System;
/*Tarea 14.- Realizar una aplicación que me imprima las tablas de multiplicar de un rango 
especificado para el número de la tabla (ejemplo tabla de 3 al 7) y un rango para los 
multiplicadores de cada tabla.

tabla_inicio = 3		tabla_fin = 7
mul_inicio = 2          mul_fin = 6

3  4  5  6  7
*  *  *  *  *
2  3  4  5  6
=  =  =  =  =
6 12 20 30 42
*/
namespace Tarea14_Unidad3
{
	class Program
	{
        static void Main(string[] args)
        {
            int inicio_tabla;
            int fin_tabla;
            int inicio_mul;
            int fin_mul;
            int aux_tabla, aux_mul;

            inicio_tabla = 1;
            fin_tabla = 3;

            inicio_mul = 10;
            fin_mul = 7;

            if (fin_tabla < inicio_tabla)
            {
                aux_tabla = fin_tabla;
                fin_tabla = inicio_tabla;
                inicio_tabla = aux_tabla;
            }

            if (fin_mul < inicio_mul)
            {
                aux_mul = fin_mul;
                fin_mul = inicio_mul;
                inicio_mul = aux_mul;
            }

            /*
            for(int i = inicio_tabla ; i<= fin_tabla ; i++){
                Console.WriteLine("Tabla del "+i);
                for(int a = inicio_mul ; a<= fin_mul ; a++){             
                    Console.WriteLine(i+"*"+a+"="+(i*a));
                }
                Console.WriteLine("");
            }
            */

            int i;
            int cont;
            i = inicio_tabla;
            cont = inicio_mul;

            while (i <= fin_tabla)
            {
                Console.WriteLine("Tabla del " + i);
                while (cont <= fin_mul)
                {
                    Console.WriteLine(i + "*" + cont + "=" + (i * cont));
                    cont++;
                }
                cont = inicio_mul;
                i++;
                Console.WriteLine("");
            }

            Console.ReadKey();
            
        }
	}
}
