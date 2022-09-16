using System;

namespace Repaso_Multiplos_Rango
{
	class Program
	{
		static void MultiplosRango(int inicio, int fin, int num)
		{
			int mult;
			int aux;
			int cont;
			int suma;
			double promedio;
			suma = 0;
			cont = 0;
			if (fin<inicio) {
				aux = fin;
				fin = inicio;
				inicio = aux;
			}

			while (inicio<=fin) {
				cont++;
				mult = num*inicio;
				suma = suma + mult;
				Console.WriteLine(num+"*"+inicio+"="+mult);
				inicio++;
			}

			promedio = (suma*1.0)/ cont;
			Console.WriteLine("Multiplos encontrados " + cont);
			Console.WriteLine("Suma de multiplos "+suma);
			Console.WriteLine("Promedio de multiplos " +promedio);
		}
		static void Main(string[] args)
		{
			MultiplosRango(1,10,2);
			MultiplosRango(10, 1, 3);
			MultiplosRango(5, 8, 6);
		}
	}
}
