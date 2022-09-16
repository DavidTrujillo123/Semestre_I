using System;

namespace Arreglos_Ejercicio1
{
	class Program
	{

		static void n(string n)
		{
			Console.WriteLine(n);
		}

		static void Main(string[] args)
		{
			int[] notas; 
			//string[] mes;
			int[] dias;

			notas = new int[10];
			notas[0] = 8;
			notas[1] = 4;
			notas[2] = 3;
			notas[3] = 6;
			notas[4] = 9;

		
			//Console.WriteLine(notas.Length);
			for (int i = 0; i < notas.Length; i++)
			{
				Console.WriteLine((i+1)+".- "+notas[i]);
			}

			string [] mes = { "Ene","Dic" };

			for (int i = 0; i < mes.Length; i++)
			{
				Console.WriteLine(mes[i]);
			}

			dias = new int[12];


			

		}
	}
}
