/* Tarea 24.- Se ingresan un conjunto de n edades de personas por teclado. El programa 
finalizara cuando el promedio de las edades sea superior a 25.
 */
package tarea24_u3;

import java.util.Scanner;


public class Tarea24_U3 {

        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        int suma_edad;
        double promedio_edad;
        int n;
        
        suma_edad=0;
        n = 0;
        
        do{
            n++;
            System.out.println("Ingrese una edad ");
            edad = entrada.nextInt();
           
            suma_edad += edad;
            promedio_edad = (suma_edad)*1.0 / n; 
            
        }while(promedio_edad <= 25);
        System.out.println("");
        System.out.println("El promedio de edad es: "+promedio_edad);
        System.out.println("Fin app...");
        
    }
    
}
