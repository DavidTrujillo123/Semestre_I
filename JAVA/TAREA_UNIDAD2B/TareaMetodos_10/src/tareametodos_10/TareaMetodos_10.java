/*Tarea 10.- Realizar un método que me retorne la suma de dos números.
 */
package tareametodos_10;


public class TareaMetodos_10 {

    public static double suma (double a , double b){
        return (a+b);
        
    }
    
    
    public static void main(String[] args) {
        
        double suma1;
        double numA,numB;
        
        numA=10.75;
        numB=3.56;
        
        suma1=suma(numA,numB);
        
        System.out.println("La suma de "+numA+" + "+numB+" = "+suma1);
    }
    
}
