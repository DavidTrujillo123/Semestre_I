/*Tarea de repaso 9 - Que pida tres números y detecte si se han introducido 
en orden creciente.
 */
package tareaderepaso_9;

public class TareaDeRepaso_9 {

    public static void main(String[] args) {
        
        int a,b,c;
        
        a=1;
        b=10;
        c=100;
        
        if(a==b && a==c){
            System.out.println("Los numeros son iguales");
        }
        else if(a<b && a<c && b<c){
            System.out.println("Los numeros se han introducido en orden creciente: \n"+a+" "+b+" "+c);
        }
        else{
            System.out.println("Los numeros no se han introducido en orden creciente: \n"+a+" "+b+" "+c);
        }
    }
}
