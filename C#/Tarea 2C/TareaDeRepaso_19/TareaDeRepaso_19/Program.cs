using System;
/* Tarea de repaso 19 - Escriba un programa que pida una distancia en centímetros 
y que escriba esa distancia en kilómetros, metros y centímetros 
(escribiendo solamente las unidades necesarias)
 */
namespace TareaDeRepaso_19
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
            //Console.WriteLine("Escriba una distancia en cm");
            cm = 89583;

            Console.WriteLine("Desgloce de " + cm + " a km, m y cm");
            km = cm / 100000;
            cm = cm - (km * 100000);
            m = cm / 100;
            cm = cm - (m * 100);

            if (km > 0) Console.WriteLine(km + "km");
            if (m > 0) Console.WriteLine(m + "m");
            if (cm > 0) Console.WriteLine(cm + "cm");

            Console.ReadLine();
        }
	}
}
