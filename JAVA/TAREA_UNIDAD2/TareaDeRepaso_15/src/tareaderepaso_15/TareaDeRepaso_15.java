/*Tarea de repaso 15 - Que tome tres números y diga si el tercero es el resto 
de la división de los dos primeros es igual al tercero.
 */
package tareaderepaso_15;

public class TareaDeRepaso_15 {

    public static void main(String[] args) {
        
        int a,b,c,mod;
        
        a=10;
        b=6;
        c=0;
       
        if(b == 0){
            System.out.println("Error! Division imposible");
        }
        else{
             mod=a % b ;
            if(mod == c){
                System.out.println("Sus numeros son: "+a+" "+b+" "+c+" el resto de "+a+"/"+b+" es "+mod );
                System.out.println("El tercero si es el resto de la division");
            }
            else{
                System.out.println("Sus numeros son: "+a+" "+b+" "+c+" el resto de "+a+"/"+b+" es "+mod );
                System.out.println("El tercero no es el resto de la division");
            }
        }
    }
    
}
