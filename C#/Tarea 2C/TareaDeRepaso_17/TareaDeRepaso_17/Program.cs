using System;
/* Tarea de repaso 17 -  Que lea un importe bruto y calcule su importe neto, 
si es mayor de 15.000 se le aplicará un 16% de impuestos, en caso contrario se 
le aplicará un 10%
 */

namespace TareaDeRepaso_17
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Bienvenido!");

            double importeBruto, importeNeto;

            //Console.WriteLine("Digite el importe bruto");

            importeBruto = 14000.85;

            if (importeBruto > 15000)
            {
                importeNeto = importeBruto * 1.16;
                Console.WriteLine("Su impuesto es de 16% y el importe neto es " + String.Format("{0:0.00}", importeNeto) + " $");
            }
            else
            {
                importeNeto = importeBruto * 1.1;
                Console.WriteLine("Su impuesto es del 10% y el importe neto es " + String.Format("{0:0.00}", importeNeto) + " $");
            }

        }
	}
}
