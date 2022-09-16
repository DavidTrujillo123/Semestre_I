/* En un estacionamiento cobran $/. 1.500 por hora o fracción.
Diseñe un algoritmo que determine cuanto debe pagar un cliente por el 
estacionamiento de su vehículo, conociendo el tiempo de estacionamiento en horas 
y minutos.
 */
package ejerciciopractica_8;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int hora;
        int min;
        double pago;
        hora=2;
        min=0;
        
        if(min >0 ){
            hora++;
        }
        
        pago= (hora*1.0) * 1500;
        
        System.out.println("SU MONTO A PAGAR ES: "+pago);
    }
    
}
