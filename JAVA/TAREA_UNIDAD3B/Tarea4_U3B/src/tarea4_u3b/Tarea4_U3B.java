/*Tarea 4 - Realizar un método que me retorne la suma de todos los números múltiplos de un 
número en rango (inicio-fin) definido en los parámetros y probar su correcto 
funcionamiento
 */
package tarea4_u3b;


public class Tarea4_U3B {

    public static int SumaMultWhile(int inicio, int fin, int num){
        int aux;
        int suma;
        int result;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio<=fin){
            result= inicio%num;
            if(result==0) suma =inicio+suma;
            inicio++;
        }
        return suma;
    }
    
    public static int SumaMultFor(int inicio, int fin, int num){
        int aux;
        int suma;
        int result;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        for(; inicio<=fin; inicio++){
            result= inicio%num;
            if(result==0) suma =inicio+suma;
        }
        return suma;
    }
    
    public static void main(String[] args) {
        System.out.println(SumaMultWhile(1,5,2));
        System.out.println(SumaMultFor(4, 12, 3));               
    }
}
