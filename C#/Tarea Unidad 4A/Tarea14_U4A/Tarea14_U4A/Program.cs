using System;
/*Tarea 14.-
Realizar una aplicación con el siguiente menú: 
1. Llenar el arreglo A de manera aleatoria. 
2. Llenar el arreglo B de manera aleatoria. 
3. Realizar C = A + B 
4. Realizar C = B - A 
5. Mostrar (Permitiendo al usuario elegir entre el arreglo A, B, o C). 
6. Salir. 
 */
namespace Tarea14_U4A
{
	class Program
	{
		static void Main(string[] args)
		{
			Random aleatorio = new Random();
			int opcion;
			char opcion2;
			int n;
			bool condicion, condicion2, condicion3;
			condicion = true;
			condicion2 = true;
			condicion3 = true;
			n = 5;
		
			int[] A;
			int[] B;
			int[] C;
			A = new int[n];
			B = new int[n];
			C = new int[n];

			do {
				Console.WriteLine("Menu");
				Console.WriteLine("1. Llenar el arreglo A de manera aleatoria.\n" +
					"2. Llenar el arreglo B de manera aleatoria.\n" +
					"3. Realizar C = A + B\n" +
					"4. Realizar C = B - A\n" +
					"5. Mostrar los arreglos\n" +
					"6. Salir.");
				Console.Write("Opcion: ");
				opcion = int.Parse(Console.ReadLine());
				Console.WriteLine();


				while (condicion2) {
					if (opcion == 1)
					{
						//Console.Clear();
						for (int i = 0; i < n; i++)
						{
							A[i] = aleatorio.Next(-100, 100);
						}
						Console.WriteLine("Arrglo A llenado...\n");
					}
					else if (opcion == 2)
					{
						//Console.Clear();
						for (int i = 0; i < n; i++)
						{
							B[i] = aleatorio.Next(-100, 100);
						}
						Console.WriteLine("Arreglo B llenado...\n");
					}
					else if (opcion == 3)
					{
						//Console.Clear();
						for (int i = 0; i < n; i++)
						{
							C[i] = A[i] + B[i];
						}
						Console.WriteLine("Arreglo C llenado...\n");
					}
					else if (opcion == 4)
					{
						//Console.Clear();
						for (int i = 0; i < n; i++)
						{
							C[i] = B[i] - A[i];
						}
						Console.WriteLine("Arreglo C llenado...\n");
					}
					else if (opcion == 5)
					{
						//Console.Clear();
						while (condicion3)
						{
							Console.WriteLine("Elija un arreglo A-B-C");
							opcion2 = char.Parse(Console.ReadLine());
							opcion2 = char.ToUpper(opcion2);
							if (opcion2 == 'A')
							{
								Console.WriteLine("Arreglo A:");
								foreach (int i in A) Console.Write(i + " ");
								Console.WriteLine();
								Console.WriteLine();
								condicion3 = false;
							}
							else if (opcion2 == 'B')
							{
								Console.WriteLine("Arreglo B:");
								foreach (int i in B) Console.Write(i + " ");
								Console.WriteLine();
								Console.WriteLine();
								condicion3 = false;
							}
							else if (opcion2 == 'C')
							{
								int aux = 0;
								for (int i = 0; i < n; i++)
								{
									if (C[i] == 0)
									{
										aux++;
									}
								}
								if (aux == n) Console.WriteLine("Error! no se ha llenado el arreglon C anteriormente\n");
								else
								{
									Console.WriteLine("Arreglo C:");
									foreach (int i in C) Console.Write(i + " ");
									Console.WriteLine();
									Console.WriteLine();
								}
								condicion3 = false;
							}
							else Console.WriteLine("Error! Digite nuevamente");
						}
						condicion3 = true;
					}
					else if (opcion == 6)
					{
						Console.WriteLine("Saliendo...");
						condicion = false;
						condicion2 = false;
					}
					else
					{
						Console.WriteLine("Error intente nuevamente");
						Console.WriteLine();
						break;
					}

					if (opcion != 6 && opcion >= 1 && opcion < 6)
					{
						while (condicion3)
						{
							Console.WriteLine("Volver(v)	Hacer denuevo(l)");
							Console.Write("Opcion: ");
							opcion2 = char.Parse(Console.ReadLine());
							Console.WriteLine();
							opcion2 = char.ToLower(opcion2);

							if (opcion2 == 'v')
							{
								condicion2 = false;
								condicion3 = false;
							}
							else if (opcion2 == 'l')
							{
								Console.WriteLine("\nVolviendo hacer...\n");
								condicion3 = false;
							}
							else
							{
								Console.WriteLine("Error! digite nuevamente");
								Console.WriteLine();
							}
						}
						condicion3 = true;
						//Console.Clear();
					}
				}
				condicion2 = true;
		
			} while (condicion);

			Console.ReadKey();
		}
	}
}
