/* Tarea 23.- Escribir un programa que solicite ingresar n notas de alumnos y nos informe 
cuántos tienen notas mayores o iguales a 7 y cuántos menores. El programa termina 
cuanto se ingrese un valor de 0.
 */
package tarea23_u3;

import java.util.Scanner;


public class Tarea23_U3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nota;
        int condicion;
        int cont_mayor;
        int cont_menor;
        int i;
        i=0;
        cont_mayor = 0;
        cont_menor = 0;
        condicion = 1;
        
        
        do{
            System.out.println("Ingrese una nota o si desea salir digite 0"); 
            nota = entrada.nextInt();
            System.out.println("");
            
            if(nota == 0){
                condicion = 0;
            }
            else{
                if(nota >= 7){
                    cont_mayor++;
                }
                else{
                    cont_menor++;
                }
                i++;
            }
            
        }while(condicion > 0);
        
        System.out.println("");
        System.out.println("Notas totales --> "+i);
        System.out.println("Mayores o iguales a 7 --> "+cont_mayor);
        System.out.println("Menores que 7 --> "+cont_menor);
    }
    
}
