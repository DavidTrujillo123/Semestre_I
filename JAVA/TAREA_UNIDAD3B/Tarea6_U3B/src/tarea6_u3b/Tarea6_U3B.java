/*Tarea 6 - Realizar un método que me retorne el promedio de todos los múltiplos de un número 
en rango (inicio-fin) definido en los parámetros y probar su correcto funcionamiento.
 */
package tarea6_u3b;

public class Tarea6_U3B {

    public static double PromedioMultWhile(int inicio, int fin, int num){
        int aux;
        int suma;
        int result;
        int cont;
        double promedio;
        suma = 0;
        cont=0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio<=fin){
            result=inicio%num;
            if(result==0){
                cont++;
                suma = inicio+suma;
            }
            inicio ++;
        }
        promedio = suma/cont;
        return promedio;
    }
    
    public static double PromedioMultFor(int inicio, int fin, int num){
        int aux;
        int suma;
        int result;
        int cont;
        double promedio;
        suma = 0;
        cont=0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        for(; inicio<=fin;inicio++){
            result=inicio%num;
            if(result==0){
                cont++;
                suma = inicio+suma;
            }
        }
        promedio = suma/cont;
        return promedio;
    }
    
   
    public static void main(String[] args) {
        System.out.println(PromedioMultWhile(1, 10, 2));
        System.out.println(PromedioMultFor(1, 100, 10));
        
    }
}
