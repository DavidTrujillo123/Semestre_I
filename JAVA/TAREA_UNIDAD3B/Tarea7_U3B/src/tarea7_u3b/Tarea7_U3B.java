/* Tarea 7 -  Realizar un método que muestre la tabla de Pitágoras definiendo 
como parámetro el límite de la tabla.
 */
package tarea7_u3b;


public class Tarea7_U3B {

    public static void PitagoricaWhile(int limite){
        int i;
        int j;
        i=1;
        j=1;
        
        System.out.print("x  |  ");
        
        while(i<= limite){
           
            System.out.print(i+"  |  ");//fila de x
            i++;
        }
        System.out.println("");
        i=1;
        
        while(i<=limite){
            while(j<=limite){
                System.out.print(""+i*j+"  |  ");
                if(j==1) System.out.print(""+i*j+"  |  "); //columna tabla del 1
                j++;
            }
             j=1;
            System.out.println("");
            i++;
        }
    }
   
    public static void PitagoricaFor(int limite){
        
        System.out.print("x  |  ");
        for(int i=1; i<=limite; i++){
            System.out.print(i+"  |  ");
        }
        
        System.out.println("");
        
        for(int i=1; i<=limite; i++){
            for (int j = 1; j <= limite; j++) {
                System.out.print(""+i*j+"  |  ");
                if(j==1) System.out.print(""+i*j+"  |  ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        PitagoricaFor(5);
        System.out.println("");
        PitagoricaWhile(2);
    } 
}
