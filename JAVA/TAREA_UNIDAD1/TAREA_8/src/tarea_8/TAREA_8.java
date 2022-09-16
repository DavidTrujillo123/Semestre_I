/*TAREA 8 - Escriba un programa que pida dos números enteros y que calcule su 
división, escribiendo si la división es exacta o no.
 */
package tarea_8;

public class TAREA_8 {

    public static void main(String[] args) {
        
        int numA;
        int numB;
        double div;
        
        System.out.println("Bienvenido!!");
        //System.out.println("Ingrese un numero");
        //System.out.println("Ingrese otro numero");
        numA=8;
        numB=4;
        
        if( numB ==0){
            System.out.println("Erro! División es imposible por favor ingrese nuevamente los datos");
        }
        else{        
            div =(numA*1.0)/numB;
            
            if( numA % numB == 0){
                System.out.println("La división de "+numA+"/"+numB+" es "+div+" y es exacta");
            }
            else{
                System.out.println("La división de "+numA+"/"+numB+" es "+div+" y no es exacta");
            }
        }        
    }
}
