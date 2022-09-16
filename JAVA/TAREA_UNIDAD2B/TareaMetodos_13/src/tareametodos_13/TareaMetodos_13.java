/* Tarea 13 -Realizar un método que me retorne los números de días que tiene un mes, dado un 
número del mes y del año.
Tienen 31 días: enero(1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10) y diciembre(12).
Tienen 30 días: abril(4), junio(6), septiembre(9) y noviembre(11).
Tiene 29 días: febrero(2) (si el año es bisiesto).
Tiene 28 días: febrero(2) (si el año no es bisiesto).
 */
package tareametodos_13;

public class TareaMetodos_13 {
    
    public static boolean año (int año){
        
        boolean bisiesto;
        
        bisiesto= true;
        if(año % 4 == 0){
            if(año % 100 == 0){
                if(año % 400 == 0){
                    
                }
                else{ 
                    bisiesto = false;
                }
            }
            else{
                
            }
        }
        else{
            bisiesto = false;  
        }
        
        return (bisiesto);
    }
     
    public static int dias (int año, int mes){
        
        int dia;
        if(mes ==2 && año(año)==true){
            dia=29;
        }
        else if (mes ==2 && año(año)==false){
            dia=28;
        }else if(mes==4 || mes==6 || mes==9 || mes==11){
            dia=30;
        }
        else{
            dia=31;
        }
        
        return dia;
    }
    
    public static void main(String[] args) {
        
        int año;
        int mes;
        int dia;
        
        año=2000;
        mes=4;
        
        if(año<=0 || mes<=0 || mes>12){
            System.out.println("Error!");
        }
        else{
            dia = dias(año, mes);
            System.out.println("El año es "+año+", el mes es "+mes+" y tiene "+dia+" dias");

        }
                
    }
    
}
