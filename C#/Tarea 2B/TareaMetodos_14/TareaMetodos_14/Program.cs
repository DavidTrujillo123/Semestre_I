using System;
/*Tarea 14 - Realizar una aplicación que me permita incrementar un día a una fecha en formato 
día-mes-año e imprimir el resultado

ejemplo:            
28/02/2000   +1dia = 29/02/2000 

Tienen 31 días: enero(1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10) y diciembre(12).
Tienen 30 días: abril(4), junio(6), septiembre(9) y noviembre(11).
Tiene 29 días: febrero(2) (si el año es bisiesto).
Tiene 28 días: febrero(2) (si el año no es bisiesto).      
 */

namespace TareaMetodos_14
{
	class Program
    {


		//AÑOS BISIESTOS O NO
    public static bool añobisiesto(int año)
        {

            bool bisiesto;

            bisiesto = true;
            if (año % 4 == 0)
            {
                if (año % 100 == 0)
                {
                    if (año % 400 == 0)
                    {

                    }
                    else
                    {
                        bisiesto = false;
                    }
                }
                else
                {

                }
            }
            else
            {
                bisiesto = false;
            }

            return (bisiesto);
        }

        //DIAS EN LOS DIFERENTES MESES Y AÑOS
        public static int Dia(int dia, int mes, int año)
        {

            dia = dia + 1;
            if (mes == 2 && añobisiesto(año) == true)
            {
                if (dia > 29)
                {
                    dia = 1;
                }
            }
            else if (mes == 2 && añobisiesto(año) == false)
            {
                if (dia > 28)
                {
                    dia = 1;
                }
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                if (dia > 30)
                {
                    dia = 1;
                }
            }
            else
            {
                if (dia > 31)
                {
                    dia = 1;
                }
            }

            return dia;
        }

        //PARA PASAR DE MES
        public static int Mes(int dia, int mes, int año)
        {

            dia = dia + 1;
            if (mes == 2 && añobisiesto(año) == true)
            {
                if (dia > 29)
                {
                    mes = mes + 1;
                }
            }
            else if (mes == 2 && añobisiesto(año) == false)
            {
                if (dia > 28)
                {
                    mes = mes + 1;
                }
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                if (dia > 30)
                {
                    mes = mes + 1;
                }
            }
            else
            {
                if (dia > 31)
                {
                    mes = mes + 1;
                    if (mes > 12)
                    {
                        mes = 1;
                    }
                }
            }

            return mes;

        }

        //PARA PASAR EL AÑO
        public static int Año(int dia, int mes, int año)
        {
            dia = dia + 1;
            if (dia > 31)
            {
                mes = mes + 1;
            }
            if (mes > 12)
            {
                // mes=1;
                año = año + 1;
            }
            return año;
        }
        static void Main(string[] args)
		{
			
            int dia, diat;
            int mes, mest;
            int año, añot;

            dia = 28;
            mes = 2;
            año = 2000;

            if (año <= 0 || mes <= 0 || mes > 12 || dia < 0 || dia > 31)
            {
                Console.WriteLine("Error!");
            }
            else
            {
                diat = Dia(dia, mes, año);
                mest = Mes(dia, mes, año);
                añot = Año(dia, mes, año);

                Console.WriteLine("Formato - DD/MM/AA");
                Console.WriteLine("La fecha es: " + dia + "/" + mes + "/" + año);
                Console.WriteLine("La fecha mas un dia es: " + diat + "/" + mest + "/" + añot);
            }
        Console.ReadLine();
        }
       
	}
}
