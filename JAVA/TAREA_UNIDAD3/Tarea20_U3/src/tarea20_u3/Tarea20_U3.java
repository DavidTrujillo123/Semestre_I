/* Tarea 20.- Realizar una aplicación que genere la siguiente salida pidiendo el orden de 
la figura
n=4
  i         aux     j
  1  @@@@   4       0
  2  *@@@   3       1
  3  **@@   2       2
  4  ***@   1       3
 */
package tarea20_u3;

public class Tarea20_U3 {

    public static void While(int n){
        int i;
        int j;
        int cont;
        int aux;
        aux=n;
        i=1;
        cont=1;
        j=1;
        
        while(i<=n){
            while(j<=i-1){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(cont<=aux){
                System.out.print("@");
                cont++;
            }
            cont=1;
            aux--;
            i++;
            System.out.println("");
        }
    }
    
    public static void For(int n){
        int aux;
        aux=n;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++ ){
                System.out.print(" ");
            }
            for(int cont=1; cont<=aux; cont++){
                System.out.print("@");
            }
            aux--;
            System.out.println("");
        }
       
    }
    public static void main(String[] args) {
        System.out.println("For");
        For(4);
        System.out.println("While");
        While(4);
    }
}
