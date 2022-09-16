/*Tarea de repaso 12 - Que tome dos números del 1 al 5 y diga si ambos son primos.
 */
package tareaderepaso_12;

public class TareaDeRepaso_12 {

    public static void main(String[] args) {
        
        int a,b;
        
        a=3;
        b=3;
        
        if(a<=0 || a>5 | b<=0 || b>5){
            System.out.println("Error! Ingrese nuevamente los datos");
            
        }
        else{
            if(a==4 && b==4){
                System.out.println("Ambos son primos");
            }
            else if(a != 4 && b != 4){
                System.out.println("Ambos no son primos");
            }
            else{
                if(a==4){
                    System.out.println("El nuemero "+a+" es primo y el numero "+b+" no es primo");
                }
                else{
                    System.out.println("El nuemero "+b+" es primo y el numero "+a+" no es primo");
                }
            }
        }
        
    }
    
}
