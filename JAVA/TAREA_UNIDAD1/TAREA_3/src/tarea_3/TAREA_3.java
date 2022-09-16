/* TAREA 3 - Codificar un programa que determine si un año es bisiesto; esto se
presenta cuando es múltiplo de 4, por ejemplo, 1984; sin embargo, los años que
son múltiplos de 100 solo son bisiestos cuando tambien son multiplos de 400; por
ejemplo, 1800 no es bisiesto, mientras que 2000, sí lo es.

Si es multiplo de 100
1800 % 100 = 0 y además 1800 % 400 !=0  No es bisiesto
1600 % 100 = 0 y además 1600 % 400 !=0  Es bisiesto

Sino es multiplo de 100 debe ser multiplo de 4

2012 % 100 !=0 entonces 2012 % 4 = 0 Es bisiesto

 */
package tarea_3;

public class TAREA_3 {

    public static void main(String[] args) {
       
        int año;
        año=1404;
      
        if(año<0){
            System.out.println("Error! Ingrese un año positivo");
        }
        else{
            if(año % 4 == 0){
                if(año % 100==0){
                    if(año % 400==0){
                    System.out.println("El año "+año+" es bisiesto");
                    }
                    else{
                        System.out.println("El año "+año+" no es bisiesto");
                    }
                }
                else{
                System.out.println("El año "+año+" es bisiesto");
                }
            }
            else{
                System.out.println("El año "+año+" no es bisiesto");
            }
        }     
    }
    
}