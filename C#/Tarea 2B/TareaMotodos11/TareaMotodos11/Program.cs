using System;
/*Tarea 11.- Realizar métodos para cotizar el dólar uno en pesos colombianos y 
otro método en euros.

1 dolar = 3882.8 pesos colombianos
1 dolar = 0.87 euros

 */
namespace TareaMotodos11
{
	class Program
	{

		public static double pesos(double dolar)
		{
			return (dolar * 3882.8);
		}

		public static double euro(double dolar)
		{
			return (dolar * 0.87);
		}


		static void Main(string[] args)
		{
			
            int opcion;
            double conversor;
            double cantidad;
            String tipo;
            tipo = "";
            cantidad = 0;
            conversor = 0;

            Console.WriteLine("Bienvenido al Conversor...");
            Console.WriteLine("________________________________________________________");

            Console.WriteLine("|1) Peso Colombiano|       |2) Euro|         |3) Salir|");
            Console.WriteLine("Elija una opcion");
            opcion = 1;
            Console.WriteLine(opcion + "\n");

            if (opcion <= 0 || opcion > 3)
            {
                Console.WriteLine("Error!");
            }
            else
            {
                if (opcion == 1)
                {
                    tipo = "Pesos colombianos";
                    cantidad = 80;
                    conversor = pesos(cantidad);
                }
                else
                {
                    if (opcion == 2)
                    {
                        tipo = "Euros";
                        cantidad = 90;
                        conversor = euro(cantidad);
                    }
                }

                if (opcion == 1 || opcion == 2)
                {
                    Console.WriteLine("Usted eligió " + tipo);
                    Console.WriteLine("La conversion de " + cantidad + " dolares " +
                        "es " + conversor + " " + tipo);
                }
                else
                {
                    Console.WriteLine("Fin del progarama...");
                }
            }
            Console.ReadLine();
            
        }
	}
}
