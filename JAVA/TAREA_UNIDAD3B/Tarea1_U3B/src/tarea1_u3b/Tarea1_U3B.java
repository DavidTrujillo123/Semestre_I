/*Tarea 1 - Realizar un método que me retorne la suma de todos los números de un 
rango (inicio-fin) definido en los parámetros y probar su correcto funcionamiento.
 */
package tarea1_u3b;


public class Tarea1_U3B {

    public static int SumaRangoWhile(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio<=fin){
            suma = suma + inicio;
            inicio ++;
        }
        return suma;
    }
    public static int SumaRangoFor(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        for(;inicio<=fin;inicio++){
            suma = suma + inicio;
        }
        return suma;
    }
    public static void main(String[] args) {
        
        System.out.println(SumaRangoWhile(6,3));
        System.out.println(SumaRangoFor(1,13));
    }
    
}
