/*Tarea de repaso 3 -  Que pida un número del 1 al 7 y diga el día de la semana 
correspondiente.
Lunes(1)-Martes(2)-Miercoles(3)-Jueves(4)-Viernes(5)-Sabado(6)-Domingo(7)
 */
package tareaderepaso_3;

public class TareaDeRepaso_3 {

    public static void main(String[] args) {
       
        int dia;
        
        //System.out.println("Ingrese un número entre 1 y 7 para saber el dia de la semana");
        dia=7;
        
        if(dia<=0 || dia>7){
            System.out.println("Error! Ingrese nuevamente los datos");
        }
        else{
            if(dia==1){
                System.out.println("El día es lunes");
            }
            else if(dia==2){
                System.out.println("El día es martes");
            }   
            else if(dia==3){
                System.out.println("El día es miercoles");
            }
            else if(dia==4){
                System.out.println("El día es jueves");
            }
            else if(dia==5){
                System.out.println("El día es viernes");
            }
            else if(dia==6){
                System.out.println("El día es sabado");
            }
            else{
                System.out.println("El día es domingo");
            }
        }    
    }
    
}
