/*Tarea 8 -  Realizar un método que calcule y retorne el promedio de X números,
se dejarán de solicitar números hasta que se introduzca el cero.
 */
package tarea8_u3b;

import java.util.Scanner;

public class Tarea8_U3B {

    public static double Promedio() {
        Scanner entrada = new Scanner (System.in);
        boolean opcion;
        double suma;
        //double promedio;
        int cont;
        double num;
        opcion=true;
        suma=0;
        cont=0;
        do{
            cont++;
            System.out.print(cont+".- "+"Ingrese un número: ");
            num = entrada.nextDouble();
            
            if(num==0){
                opcion = false;
                cont--;
                //break;
            }
            suma=num+suma;
           
         
        }while(opcion);
        return suma/cont;
    }
    
    public static void main(String[] args) {
        System.out.println("El promedio es de "+Promedio());
    }
    
}
