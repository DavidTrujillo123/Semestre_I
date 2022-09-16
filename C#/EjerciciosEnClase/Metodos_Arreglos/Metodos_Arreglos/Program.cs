using System;

namespace Metodos_Arreglos
{
	class Program
	{
		public static int Aleatorio(int inicio, int fin)
		{
			Random aleatorio = new Random();
			return aleatorio.Next(inicio, fin);
		}

		public static int Aleatorio()
		{
			int rnd;
			rnd = Aleatorio(0, 100);
			return rnd;
		}

		public static void ImprimirArreglo(int [] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				Console.WriteLine((i+1)+". "+A[i]);
			}
		}

		public static void LlenarArreglo(int[] A)
		{
			for (int i = 0; i < A.Length; i++)
			{
				A[i] = Aleatorio();
			}

		}

		public static int[] Clonar(int [] A) {

			int[] Acopy;
			Acopy = new int[A.Length];

			for (int i = 0; i < A.Length; i++)
			{
				Acopy[i] = A[i];
			}
			
			return Acopy;
		}
		static void Main(string[] args)
		{
			int[] arreglo,arreglo1;

			arreglo = new int[5];
			//arreglo1 = new int[arreglo.Length];
		
			LlenarArreglo(arreglo);

			arreglo1 = Clonar(arreglo);
 
			ImprimirArreglo(arreglo);
			Console.WriteLine();
			ImprimirArreglo(arreglo1);		

			Console.WriteLine();

			System.GC.Collect(); //DESTRUYE OBJETOS INACCESIBLES
		}
	}
}
