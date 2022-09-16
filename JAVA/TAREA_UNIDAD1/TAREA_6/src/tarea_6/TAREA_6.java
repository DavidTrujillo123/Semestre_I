/* TAREA 6 - Escriba un programa que pida el año actual y un año cualquiera y que
escriba cúantos años han pasado desde ese año o cúantos años faltan para llegar
a ese año
añoActual > año entoces hacer añoActual - año 
añoActual < año entonces hacer año - añoActual
añoActual = año entoces hacer "Ambos años son iguales"
 */
package tarea_6;

public class TAREA_6 {

    public static void main(String[] args) {
        int añoActual;
        int año;
        int añoTotal;
        
        añoActual = 2021;
        año = 2000;
        
        if(año <= 0 && añoActual <=0){
            System.out.println("Error! Vuelva a ingresar los datos");
        }
        else{
            if(añoActual > año){
                añoTotal= añoActual - año;
                System.out.println("Los años que han transcurrido del año "+año+" al "+añoActual+" son: "+añoTotal);
            }
            else{
                if(añoActual < año){
                    añoTotal= año - añoActual;
                    System.out.println("Los años que falta del año "+añoActual+" al año "+año+" son: "+añoTotal);
                }
                else{
                    System.out.println("Los años son iguales");
                }
            }
        }
    }
}
