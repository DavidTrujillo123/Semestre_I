/*Tarea 3 - Realizar un método que me retorne la suma de todos los números 
impares de un rango (inicio-fin) definido en los parámetros y probar su correcto funcionamiento.
 */
package tarea3_u3b;


public class Tarea3_U3B {

    static int SumaImparWhile(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        if(inicio % 2 == 0){
            inicio++;
        }
        
        while(inicio<=fin){
            suma = suma + inicio;
            inicio +=2;
        }
        return suma;
    }
    
    static int SumaImparFor(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        if(inicio % 2 == 0){
            inicio++;
        }
        
        for(; inicio<=fin;inicio+=2){
            suma = suma + inicio;
        }
        return suma;
    }
    
    public static void main(String[] args) {
        
        System.out.println(SumaImparWhile(10,2));
        System.out.println(SumaImparFor(9,10));
    }
    
}
