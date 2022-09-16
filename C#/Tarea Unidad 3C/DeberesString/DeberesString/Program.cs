using System;

namespace DeberesString
{
	class Program
	{
        public static int SumaRango(int inicio, int fin)
        {
            int aux;
            int suma;
            suma = 0;
            if (fin < inicio)
            {
                aux = fin;
                fin = inicio;
                inicio = aux;
            }

            while (inicio <= fin)
            {
                suma = suma + inicio;
                inicio++;
            }
            return suma;
        }

        public static int SumaPares(int inicio, int fin)
        {
            int aux;
            int suma;
            suma = 0;
            if (fin < inicio)
            {
                aux = fin;
                fin = inicio;
                inicio = aux;
            }

            if (inicio % 2 != 0)
            {
                inicio++;
            }

            while (inicio <= fin)
            {
                suma = suma + inicio;
                inicio += 2;
            }
            return suma;
        }
        
        static int SumaImpar(int inicio, int fin)
        {
            int aux;
            int suma;
            suma = 0;
            if (fin < inicio)
            {
                aux = fin;
                fin = inicio;
                inicio = aux;
            }

            if (inicio % 2 == 0)
            {
                inicio++;
            }

            for (; inicio <= fin; inicio += 2)
            {
                suma = suma + inicio;
            }
            return suma;
        }

        public static int SumaMult(int inicio, int fin, int num)
        {
            int aux;
            int suma;
            int result;
            suma = 0;
            if (fin < inicio)
            {
                aux = fin;
                fin = inicio;
                inicio = aux;
            }

            while (inicio <= fin)
            {
                result = inicio % num;
                if (result == 0) suma = inicio + suma;
                inicio++;
            }
            return suma;
        }

        public static int CantidadMult(int inicio, int fin, int num)
        {
            int aux;
            int cont;
            int result;
            cont = 0;
            if (fin < inicio)
            {
                aux = fin;
                fin = inicio;
                inicio = aux;
            }

            for (; inicio <= fin; inicio++)
            {
                result = inicio % num;
                if (result == 0) cont++;
            }
            return cont;
        }

        public static double PromedioMult(int inicio, int fin, int num)
        {
            int aux;
            int suma;
            int result;
            int cont;
            double promedio;
            suma = 0;
            cont = 0;
            if (fin < inicio)
            {
                aux = fin;
                fin = inicio;
                inicio = aux;
            }

            while (inicio <= fin)
            {
                result = inicio % num;
                if (result == 0)
                {
                    cont++;
                    suma = inicio + suma;
                }
                inicio++;
            }
            promedio = suma / cont;
            return promedio;
        }

        public static void Pitagorica(int limite)
        {
            int i;
            int j;
            i = 1;
            j = 1;

            Console.Write("x  |  ");

            while (i <= limite)
            {

                Console.Write(i + "  |  ");//fila de x
                i++;
            }
            Console.WriteLine("");
            i = 1;

            while (i <= limite)
            {
                while (j <= limite)
                {
                    Console.Write("" + i * j + "  |  ");
                    if (j == 1) Console.Write("" + i * j + "  |  "); //columna tabla del 1
                    j++;
                }
                j = 1;
                Console.WriteLine("");
                i++;
            }
        }

        public static double Promedio()
        {
            bool opcion;
            double suma;
            int cont;
            double num;
            opcion = true;
            suma = 0;
            cont = 0;
            do
            {
                cont++;
                Console.Write(cont + ".- " + "Ingrese un número: ");
                num = int.Parse(Console.ReadLine());

                if (num == 0)
                {
                    opcion = false;
                    cont--;
                }
                suma = num + suma;


            } while (opcion);
            return suma / cont;
        }

        public static String Binario(int n)
        {
            String numBinario;
            String concatBinario = "";
            int div;
            int resto, aux;
            bool condicion;
            condicion = true;
            aux = n;
            while (condicion)
            {
                resto = aux % 2;
                div = (aux) / 2;
                aux = div;

                numBinario = Convert.ToString(resto);//modulo en string
                concatBinario = numBinario + concatBinario;//concatenacion de modulos

                if (div < 1)
                {
                    condicion = false;
                }
            }
            return concatBinario;

        }
        public static double Decimal(String num)
        {
            int i;
            double aux;
            double result, suma;
            i = 0;
            suma = 0;
            char digitos;

            for (int j = num.Length - 1; j >= 0; j--)
            {
                digitos = num[j];
                aux = Char.GetNumericValue(digitos);
                result = aux * (Math.Pow(2, i));
                suma = result + suma;
                i++;
            }

            return suma;
        }


        static void Main(string[] args)
		{
            bool condicion, condicion1;
            char salida;
            int opcion;
            int inicio, fin, num;
            condicion = true;
            condicion1 = true;
            do
            {
                Console.WriteLine("Escoja una opcion:\n"
                         + "1)SUMA DE NÚMEROS EN UN RANGO\n"
                        + "2)SUMA DE NÚMEROS PARES EN UN RANGO\n"
                        + "3)SUMA DE NÚMEROS IMPARES EN UN RANGO\n"
                        + "4)SUMA DE MULTIPLOS EN UN RANGO\n"
                        + "5)CANTIDAD DE MULTIPLOS EN UN RANGO\n"
                        + "6)PROMEDIO DE MULTIPLOS EN UN RANGO\n"
                        + "7)TABLA PITAGORICA\n"
                        + "8)PROMEDIO X NUMEROS\n"
                        + "9)ENTERO A BINARIO\n"
                        + "10)BINARIO A ENTERO\n"
                        + "11)SALIR");

                opcion = int.Parse(Console.ReadLine());

                if (opcion == 1)
                {
                    Console.WriteLine("Escogió SUMA RANGO");
                    Console.WriteLine("Digite un inicio");
                    inicio = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un fin");
                    fin = int.Parse(Console.ReadLine());
                    Console.WriteLine("La suma de todos los números en el rango " + inicio + " a " + fin + " es " + SumaRango(inicio, fin));
                }
                else if (opcion == 2)
                {
                    Console.WriteLine("Escogió SUMA DE NUMEROS PARES EN UN RANGO");
                    Console.WriteLine("Digite un inicio");
                    inicio = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un fin");
                    fin = int.Parse(Console.ReadLine());
                    Console.WriteLine("La suma de todos los números pares en el rango " + inicio + " a " + fin + " es " + SumaPares(inicio, fin));
                }
                else if (opcion == 3)
                {
                    Console.WriteLine("Escogió SUMA DE NUMEROS PARES EN UN RANGO");
                    Console.WriteLine("Digite un inicio");
                    inicio = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un fin");
                    fin = int.Parse(Console.ReadLine());
                    Console.WriteLine("La suma de todos los números pares en el rango " + inicio + " a " + fin + " es " + SumaPares(inicio, fin));
                }

                else if (opcion == 4)
                {
                    Console.WriteLine("Escogió SUMA DE MULTIPLOS EN UN RANGO");
                    Console.WriteLine("Digite un inicio");
                    inicio = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un fin");
                    fin = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un número");
                    num = int.Parse(Console.ReadLine());
                    Console.WriteLine("La suma de todos los números múltiplos de " + num + " en el rango " + inicio + " a " + fin + " es " + SumaMult(inicio, fin, num));
                }

                else if (opcion == 5)
                {
                    Console.WriteLine("Escogió CANTIDAD DE MULTIPLOS EN UN RANGO");
                    Console.WriteLine("Digite un inicio");
                    inicio = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un fin");
                    fin = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un número");
                    num = int.Parse(Console.ReadLine());
                    Console.WriteLine("La cantidad de múltiplos de " + num + " en el rango " + inicio + " a " + fin + " es " + CantidadMult(inicio, fin, num));
                }

                else if (opcion == 6)
                {
                    Console.WriteLine("Escogió PROMEDIO DE MULTIPLOS EN UN RANGO");
                    Console.WriteLine("Digite un inicio");
                    inicio = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un fin");
                    fin = int.Parse(Console.ReadLine());

                    Console.WriteLine("Digite un número");
                    num = int.Parse(Console.ReadLine());
                    Console.WriteLine("El promedio de todos los múltiplos de " + num + " en el rango " + inicio + " a " + fin + " es " + PromedioMult(inicio, fin, num));
                }

                else if (opcion == 7)
                {
                    Console.WriteLine("Escogió TABLA PITAGORICA");
                    Console.WriteLine("Digite un limite");
                    num = int.Parse(Console.ReadLine());

                    Console.WriteLine("Tabla Pitagorica hasta " + num);
                    Pitagorica(num);
                }

                else if (opcion == 8)
                {
                    Console.WriteLine("Escogió PROMEDIO X NUMEROS");
                    Console.WriteLine("Digite cero para salir de PROMEDIO X NUMEROS");
                    Console.WriteLine(Promedio());
                }

                else if (opcion == 9)
                {
                    Console.WriteLine("Escogió ENTERO A BINARIO");
                    Console.WriteLine("Digite un número entero");
                    num = int.Parse(Console.ReadLine()); ;

                    Console.WriteLine("Entero-->" + num);
                    Console.WriteLine("Binario-->" + Binario(num));
                }

                else if (opcion == 10)
                {
                    String binario;
                    Console.WriteLine("Escogió BINARIO A ENTERO");
                    Console.WriteLine("Digite un número binario");
                    binario = Console.ReadLine(); 

                    Console.WriteLine("Binario-->" + binario);
                    Console.WriteLine("Entero-->" + (binario));
                }

                else if (opcion == 11) break;
                else Console.WriteLine("Error!");

                do
                {//salir 
                    Console.WriteLine("Desea salir (S/N)");
                    salida = Convert.ToChar(Console.ReadLine());
                    salida = Char.ToLower(salida);

                    if (salida == 's')
                    {
                        condicion = false;
                        break;
                    }
                    else if (salida == 'n') break;
                    else Console.WriteLine("Error! Digite S o N");
                } while (condicion1);

            } while (condicion);

        
        }
    }
}
