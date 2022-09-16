/*
Pregunta 1
 1
 2  3
 4  5   6
 7  8   9   10
11 12  13   14  15
16 17  18

Pregunta 2
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
   1 2 3 4
   1 2 3
   1 2
   1

Pregunta 3

   1 2 3 4 5 6
   1 2 3 4 5
   1 2 3 4
   1 2 3
   1 2
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
   1 2 3 4 5 6

 */
package ejercicios_de_practica_while_for;

public class Ejercicios_De_Practica_While_For {

    public static void Pregunta1(int n) {
        int aux;
        aux=1;
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(aux+"| ");
                aux++;
                if(aux>n){
                    break;
                }
            }
            if(aux>n) break;
            System.out.println("");
        }
        
    }
    
    public static void Pregunta2(int n){
        int i;
        int cont;
        int aux;
        i=1;
        cont=1;
        
        while(i<=n){
            while(cont <= i){
                System.out.print(cont);
                cont++;
            }
            cont=1;
            i++;
            System.out.println("");
        }
        
        i=1;
        aux=n-1;
        while(aux>=1){
            while(cont <=aux){
                System.out.print(cont);
                cont++;
            }
            cont=1;
            aux--;
            System.out.println("");
        }
        
    }
    
    public static void Pregunta3(int n) {
       int i;
       int cont;
       int aux;
       cont=1;
       aux=n;
       
       while(aux>=1){
           while(cont<=aux){
               System.out.print(cont);
               cont++;
           }
           cont=1;
           System.out.println("");
           aux--;
       }
        
       i=2;
       while(i<=n){
           while(cont<=i){
               System.out.print(cont);
               cont++;
           }
           cont=1;
           i++;
           System.out.println("");
       }
       
    }
    
    public static void Piramide(int n) {
        int i;
        int j;
        int aux2;
        int aux;
        aux=n-1;
        i=1;
        j=1;
        
        while(i<=n){
            
            while(j<=aux){
                System.out.print("*");
                j++;
            }
            j=1;
            aux--;
            while(j<=2*i-1){
                System.out.print(i);
                j++;
            }
            j=1;
            i++;
            System.out.println("");
        }
        int k;
        k=n-1;
        aux=n-1;
        i=1;
        aux2=2*aux-1;
        while(i<=aux){
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<=aux2){
                System.out.print(k);
                j++;
            }
            k--;
            j=1;
            aux2-=2;
            i++;
            System.out.println("");
        }
      
    }
    public static void main(String[] args) {
        /*Pregunta1(20);
        System.out.println("");
        Pregunta2(5);
        System.out.println("");
        Pregunta3(6);
        */
        
        Piramide(6);
    }
    
}
