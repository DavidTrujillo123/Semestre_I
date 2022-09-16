/*TAREA 9 - Escriba un programa que pida una distacia en centímetros y que escriba 
esa distancia en kilómetros, metros y centímetros (escribir todas las unidades)

1cm = 1*10^-5km
1cm = 1/100m
1cm = 1cm
 */
package tarea_9;

public class TAREA_9 {

    public static void main(String[] args) {
        
        int cm;
        int km;
        int m;
        
        
        System.out.println("Bienvenido!!");
        System.out.println(" ");
        //System.out.println("Escriba una distancia en cm");
        cm=100083;
        
        System.out.println("Desgloce de "+cm+" a km, m y cm");
        km= cm/ 100000;
        cm= cm - (km*100000);
        m= cm/100 ;
        cm = cm-(m*100);
        
        System.out.println(km+"km");
        System.out.println(m+"m");
        System.out.println(cm+"cm");
    }
    
}
