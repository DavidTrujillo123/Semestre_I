/* Tarea de repaso 4 - Que pida un número del 1 al 12 y diga el nombre del mes 
correspondiente
enero(1) - febrero(2)- marzo(3) - abril(4) - mayo(5) - junio(6) - julio(7)
agosto(8) - septiembre(9) - octubre(10) - noviembre(11) - diciembre(12) 
 */
package tareaderepaso_4;

public class TareaDeRepaso_4 {

    public static void main(String[] args) {
        
        int mes;
        
        //System.out.println("Ingrese un número entre 1 y 12 para saber el mes");        
        mes=12;
        
        switch(mes){
            case 1:
                System.out.println("El mes es enero");
                break;
            
            case 2:
                System.out.println("El mes es febrero");
                break;
            case 3:
                System.out.println("El mes es marzo");
                break;
            
            case 4:
                System.out.println("El mes es abril");
                break;    
            case 5:
                System.out.println("El mes es mayo");
                break;
            
            case 6:
                System.out.println("El mes es junio");
                break;
            case 7:
                System.out.println("El mes es julio");
                break;
            
            case 8:
                System.out.println("El mes es agosto");
                break;    
            case 9:
                System.out.println("El mes es septiembre");
                break;    
            case 10:
                System.out.println("El mes es octubre");
                break;
            
            case 11:
                System.out.println("El mes es noviembre");
                break;
            case 12:
                System.out.println("El mes es diciembre");
                break;
            default:
                  System.out.println("Error! Vuelva a ingresar los datos");
        }
    }
    
}
