/*

 */
package ejerciciopractica_2;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        double raiz,dentro;
        double x1;
        double x2;
        
        a=1;
        b=4;
        c=2;
        
        dentro = (b*b)-(4*a*c);
        
        if(dentro<0){
            dentro = dentro*(-1);
           raiz=Math.sqrt(dentro); 
            x1 = (-b+raiz)/2*a;
            x2 = (-b-raiz)/2*a;
            
            System.out.println("X1 = "+x1+"i");
            System.out.println("X2 = "+x2+"i");
        }
        else{
            raiz=Math.sqrt(dentro); 
            x1 = (-b+raiz)/2*a;
            x2 = (-b-raiz)/2*a;
            
            System.out.println("X1 = "+x1);
            System.out.println("X2 = "+x2);
        }
     
        
    }
    
}
