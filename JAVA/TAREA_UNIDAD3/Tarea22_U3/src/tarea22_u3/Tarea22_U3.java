/*Tarea 22.- Escribir un programa que solicite la carga de un numero entre 0 y 999, y nos 
muestre un mensaje de cuantos dígitos tiene el mismo. Finalizar el programa cuando 
se cargue el valor 0.
 */
package tarea22_u3;

import java.util.Scanner;

public class Tarea22_U3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
        int opcion;
        int digitos;

        digitos = 0;
        opcion = 1;

        do {
            System.out.println("Ingrese un numero, entre 0 y 999");
            num = entrada.nextInt();

            if (num < 0 || num > 1000) {
                System.out.println("Error!");
                System.out.println("Fin app...");
                opcion = 0;
            }
            else if (num == 0) {
                opcion = 0;
                System.out.println("Fin app...");
            }
            else {
                if (num > 0 && num < 10) {
                    digitos = 1;
                } else if (num < 100 && num >= 10) {
                    digitos = 2;
                } else if (num < 1000 && num >= 100) {
                    digitos = 3;
                }
                System.out.println("El numero "+num+" tiene "+digitos+" digitos");
                System.out.println("");

                System.out.println("¿Desea continuar? 0)No   1)Si");
                opcion = entrada.nextInt();
                
		System.out.println("");

                if (opcion == 0) {
                    System.out.println("Fin app...");
                }
            }
        } while (opcion > 0);

    }

}
