/*Tarea de repaso 13 - Que tome dos números y diga si ambos son pares o impares.
 */
package tareaderepaso_13;


public class TareaDeRepaso_13 {

    
    public static void main(String[] args) {
        int a,b;
        
        a=2;
        b=3;
        
        if(a % 2 == 0 && b % 2==0){
            System.out.println("Ambos son pares");
        }
        else if(a % 2 !=0 && b % 2 !=0){
            System.out.println("Ambos son impares");
        }
        else{
            if(a % 2 ==0){
                System.out.println("El numero "+a+" es par y el numero "+b+" es impar");
            }
            else{
                System.out.println("El numero "+b+" es par y el numero "+a+" es impar"); 
            }
        }
    }
    
}
