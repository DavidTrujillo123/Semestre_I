/*      *   n=3
       ***
      *****
       ***
        *
 */
package ejercicios_de_practica;


public class Ejercicios_De_Practica {

    public static void Piramide1(int n){
       
        int i;
        int j;
        int cont;
        int aux;
        aux=n-1;
        i=1;
        j=1;
        cont=1;
        
        for(; i<=n*2; i+=2){
            for(j=aux; j>=1; j--){
                System.out.print(" ");
            }
            aux--;
            for(cont =1; cont <=i; cont++){
                System.out.print("a");
            }
           
            System.out.println();
                        
        }
        for(;aux>=1; aux-=2){
            
            if(aux != (n*2-1)){
                for(cont=1; cont<=j; cont++){
                    System.out.print(" ");
                }
                j++;
                for(cont=1; cont<=aux; cont++){
                    System.out.print("a");
                }

                System.out.println();
            }    
        }
    }
    
    public static void Piramide2(int n){
        int i;
        int j;
        int cont;
        int aux;
        i=n-1;
        cont=1;
        j=1;
        aux=n*2-1;
        
        for(;aux>=1; aux-=2){
            
            if(aux != (n*2-1)){
                for(cont=1; cont<=j; cont++){
                    System.out.print(" ");
                }
                j++;
                for(cont=1; cont<=aux; cont++){
                    System.out.print("a");
                }

                System.out.println();
            }    
        }
        
    }
    
    public static void main(String[] args) {
        int n;
        n=1;
       
            Piramide1(10);
            //Piramide2(10);
        
    }
    
}
