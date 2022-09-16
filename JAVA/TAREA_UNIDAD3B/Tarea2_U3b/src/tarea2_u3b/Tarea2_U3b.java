/* Tarea 2 -Realizar un método que me retorne la suma de todos los números pares
de un rango (inicio-fin) definido en los parámetros y probar su correcto funcionamiento.
 */
package tarea2_u3b;


public class Tarea2_U3b {

    public static int SumaParesWhile(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        if(inicio % 2 != 0){
            inicio++;
        }
        
        while(inicio<=fin){
            suma = suma + inicio;
            inicio +=2;
        }
        return suma;
    }
    
    public static int SumaParesFor(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        if(inicio % 2 != 0){
            inicio++;
        }
        
        for(;inicio<=fin;inicio+=2){
            suma = suma + inicio;
        }
        return suma;
    }
    
    public static void main(String[] args) {
        
        System.out.println(SumaParesWhile(4,10));
        System.out.println(SumaParesWhile(10,5));
        System.out.println(SumaParesFor(2,4));
        System.out.println(SumaParesFor(20,24));
    }
    
}
