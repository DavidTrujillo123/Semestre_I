/*Tarea 16.- Realizar un método que me retorne si una fecha es mayor, menor o igual que otra 
fecha.

controlador:
1= fecha 1 mayor
0=igual
-1= fecha 1 menor
 */
package tareametodos_16;


public class TareaMetodos_16 {

    public static int Fechas(int dia1, int mes1, int año1, int dia2, int mes2, int año2){
        
        int controlador;
        controlador=0;
        if(año1> año2){
            controlador=1;
        }
        else if(año1<año2){
            controlador=-1;
        }
        else if(año1==año2){
            if(mes1>mes2){
                controlador = 1;
            }
            else if(mes1 < mes2){
                controlador=-1;
            }
            else if(mes1==mes2){
                if(dia1 > dia2){
                   controlador=1;
                }
                else if(dia1 < dia2){
                    controlador =-1;
                }
                else
                    controlador=0;
            }
        }
        return controlador;
        
    }
            
            
    public static void main(String[] args) {
        int dia1, dia2;
        int mes1, mes2;
        int año1, año2;
        int fecha;
        
        dia1=20;
        mes1=12;
        año1=2021;
        
        dia2=21;
        mes2=10;
        año2=2021;
        
        fecha= Fechas(dia1, mes1, año1, dia2, mes2, año2);
        
        System.out.println("Fecha 1 = "+dia1+"/"+mes1+"/"+año1);
        System.out.println("Fecha 2 = "+dia2+"/"+mes2+"/"+año2);
        
        if(fecha == 1) System.out.println("La Fecha 1 es mayor que la Fecha 2");
        if(fecha == -1) System.out.println("La Fecha 2 es mayor que la Fecha 1");
        if(fecha==0) System.out.println("Las fechas son iguales");
        
    }
    
}
