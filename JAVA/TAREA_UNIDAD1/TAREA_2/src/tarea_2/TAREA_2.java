/*TAREA 2 - Dadas dos fechas en el formato día (1 a 31), mes (1 a 12) y año 
(entero de cuatro dígitos), correspondientes a la fecha de nacimiento y fecha
actual, respectivamente. Redactar un programa que deduzca y visualice la edad del individuo
expresada en días, meses y años.

 */
package tarea_2;


public class TAREA_2 {

    
    public static void main(String[] args) {
       
        int dia, diaActual, diasTotales;
        int mes, mesActual, mesesTotales;
        int año, añoActual, añoTotal;

        dia=07;
        mes=12;
        año=1973;
      
        diaActual=5;
        mesActual=11;
        añoActual=2021;
      
        //Condiciones para dia, mes y año
        if(dia<=0 || dia>31 || diaActual<=0 || diaActual>31){
            System.out.println("Error!, asegurese que el dia sea entero positivo y este entre 1 a 31");
            
        }else if(mes<=0 || mes>12 || mesActual<=0 || mesActual>12){
            System.out.println("Error!, asegurese que el mes sea entero positivo y este entre 1 a 12");
            
        }else if(año<=0 || año>10000 || añoActual<=0 || añoActual>10000){
            System.out.println("Error!, asegurese que el año sea entero positivo y sea de cuatro digitos");
            
        }else if(año > añoActual ){
            if(mes > mesActual){
                if( dia > diaActual){
            System.out.println("Error!, asegurese que el su fecha de nacimiento o la fecha actual este digitada correctamente");
                }
            }
        }
        else{
          
            if(diaActual < dia){
                mesActual -= 1;
                diaActual += 30;
                diasTotales = diaActual - dia; 
            }
            
            if(mesActual < mes){
                mesActual = mesActual+12;
                añoActual -=1;
                mesesTotales = mesActual - mes;
            }
                
                diasTotales = diaActual - dia;
                mesesTotales = mesActual - mes;
                añoTotal =  añoActual - año;
        
           System.out.println("Su edad es: "+añoTotal+" años, "+mesesTotales+" meses y "+diasTotales+" dias");
            
        }   
    }
}
