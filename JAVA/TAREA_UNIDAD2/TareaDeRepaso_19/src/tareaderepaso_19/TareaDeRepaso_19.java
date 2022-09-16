/* Tarea de repaso 19 - Escriba un programa que pida una distancia en centímetros 
y que escriba esa distancia en kilómetros, metros y centímetros 
(escribiendo solamente las unidades necesarias)
 */
package tareaderepaso_19;

public class TareaDeRepaso_19 {
    
    public static void main(String[] args) {
        
        int cm;
        int km;
        int m;
        
        System.out.println("Bienvenido!!");
        System.out.println(" ");
        //System.out.println("Escriba una distancia en cm");
        cm=489583;
        
        System.out.println("Desgloce de "+cm+" a km, m y cm");
        km= cm/ 100000;
        cm= cm - (km*100000);
        m= cm/100 ;
        cm = cm-(m*100);
        
        if(km > 0) System.out.println(km+"km");
        if(m > 0) System.out.println(m+"m");
        if(cm > 0)System.out.println(cm+"cm");
    }
}
