/*Tarea de repaso 11 - . Que muestre un menú que contemple las opciones 
“Archivo”, “Buscar” y “Salir”, en caso de que no se introduzca una opción 
correcta se notificará por pantalla.
 */
package tareaderepaso_11;

//import java.util.Scanner;

public class TareaDeRepaso_11 {

    public static void main(String[] args) {
       //Scanner entrada = new Scanner(System.in);
        int menu;
        
        System.out.println("                    | Menú |                     ");
        System.out.println("_________________________________________________");
        System.out.println("| 1)Archivo |    | 2)Buscar |      | 3)Salir | ");
        System.out.print("Digite un número:  \n");
        //menu = entrada.nextInt();
        menu=1;
        
        if(menu<=0 || menu>3){
            System.out.println("Error! Digite 1, 2 o 3 según sea su necesidad");
        }
        else{
            if(menu==1){
                System.out.println("Abriendo Archivo...");
                System.out.println("_________");
                System.out.println("...Fin del programa");
            
            }
            else if(menu==2){
                System.out.println("Buscando...");
                System.out.println("_________");
                System.out.println("...Fin del programa");
            }
            else {
                System.out.println("Saliendo...");
                System.out.println("_________");
                System.out.println("...Fin del programa");
            }
        }
        
    }
    
}
