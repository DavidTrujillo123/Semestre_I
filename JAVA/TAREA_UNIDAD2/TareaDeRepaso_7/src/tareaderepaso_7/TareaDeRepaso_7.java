/*Tarea de repaso 7 - Que pida un número y diga si es positivo o negativo
 */
package tareaderepaso_7;


public class TareaDeRepaso_7 {

    public static void main(String[] args) {
        
        double num;
        
        //System.out.println("Digite un numero para saber si es positivo o negativo");
        num=-5;
        
        if(num>0){
            System.out.println("El número "+num+" es positivo");
        }
        else if(num<0){
            System.out.println("El número "+num+" es negativo");
        }
        else {
            System.out.println("El número es cero");
        }
    }
    
}
