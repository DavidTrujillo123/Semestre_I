/*
 Con cuatro notas imprima la mas baja.
 */
package javaapplication117;

/**
 *
 * @author Usuario
 */
public class JavaApplication117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 10;
        int b = 700;
        int c = 13;
        int d = 60;
        int menor;
        
        menor=a;
        
        
        if(b < menor){
            menor=b;
        }
        if(c < menor){
            menor=c;
        }
        if(d < menor ){
            menor=d;
        }
        
        System.out.println(menor);
        
    }
    
}
