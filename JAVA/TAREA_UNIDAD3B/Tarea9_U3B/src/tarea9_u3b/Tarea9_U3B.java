/*Tarea 9 - Realizar un método que realice la transformación de números enteros a binario y 
retorne el resultado.
 */
package tarea9_u3b;

public class Tarea9_U3B {

    public static String Binario(int n){
        String numBinario;
        String concatBinario = "";
        int div;
        int resto, aux;
        boolean condicion;
        condicion = true;
        aux = n;
        while (condicion) {
            resto = aux % 2;
            div = (aux) / 2;
            aux = div;

            numBinario = String.valueOf(resto);//modulo en string
            concatBinario = numBinario + concatBinario;//concatenacion de modulos
 
            if (div < 1) {
                condicion = false;
            }
        }
        return concatBinario;
       
    } 
    public static void main(String[] args) {
        
        System.out.println(Binario(5));
        System.out.println(Binario(6));
        System.out.println(Binario(7));
        System.out.println(Binario(10));
    }
}
