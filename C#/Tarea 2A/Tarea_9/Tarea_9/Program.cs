using System;
/*TAREA 9 - Escriba un programa que pida una distacia en centímetros y que escriba 
esa distancia en kilómetros, metros y centímetros (escribir todas las unidades)

1cm = 1*10^-5km
1cm = 1/100m
1cm = 1cm
*/
namespace Tarea_9
{
	class Program
	{
		static void Main(string[] args)
		{
			
            int cm;
            int km;
            int m;


            Console.WriteLine("Bienvenido!!");
            Console.WriteLine(" ");
            //System.out.println("Escriba una distancia en cm");
            cm = 100083;

            Console.WriteLine("Desgloce de " + cm + " a km, m y cm");
            km = cm / 100000;
            cm = cm - (km * 100000);
            m = cm / 100;
            cm = cm - (m * 100);

            Console.WriteLine(km + "km");
            Console.WriteLine(m + "m");
            Console.WriteLine(cm + "cm");
        }
	}
}
