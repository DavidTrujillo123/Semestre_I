/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractica_pruebawhile;

public class EjercicioPractica_PruebaWhile {

    public static void Multiplos(int inicio, int fin, int n){
        int cont;
        int aux;
        int mult;
        int suma;
        suma = 0;
        mult = 1;
        cont = 0;
        
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        int i = inicio;
        while(i <= fin ){
            cont ++;
            mult = n*i;
            System.out.println(cont+") "+n+"*"+i+"="+mult);
            suma += mult;
            i++;
        }
        
        double promedio;
        promedio = (suma)*1.0 / cont;
        
        System.out.println("");
        System.out.println("La cantida de multiplos son: "+cont);
        System.out.println("La suma de los multipos es: "+suma);
        System.out.println("El promedio es: "+promedio);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        Multiplos(1,10,13);
        Multiplos(2,8,3);
        Multiplos(9,12,8);
        Multiplos(60,62,7);
        Multiplos(1,5,8);
    }
    
}
