/* Tarea 5 - Realizar un método que me retorne la cantidad de múltiplos de un 
número en rango (inicio-fin) definido en los parámetros y probar su correcto funcionamiento.
 */
package tarea5_u3b;


public class Tarea5_U3B {

    public static int CantidadMultWhile(int inicio,int fin, int num){
        int aux;
        int cont;
        int result;
        cont = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio <= fin){
            result= inicio%num;
            if(result==0) cont++;
            inicio++;
        }
        return cont;
    }
    public static int CantidadMultFor(int inicio,int fin, int num){
        int aux;
        int cont;
        int result;
        cont = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        for (; inicio <= fin; inicio++) {
            result= inicio%num;
            if(result==0) cont++;
        }
        return cont;
    }
    
    public static void main(String[] args) {
        System.out.println(CantidadMultWhile(1,10,2));
        System.out.println(CantidadMultFor(10, 5, 5));
    } 
}
