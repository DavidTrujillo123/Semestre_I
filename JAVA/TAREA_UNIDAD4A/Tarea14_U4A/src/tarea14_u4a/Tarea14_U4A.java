/*Tarea 14.-
Realizar una aplicación con el siguiente menú: 
1. Llenar el arreglo A de manera aleatoria. 
2. Llenar el arreglo B de manera aleatoria. 
3. Realizar C = A + B 
4. Realizar C = B - A 
5. Mostrar (Permitiendo al usuario elegir entre el arreglo A, B, o C). 
6. Salir. 
 */
package tarea14_u4a;

import java.util.Random;
import java.util.Scanner;

public class Tarea14_U4A {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcion;
        char opcion2;
        int n;
        boolean condicion, condicion2, condicion3;
        condicion = true;
        condicion2 = true;
        condicion3 = true;
        n = 5;

        int[] A;
        int[] B;
        int[] C;
        A = new int[n];
        B = new int[n];
        C = new int[n];

        do {
            System.out.println("Menu");
            System.out.println("1. Llenar el arreglo A de manera aleatoria.\n"
                    + "2. Llenar el arreglo B de manera aleatoria.\n"
                    + "3. Realizar C = A + B\n"
                    + "4. Realizar C = B - A\n"
                    + "5. Mostrar los arreglos\n"
                    + "6. Salir.");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            System.out.println();

            while (condicion2) {
                if (opcion == 1) {

                    for (int i = 0; i < n; i++) {
                        A[i] = aleatorio.nextInt(-100, 100);
                    }
                    System.out.println("Arrglo A llenado...\n");
                } else if (opcion == 2) {
                    for (int i = 0; i < n; i++) {
                        B[i] = aleatorio.nextInt(-100, 100);
                    }
                    System.out.println("Arreglo B llenado...\n");
                } else if (opcion == 3) {
                    for (int i = 0; i < n; i++) {
                        C[i] = A[i] + B[i];
                    }
                    System.out.println("Arreglo C llenado...\n");
                } else if (opcion == 4) {
                    for (int i = 0; i < n; i++) {
                        C[i] = B[i] - A[i];
                    }
                    System.out.println("Arreglo C llenado...\n");
                } else if (opcion == 5) {
                    while (condicion3) {
                        System.out.println("Elija un arreglo A-B-C");
                        opcion2 = entrada.next().charAt(0);
                        opcion2 = Character.toUpperCase(opcion2);
                        if (opcion2 == 'A') {
                            System.out.println("Arreglo A:");
                            for (int i : A) {
                                System.out.print(i + " ");
                            }
                            System.out.println();
                            System.out.println();
                            condicion3 = false;
                        } else if (opcion2 == 'B') {
                            System.out.println("Arreglo B:");
                            for (int i : B) {
                                System.out.print(i + " ");
                            }
                            System.out.println();
                            System.out.println();
                            condicion3 = false;
                        } else if (opcion2 == 'C') {
                            int aux = 0;
                            for (int i = 0; i < n; i++) {
                                if (C[i] == 0) {
                                    aux++;
                                }
                            }
                            if (aux == n) {
                                System.out.println("Error! no se ha llenado el arreglon C anteriormente\n");
                            } else {
                                System.out.println("Arreglo C:");
                                for (int i : C) {
                                    System.out.print(i + " ");
                                }
                                System.out.println();
                                System.out.println();
                            }
                            condicion3 = false;
                        } else {
                            System.out.println("Error! Digite nuevamente");
                        }
                    }
                    condicion3 = true;
                } else if (opcion == 6) {
                    System.out.println("Saliendo...");
                    condicion = false;
                    condicion2 = false;
                } else {
                    System.out.println("Error intente nuevamente");
                    System.out.println();
                    break;
                }

                if (opcion != 6 && opcion >= 1 && opcion < 6) {
                    while (condicion3) {
                        System.out.println("Volver(v)	Hacer denuevo(l)");
                        System.out.print("Opcion: ");
                        opcion2 = entrada.next().charAt(0);
                        System.out.println();
                        opcion2 = Character.toLowerCase(opcion2);

                        if (opcion2 == 'v') {
                            condicion2 = false;
                            condicion3 = false;
                        } else if (opcion2 == 'l') {
                            System.out.println("\nVolviendo hacer...\n");
                            condicion3 = false;
                        } else {
                            System.out.println("Error! digite nuevamente");
                            System.out.println();
                        }
                    }
                    condicion3 = true;
                }
            }
            condicion2 = true;

        } while (condicion);
    }
}
