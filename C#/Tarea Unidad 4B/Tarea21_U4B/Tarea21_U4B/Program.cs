using System;
/*Definir y crear un arreglo de bidimensional de (m x n - m filas x n columnas), llenar el arreglo 
con números secuenciales según los patrones definidos a continuación e imprimirlo en 
pantalla.

Tarea 21
Arreglo 5x4
    1    2    3    4
   14   15   16    5
   13   20   17    6
   12   19   18    7
   11   10    9    8
 */
namespace Tarea21_U4B
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
			int cont, auxcolumna, auxfila, x;
			int a, b, nelementos;
			nelementos = (A.Length * A[0].Length);
			auxcolumna = A[0].Length - 1;
			auxfila = A.Length - 1;
			cont = 1;
			a = 0;
			b = 0;
			x = 0;
			while (true)
			{
				//avanza →
				while (b <= auxcolumna)
				{
					A[a][b] = cont;
					b++;
					cont++;
				}													  
				if (cont > nelementos) break;
				b--;//b regresa porque salio del tamanio de la matriz
				a++;//a avanza a la siguinte fila

				//avanza ↓ 
				while (a <= auxfila)
				{
					A[a][b] = cont;
					cont++;
					a++;
				}														
				if (cont > nelementos) break;
				a--;//a regresa porque salio del tamanio de la matriz     
				b--;//b esta en la ultima columna por eso retrocede		

				//avanza ←
				while (b >= x)											
				{
					A[a][b] = cont;
					b--;
					cont++;
				}													
				if (cont > nelementos) break;
				b++;//b avanza uno porque sale del tamanio				
				x++;//controlador de vueltas							
				a--;//a retocede para la nueva posicion de la fila

				//avanza ↑
				while (a >= x)
				{

					A[a][b] = cont;
					a--;
					cont++;
				}														
				if (cont > nelementos) break;
				a++;
				b++;
				auxcolumna--; 
				auxfila--;
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
			m = 4;
			n = 5;
			int[][] matriz;

			matriz = CrearArreglo(m, n);
			LlenarArreglo(matriz);
			Console.WriteLine("Arreglo " + m + "x" + n);
			ImprimirArreglo(matriz);
		}
	}
}
