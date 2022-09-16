/* Tarea 21.- Realizar una aplicación que genere la siguiente salida pidiendo el orden de 
la figura
n=5
  i            aux          j
  1 @@@@@@@@@   9   -2      0    
  2 *@@@@@@@    7   -2      1
  3 **@@@@@     5   -2      2
  4 ***@@@      3   -2      3
  5 ****@       1   -2      4
                0
 */
package tarea21_u3;


public class Tarea21_U3 {

    public static void While(int n){
        int i;
        int cont;
        int aux,aux2;
        int j;
        
        i=1;
        cont=1;
        j=2;
        aux=n*2-1;
        aux2=1;
        
        while(i<=n){
            while(j<=aux2){
                System.out.print(" ");
                j++;
            }
            j=2;
            aux2++;
            while(cont<=aux){
                System.out.print("@");
                cont++;
            }
            cont=1;
            aux-=2;
            i++;
            System.out.println("");
        }
    }
    
    public static void For(int n){
        int aux,aux2;
        aux=n*2-1;
        aux2=1;
        
        for(int i=1; i<=n; i++){
            for(int j=2; j<=aux2; j++){
                System.out.print(" ");
            }
            aux2++;
            for(int cont=1; cont<=aux; cont++){
                System.out.print("@");
            }
            aux-=2;
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("For");
        For(5);
        System.out.println("While");
        While(5);
       
    }
}
