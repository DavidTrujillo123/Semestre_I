/*TAREA 5 - Dadas dos fechas en el formato dia (1 a 31), mes (1 a 12) y año
(entero de cuatro digitos), se necesita elaborar un algoritmo que me determine
si la primera fecha es mayor, menor o igual que la segunda fecha.

fecha_1             fecha_2
18-05-2021          30-10-2001          

Tranformar las fechas a dias y comparar. Es decir:

suma_a= 18+5(31)+2021(365)  = 737828    (fecha mayor)
suma_b= 30+10(31)+2001(365) = 700705    (fecha menor)
 */
package tarea_5;

public class TAREA_5 {

    public static void main(String[] args) {
        
        int año1, mes1, dia1;
        int año2, mes2, dia2;
        int suma1, suma2;
        //fecha_a
        dia1 = 30;
        mes1 = 11;
        año1 = 2001;
        
        //fecha_b
        dia2 = 30;
        mes2 = 12;
        año2 = 2001;
       
        if( dia1<=0 || dia1>31 || dia2<=0 || dia2>31 || mes1<=0 || mes1>12 || 
            mes2<=0 || mes2>12 || año1<=0 || año1>10000 || año2<=0 || año2>10000){
            System.out.println("Error! Vuelva a ingresar los datos");
        }
        else{
            suma1= dia1+(mes1*31)+(año1*365);
            suma2= dia2+(mes2*31)+(año2*365);
            
            if(suma1 > suma2){
                System.out.println("La primera fecha es mayor");
            }else if(suma1 < suma2){
                System.out.println("La primera fecha es menor");
            }else{
                System.out.println("La fecha es igual");
            }
        } 
    }
    
}
