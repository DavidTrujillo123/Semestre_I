using System;
/*Tarea 10.-
Crear una aplicación que me cree un arreglo unidimensional y lo llene con números aleatorios 
del 1 al 100. Luego ingrese un número y me indique si este existe en el arreglo y me elimine 
todas sus repeticiones. 
 */
namespace Tarea10_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			int num,cont,pos;
			int aux, ceros;
			int j;
			int k;
			cont = 0;
			ceros = 0;

			Random aleatorio = new Random();

			int[] arreglo;
			int[] arreglo_final;
			arreglo = new int[100];
		

			for (int i = 0; i < arreglo.Length; i++)
			{
				arreglo[i] = aleatorio.Next(1,10+1);
			}

			//Array.Sort(arreglo);
			k = 1;
			Console.WriteLine("Arreglo original");
			foreach (int i in arreglo)
			{
				Console.WriteLine(k + ".- " + i);
				k++;
			}

			Console.WriteLine();
			Console.Write("Digite un numero: ");
			num = int.Parse(Console.ReadLine());
			Console.WriteLine();

			//Convierte los numeros repetidos en 0
			for (int i = 0; i < arreglo.Length; i++)
			{
				if (arreglo[i] == num) cont++;//excluye el primer numero

				if (cont > 1 && arreglo[i] == num) arreglo[i] = 0;
			}

			if (cont > 0) ceros = cont - 1;

			//Desplaza los ceros al final
			j = 1;
			while (j <= ceros)
			{
				for (int i = 0; i < arreglo.Length; i++)
				{
					pos = i;
					while (pos < arreglo.Length - 1)
					{
						if (arreglo[pos] == 0)
						{
							aux = arreglo[pos];
							arreglo[pos] = arreglo[pos + 1];
							arreglo[pos + 1] = aux;
						}
						pos++;
					}
				}
				j++;
			}

			arreglo_final = new int[100 - (ceros)]; 

			//llena el nuevo arreglo
			for (int i = 0; i < arreglo.Length; i++)
			{
				if (arreglo[i] != 0)
				{
					if (i == 100 - (ceros) ) break;
					arreglo_final[i] = arreglo[i];
				}
			}

			k = 1;
			Console.WriteLine("Arreglo final");
			foreach (int i in arreglo_final)
			{
				Console.WriteLine(k + ".- " + i);
				k++;
			}

			Console.WriteLine();
			if (cont == 1) Console.WriteLine("Su numero si existe en el arreglo pero no se repite");
			else if (cont > 1) Console.WriteLine("Su numero si existe en el arreglo y las repeticiones fueron eliminadas");
			else if (cont == 0) Console.WriteLine("Su numero no extiste en el arreglo");

			Console.ReadKey();
		}
	}
}
