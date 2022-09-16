using System;
/*Definir y crear un arreglo de bidimensional de (m x n - m filas x n columnas), llenar el arreglo 
con números secuenciales según los patrones definidos a continuación e imprimirlo en 
pantalla.

Tarea 22
Arreglo 4x5
   16   17   18   19   20
   15   14   13   12   11
    6    7    8    9   10
    5    4    3    2    1
 */
namespace Tarea22_U4B
{
	class Program
	{
        public static int[][] CrearArreglo(int m, int n)
        {
            int[][] matriz = new int[m][];
            for (int i = 0; i < matriz.Length; i++)
            {
                matriz[i] = new int[n];
            }
            return matriz;
        }

        public static void LlenarArreglo(int[][] A)
        {
            int cont;
            int a, b;
            cont = 1;
            a = A.Length-1;
            b = A[0].Length-1;
            while (true)
            {

                while (b >= 0)
                {
                    A[a][b] = cont;
                    cont++;
                    b--;
                }
                if (a == 0) break;

                b++;//b sobrepasa el valor de la logitud de la matriz por eso se suma -1
                a--;

                while (b < A[0].Length)
                {
                    A[a][b] = cont;
                    b++;
                    cont++;
                }
                b--;//b sale del ciclo con A[0].Length+1
                a--;
            }
        }
        public static void ImprimirArreglo(int[][] A)
        {
            for (int i = 0; i < A.Length; i++)
            {
                for (int j = 0; j < A[i].Length; j++)
                {
                    Console.Write("{0,5:0}", A[i][j]);
                }
                Console.WriteLine();
            }
        }

        static void Main(string[] args)
		{
            int m, n;
            m = 8;
            n = 3;
            int[][] matriz;

            matriz = CrearArreglo(m, n);
            LlenarArreglo(matriz);
            Console.WriteLine("Arreglo " + m + "x" + n);
            ImprimirArreglo(matriz);
        }
	}
}
