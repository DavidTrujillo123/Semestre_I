/*TAREA 7 - Escriba un programa que pida dos números y que conteste cúal es el
menor y cúal es el mayor o que escriba que son iguales.

numeroA > numeroB entoces numeroA es mayor y numeroB es menor sino 
numeroA < numeroB entonces numeroB es mayor y numeroA es mener sino
Ambos años son iguales
 */
package tarea_7;

public class TAREA_7 {

  
    public static void main(String[] args) {
        
        double numeroA,numeroB;
                
        numeroA=0;
        numeroB=0;
        
        if(numeroA > numeroB ){
            System.out.println("El número mayor es "+numeroA+" y el número menor es "+numeroB);
        }
        else{
            if(numeroA < numeroB ){
                System.out.println("El número mayor es "+numeroB+" y el número menor es "+numeroA);
            }
            else{
                System.out.println("Ambos números son iguales");
            }
        }
    }
    
}
