using System;
/*
 Calcualr la suma de los N primeros numeros,
		S= 1+2+3+4+5.....N
 */

namespace TareaInvertigacionCiclos
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

			int numero;
			numero = 10;
			int suma;
			suma = 0;

			for (int i=0; i<=numero; i++) {
				suma = suma + i;
			}
			Console.WriteLine("La suma de los "+numero+" primeros numeros es: "+suma);

			int suma1;
			int a;
			suma1 = 0;
			a = 0;
			while(a<numero){
				a++;
				suma1 = suma1 + a;
			}

			Console.WriteLine("La suma de los " + numero + " primeros numeros es: " + suma1);


			int suma2;
			int b;
			suma2 = 0;
			b = 0;
			do {
				b++;
				suma2 = suma2 + b;

			} while (b<numero);
			Console.WriteLine("La suma de los " + numero + " primeros numeros es: " + suma2);

			Console.ReadLine();
		}
	}
}
