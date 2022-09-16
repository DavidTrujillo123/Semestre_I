/* Tarea de repaso 1 - Que pida un número del 1 al 5 y diga si es primo o no
 */
package tareaderepaso_1;


public class TareaDeRepaso_1 {

   
    public static void main(String[] args) {
        
        int numero;
        
       
        numero=2;
        
        if(numero<=0 && numero < 5){
            System.out.println("Error! Vuelva a ingresar un número");
        }
        else{
            if(numero==4){
                System.out.println("El numero "+numero+" es primo");
            }
            else{
                System.out.println("El numero "+ numero+" no es primo" );
            }
        }
    }
}
