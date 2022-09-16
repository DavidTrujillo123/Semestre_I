using System;
/*  Figura 1
    ****
 	 ***
 	  **
 	   *
 	   
	Figura2
 	*****
 	****
 	***
 	**
 	*
 	**
 	***
 	****
 	*****
 	
 	Figura3
 	1
	2  3
	4  5   6
	7  8   9 10
	11 12 13 14 15
	16 17 18

	Figura4
	1
	12
	123
	1234
	12345
	1234
	123
	12
	1

	Figura5
	12345
	1234
	123
	12
	1
	12
	123
	1234
	12345

	
 */
namespace CiclosRepetitivos_Figuras
{
	class Program
	{
		static void Figura1_while (int n)
		{
			int i;
			int j;
			int aux;
			j = 2;
			i = 1;
			aux = n;
			while (i <= n)
			{
				while (j <= i) 
				{
					Console.Write(".");
					j++;
				}
				j = 2;
				while (aux>=i) {
					Console.Write("*");
					aux--;
				}
				aux = n;
				Console.WriteLine("");
				i++;
			}

		}

		static void Figura1_for(int n)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int k = 2; k <= i; k++) {
					Console.Write(".");			
				}
				for (int j = n; j >= i; j--) {
					Console.Write("*");
				}
				Console.WriteLine("");
			}
		}

		static void Figura2_while(int n) {
			int i;
			int j;
			int aux;
			i = 1;
			aux = n;

			while (i <= n)
			{
				while (aux >= i)
				{
					Console.Write("*");
					aux--;
				}
				aux = n;
				Console.WriteLine();
				i++;
			}

			i = 2;
			j = 1;
			while (i <= n)
			{
				while (j<=i) {
					Console.Write("*");
					j++;
				}
				j = 1;
				i++;
				Console.WriteLine();
			}

		}

		static void Figura3_for(int n)
		{
			int cont;
			cont = 1;
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					Console.Write("|"+cont+"|");
					cont++;
					if (cont > n) break;
				}
				if (cont > n) break;
				Console.WriteLine();
			}
		}

		static void Figura4_while(int n)
		{
			int i;
			int j;
			i = 1;
			j = 1;
			while (i <= n)
			{
				while (j<=i) {
					Console.Write(j);
					j++;
				}
				j = 1;
				i++;
				Console.WriteLine();
			}

			i = n-1;
			j = 1;
			while (i >= 1)
			{
				while (j <= i)
				{
					Console.Write(j);
					j++;
				}
				j = 1;
				i--;
				Console.WriteLine();
			}

		}
		static void Figura5_while(int n)
		{
			int i;
			int j;
			i = n;
			j = 1;
			while (i >= 1)
			{
				while (j <= i)
				{
					Console.Write(j);
					j++;
				}
				j = 1;
				i--;
				Console.WriteLine();
			}

			i = 2;
			j = 1;
			while (i <= n)
			{
				while (j <= i)
				{
					Console.Write(j);
					j++;
				}
				j = 1;
				i++;
				Console.WriteLine();
			}
		}

		static void MultiplosRango(int inicio, int fin, int num)
		{
			int aux;
			
			if (fin < inicio)
			{
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			int mult;
			int cont;
			int suma;
			double media;
			cont = 0;
			suma = 0;
			Console.WriteLine("Tabla "+num);
			Console.WriteLine("Inicio: "+inicio+" - Fin: "+fin);
			while (inicio <= fin)
			{
				cont++;
				mult = inicio * num;
				suma = suma + mult;
				Console.WriteLine(cont+". "+num+"*"+inicio+"="+mult);
				inicio++;
				
			}
			media = (1.0 * suma) / cont;
			Console.WriteLine("Cantidad de multiplos "+cont);
			Console.WriteLine("Suma de multiplos "+suma);
			Console.WriteLine("Promedio multiplos "+media);
		}

		static void Main(string[] args)
		{
			//Figura1_while(5);
			//Figura1_for(5);
			//Figura2_while(5);
			//Figura3_for(18);
			//Figura4_while(5);
			//Figura5_while(5);
			MultiplosRango(10,2,3);
		
		}
	}
}
