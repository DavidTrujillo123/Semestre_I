/*Tarea de repaso 10 - Que pida tres números y detecte si se han introducido en 
orden decreciente.
 */
package tareaderepaso_10;


public class TareaDeRepaso_10 {

    
    public static void main(String[] args) {
         
        int a,b,c;
        
        a=10;
        b=6;
        c=3;
        
        if(a==b && a==c){
            System.out.println("Los números son iguales");
        }
        if(a>b && a>c && b>c){
            System.out.println("Los números se han introducido en orden decreciente\n "+a+" "+b+" "+c);
            
        }
        else{
            System.out.println("Los números no se han introducido en orden decreciente\n "+a+" "+b+" "+c);
        }
    }
    
}
