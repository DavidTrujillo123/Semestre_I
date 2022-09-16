using System;
/*Tarea 10: Uso del IF
Cuatro enteros entre 0 y 100 representan las puntuaciones de un estudiante de un curso de 
informática. Escribir un programa que encuentre la media de estas puntuaciones y que visualice 
una tabla de notas de acuerdo con el siguiente cuadro:
 Media puntuación
90-100 A 
80-89 B 
70-79 C 
60-69 D 
0-59 E
*/
namespace Ejercicio_De_Practica_Del_Deber
{
	class Program
	{
		static char Puntuacion(int nota1, int nota2, int nota3, int nota4 )
		{
			char media;
			int puntuacion;
			puntuacion = (nota1 + nota2 + nota3 + nota4)/4;

			if (puntuacion <= 59)
			{
				return media = 'E';
			}
			else if (puntuacion == 60 || puntuacion <= 69)
			{
				return media = 'D';
			}
			else if (puntuacion == 70 || puntuacion <= 79) return media = 'C';
			else if (puntuacion == 80 || puntuacion <= 89) return media = 'B';
			else return media = 'A';
			
			
			
		}

		static void Main(string[] args)
		{


			int nota1, nota2, nota3, nota4;
			nota1 = 70;
			nota2 = 70;
			nota3 = 70;
			nota4 = 70;


			if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100 || nota4 < 0 || nota4 > 100) Console.WriteLine("Error");
			else Console.WriteLine("Su calificacion es "+Puntuacion(nota1, nota2, nota3, nota4));

		}
	}
}
