/*Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden 
introducido y en orden inverso
 */
package ejercicio_mostrar_5_numeros;


public class Ejercicio_Mostrar_5_Numeros {

    
    public static void main(String[] args) {
        int[] num= new int [5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
        
        for(int i=num.length-1 ; i>=0;i--){
            System.out.println(num[i]);
        }
        System.out.println("");
        for(int i:num){
            System.out.println(i); 
        }
    }
    
}
