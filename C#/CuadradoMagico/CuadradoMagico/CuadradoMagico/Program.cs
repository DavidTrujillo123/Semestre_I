using System;
/*
 * Tarea 40.- 
Elabore una aplicación que, dado un número entero, positivo e impar, que representa el número 
de filas y columnas de una matriz, obtenga e imprima un cuadro mágico. Un cuadro mágico es 
una matriz cuadrada, de orden n, que contiene los números naturales consecutivos del 1 al n2 y 
donde la suma de cualquiera de las filas, columnas o diagonales principales debe ser la misma:

Cuadrado Magico de N = 3
   8   1   6
   3   5   7
   4   9   2

Cuadrado Magico de N = 5
  17  24   1   8  15
  23   5   7  14  16
   4   6  13  20  22
  10  12  19  21   3
  11  18  25   2   9

El algoritmo para crear un cuadro mágico consiste en: 
a) El número 1 se coloca en la casilla central de la primera fila. 

b) El siguiente número se coloca en la casilla correspondiente a la fila anterior y 
columna posterior. La fila anterior a la primera es la última y la columna posterior a 
la última es la primera. 

c) Si el número es un sucesor múltiplo de n, no aplica la regla b) sino que, se coloca el 
número en la casilla de la fila posterior y en la misma columna.

N=3
					 b
a	  0			1		  2			3

	(0,0)     (0,1)     (0,2)     (0,3)
0	  0			0		  0		   -1
	(1,0)     (1,1)     (1,2)     (1,3)
1	  8			1		  6			0
	(2,0)     (2,1)     (2,2)     (2,3)
2	  3			5		  7			0
	(3,0)     (3,1)     (3,2)     (3,3)
3	  4			9		  2			0

 */
namespace CuadradoMagico
{
	class Program
	{
		public static void ImprimirArreglo(int[][] A)
		{
			for (int i = 1; i < A.Length; i++)
			{
				for (int j = 0; j < A[i].Length-1; j++)
				{
					//Console.Write("(" + i + "," + j + ")" + "=" + A[i][j] + "   ");
					Console.Write("{0,4:0}", A[i][j]); //{0,4:0} para dar los espacios 
				}
				Console.WriteLine();
			}
		}
		
		static void Main(string[] args)
		{
			int[][] matriz;
			int a;
			int b;
			int tamanio,n;
			int longitud;
			int medio;

			n=3;

			tamanio =n+1;

			matriz = new int[tamanio][];
			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[tamanio];
			}

			longitud = matriz.Length - 1;
			medio = longitud / 2;

			matriz[0][longitud] = -1;//fila 0 columna final
			b = medio;
			a = 1;

			int cont;
			cont = 1;
			while (cont <= longitud*longitud)
			{
				//la primera fila pasa al ultimo
				if (a == 0) a = longitud;
				//ultima columna pasa al inicio
				if (b == longitud) b = 0;

				matriz[a][b] = cont;
			
				a--;
				b++;

				//Compruba si esta lleno en esa posicion
				if (matriz[a][b] != 0)
				{
					a += 2;
					b--;
				}
				cont++;
			}

			int suma,suma2,suma3;
			suma = 0;
			suma2 = 0;
			suma3 = 0;
			cont = 1;
			for (int i = 0; i < matriz.Length; i++)
			{
				suma = matriz[1][i] + suma;
				suma2 = matriz[2][i] + suma2;
				suma3 = matriz[cont][i] + suma3;
				if (cont == longitud) break;
				cont++;
			}

			Console.WriteLine("N="+n);
			ImprimirArreglo(matriz);
			Console.Write("Suma fila 1: "+suma+"\n");
			Console.Write("Suma fila 2: "+suma2+"\n");
			Console.Write("Suma diagonal: "+suma3);

		}
	}
}
