/*Tarea 13.- Realizar una aplicación que me despliegue un menú con las opciones 
para sumar, restar, multiplicar, dividir, potencia, factorial y salir, solicitar 
por teclado el ingreso de la operación a realizar y los datos necesarios para 
realizar la operación seleccionada. Repetir el proceso hasta que el usuario 
elija la opción de salir.
 */
package tarea13_u3;

import java.util.Scanner;

public class Tarea13_U3 {

    public static double Potencia(double basse, double exponente) {
        double result;
        result = 1;
        //for
        for (int i = 1; i <= exponente; i++) {
            result = result * basse;
        }
        return result;
    }

    static double Factorial(double num) {
        //while
        double a;
        double fac1;
        fac1 = 1;
        a = 1;
        while (a <= num) {
            fac1 = fac1 * a;
            a++;
        }
        return fac1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        boolean salir;
        int num1;
        int num2;
        num1 = 0;
        num2 = 0;
        String election;
        salir = true;
        election = "";
        
        System.out.println("Bienvenido...");
        System.out.println("---------------");

        do {
            System.out.println("Escoja una operacion segun sea su nececidad...");
            System.out.println("|1)Suma| |2)Resta| |3)Division| |4)Multipliacion| |5)Factoria| |6)Potencia| |7)Salir|");
            int opcion;
            opcion = entrada.nextInt();
            
            if (opcion == 1 || opcion == 2 || opcion ==3 || opcion == 4 || opcion ==5 || opcion == 6 || opcion == 7){
                if(opcion == 1) election = "Suma";
                else if(opcion == 2) election = "Resta";
                else if(opcion == 3) election = "Division";
                else if(opcion == 4) election = "Multiplicacion";
                else if(opcion == 5) election = "Factoria";
                else if(opcion == 6) election = "Potencia";
                else if(opcion == 7) election = "Salir";
                System.out.println("Ustes eligio la opcion de "+election);
   
                if(opcion == 1 || opcion == 2 || opcion ==3 || opcion == 4){
                    System.out.println("Ingrese un número");
                    num1 = entrada.nextInt();

                    System.out.println("Ingrese un número");
                    num2 = entrada.nextInt();
                }
                else if (opcion ==5){
                    System.out.println("Integrese un numero");
                    num1 = entrada.nextInt();
                }
                else if (opcion == 6){
                    System.out.println("Ingrese una base");
                    num1 = entrada.nextInt();

                    System.out.println("Ingrese un exponente");
                    num2 = entrada.nextInt();
                }
            }
            if (opcion == 1) //suma
            {
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) + "\n");
            }
            else if (opcion == 2) //resta
            {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) + "\n"); 
            }
            else if (opcion == 3) //division
            {
		if (num2 == 0) {
                    System.out.println("Error!");
                } else {
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + "\n");
                }
            } 
            else if (opcion == 4) //multiplicacion
            {
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2) + "\n");
                
            } 
            else if (opcion == 5) //factorial
            {
		System.out.println(num1 + "! =" + Factorial(num1) + "\n");
                
            } 
            else if (opcion == 6){
                
		System.out.println(num1 + "^" + num2 + "=" + Potencia(num1, num2) + "\n");
            }
            else if (opcion == 7) {
                System.out.println("Fin app...");
                salir = false;
            } else {
                System.out.println("Error!");
            }
            if(opcion != 7){
                System.out.println("¿Desea continuar? 1)Si 2)No");
                opcion = entrada.nextInt();
                    if (opcion == 2) {
                        System.out.println("Fin app...");
                        salir = false;
                    }
            }        

        } while (salir == true);

    }

}
