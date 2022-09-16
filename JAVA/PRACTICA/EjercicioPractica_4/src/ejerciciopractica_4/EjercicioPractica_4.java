/*Ejercicio 4:- Diseñe un algoritmo que lea un número de tres cifras y determine
si es igual al revés del número.
111   121
 */
package ejerciciopractica_4;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num;
      int centena;
      int unidad;
      int decena;
      num=125;
      
      
      
      centena= num/100;
      decena= num - centena*100;
      unidad= decena/10;
      unidad= decena - unidad*10;
      
        System.out.println("Su numero es: "+num);
      if(centena==unidad){
          System.out.println("Si se pueded leer de adelante hacia atras..");
      }
      else{
          System.out.println("No se puede leer de adelante hacia atras.");
      }
      
      
        
    }
    
}
