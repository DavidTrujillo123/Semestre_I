/*Metodos
Area de circulo
Area= 2*PI*radio^2
 */
package metodos;

/**
 *
 * @author Usuario
 */
public class Metodos {
    
     public static double AreaCirculo (double radio){
            
        //double area;
        //area= (Math.PI)*radio*radio;
        return (Math.PI)*radio*radio;
      }
    
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        double area1; 
        double area2;
        int a;
        int b;
        a=3;
        b=6;
        
        area1=AreaCirculo(2*a);
        area2=AreaCirculo(b);
        
        System.out.println(area1);
        System.out.println(area2);
        System.out.println("");
        
        if(area1>area2){
            System.out.println("El area 1 es mayor que es area 2");
        }
        else{
            if(area1 < area2){
                System.out.println("El area 2 es mayor que el area 1");
            }
            else System.out.println("El area es igual");
        }
        
        
        
        
       
        
        
        
    }
    
}
