/*Tarea de repaso 14 -  Que tome tres números y diga si la multiplicación de
los dos primeros es igual al tercero.
 */
package tareaderepaso_14;


public class TareaDeRepaso_14 {

    
    public static void main(String[] args) {
        
        int a,b,c, mult;
        
        a=1;
        b=3;
        c=3;
        
        mult= a*b;
        
        if( c== mult){
            System.out.println("Sus numeros son: "+a+" "+b+" "+c+" y la multiplicación de "+a+"*"+b+" es "+mult );
            System.out.println("El tercero si es igual a la multiplicación de los dos primeros");
            
        }
        else{
            System.out.println("Sus numeros son: "+a+" "+b+" "+c+" y la multiplicación de "+a+"*"+b+" es "+mult );
            System.out.println("El tercero no es igual a la multiplicación de los dos primeros");
        }
    }
    
}
