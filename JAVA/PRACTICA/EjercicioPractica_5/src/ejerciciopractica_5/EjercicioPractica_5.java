/*Ejercicio 5:- Una compañía dedicada al alquiler de automoviles cobra un monto 
fijo de $300 para los primeros 300 km de recorrido. Para más de 300 km y hasta 
1000 km, cobra un monto adicional de $ 150 por cada kilómetro en exceso sobre 300. 
Para más de 1000 km cobra un monto adicional de $ 100 por cada kilómetro en 
exceso sobre 1000. Los precios ya incluyen el 20% del impuesto general a las 
ventas, IVA. Diseñe un algoritmo que determine el monto a pagar por el alquiler 
de un vehículo y el monto incluído del impuesto.


0 a 300 --> $3000
300 a 1000 ---> 150 x cada kilometro recorrido
1000       ---> 100 x cada kilometro recorrido
 */
package ejerciciopractica_5;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int km;
        int recorrido;
        double impuesto;
        double pagar;
        double total;
        
        km=1500;
        
        if(km <=300 ){
            total= 3000;
            pagar= total*0.8;
            impuesto=total*0.2;
        }
        else{
            if(km <=1000){
                recorrido= km-300;
                total = 3000 + (recorrido*150);
                pagar = total*0.8;
                impuesto = total*0.2;
            }
            else {
                recorrido= km-1000;
                total = 3000 + (150*700) + (recorrido*100);
                pagar = total*0.8;
                impuesto = total*0.2;
            }
         
        }
        
        System.out.println("Su precio sin IVA es: "+
                pagar+"\n"+
                "El IVA es: "+impuesto+"\n"+
                "El precio total es: "+total);
        
    }
    
}
