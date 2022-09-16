/* TAREA 1: Cuatro enteros entre 0 y 100 representan las puntuaciones de un estudiante
  de un curso de informática. Escribir un programa que encuentre la media de
estas puntuaciones y que visualice una tabla de notas de acuerdo con el siguiente
cuadro:

Media puntuación 
90 - 100  A
80 - 89   B
70 - 79   C
60 - 69   D
0  - 59   E

*/
package tarea_1;


public class TAREA_1 {

    
    public static void main(String[] args) {
     //VARIABLES
        int nota1, nota2, nota3, nota4;
        char puntuacion;
        double promedio;
     
        //Deben ir de 0 a 100
        nota1=90;
        nota2=95;
        nota3=93;
        nota4=93; 
       
        if(nota1<0 || nota2<0 || nota3<0 || nota4<0 || nota1>100 || nota2>100 || nota3>100 || nota4>100){
            System.out.println("Error! Ingrese numeros enteros positivos"); 
        }
        else{
            promedio=((nota1+nota2+nota3+nota4)*1.0)/4;
            
            System.out.println("Puntajes y Promedio");
            System.out.println("--------------------\n");
        
            if(promedio>=90){
                puntuacion= 'A';
            }
            else if(promedio>=80 && promedio<=90){
                puntuacion= 'B';
            }
            else if(promedio>=70 && promedio<=80){
                puntuacion = 'C'    ;
            }
                else{
                   puntuacion= 'D';
                }
             
            System.out.println("Sus puntajes son: "+nota1+" "+nota2+" "+nota3+" "+nota4+"\n"+" Su promedio es"
                    + " "+promedio+" por tanto tiene una nota de "+puntuacion);
           
        }
         System.out.println("Fin de app....");
    }
    
}
