/*Tarea de repaso 16 - Que pase de Kg a otra unidad de medida de masa, mostrar 
en pantalla un menú con las opciones posibles.
 
1 Kilogramo = 0.001 Toneladas
1 Kilogramo = 1000 Gramos
1 Kilogramo = 2.20462 Libras
1 Kilogramo = 35.274 Onzas
 */
package tareaderepaso_16;

public class TareaDeRepaso_16 {

    public static void main(String[] args) {
        
        int opcion;
        double masa;
        double conversor;
        
        System.out.println("Bienvenido al convertidor de Kilogramos\n");
        //System.out.println("Digite la masa en kilogramos");
        masa=1000;
        
        if(masa<=0){
            System.out.println("Eror! Digite nuevamente la masa asegurese que sea positiva");
        }
        else{
            
            System.out.println("         MENÚ         ");
            System.out.println("--------------------------\n"
                    + "De Kilogramos a: ");
            System.out.println("1) Tonelada \n"
                    + "2) Gramo \n"
                    + "3) Libra \n"
                    + "4) Onza \n"
                    + "5) Salir \n"
                    + "Digite un numero ente 1 y 5 \n");
        
            opcion = 1;
        
            switch (opcion){
            
                case 1:
                    conversor = masa*0.001;
                    System.out.println("Kilogramos a Toneladas");
                    System.out.println(masa+" kilogramos son "+conversor+" toneladas\n");
                    System.out.println("Fin del programa....");
                break;
            
                case 2:
                    conversor = masa*1000;
                    System.out.println("Kilogramos a Gramos");
                    System.out.println(masa+" kilogramos son "+conversor+" gramos\n");
                    System.out.println("Fin del programa....");
                break;
            
                case 3:
                    conversor = masa*2.20462;
                    System.out.println("Kilogramos a Libras");
                    System.out.println(masa+" kilogramos son "+conversor+" libras\n");
                    System.out.println("Fin del programa....");
                break;
            
                case 4:
                    conversor = masa*35.274;
                    System.out.println("Kilogramos a Onzas");
                    System.out.println(masa+" kilogramos son "+conversor+" onzas\n");
                    System.out.println("Fin del programa....");
                break;
            
                case 5:
                    System.out.println("Fin del programa....");
                break;
            
                default:
                    System.out.println("Error! Digite un numero entre 1 y 5");
            }
        }
    }
    
}
