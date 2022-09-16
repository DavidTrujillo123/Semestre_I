using System;

namespace Arreglos_PosNegCero
{
	class Program
	{
		static void Main(string[] args)
		{
			double media_positivos;
			double media_negativos;
			int contpos, sumapos;
			int contneg, sumaneg;
			int contcero;
			contcero = 0;
			contneg = 0;
			contpos = 0;
			sumaneg = 0;
			sumapos = 0;
			int[] num = new int[5];

			for (int i = 0; i < 5; i++)
			{
				global::System.Console.Write((i + 1) + ". Digite un numero: ");
				num[i] = int.Parse(Console.ReadLine());
				
			}

			for (int i = 0; i < 5; i++)
			{
				if (num[i] > 0)
				{
					contpos++;
					sumapos = sumapos + num[i];
				}
				else if (num[i] < 0)
				{
					contneg++;
					sumaneg = sumaneg + num[i];
				}
				else  contcero++;

			}

			if (contpos == 0) Console.WriteLine("No extisten positivos");
			else
			{
				media_positivos = (sumapos * 1.0) / contpos;
				Console.WriteLine("Positivos " + media_positivos);
			}
			if (contneg == 0) Console.WriteLine("No extisten negativos");
			else
			{
				media_negativos = (sumaneg * 1.0) / contneg;
				Console.WriteLine("Negativos " + media_negativos);
			}

			if (contcero == 0) Console.WriteLine("No extiste cero");
			else Console.WriteLine("Cero " + contcero);

		}
	}
}
