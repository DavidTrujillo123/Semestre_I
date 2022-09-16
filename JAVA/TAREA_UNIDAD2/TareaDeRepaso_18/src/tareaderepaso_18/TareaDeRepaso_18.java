/*Tarea de repaso 18 -  Que calcule el sueldo que le corresponde al trabajador 
de una empresa que cobra un sueldo anual, el programa debe realizar los cálculos 
en función de los siguientes 
criterios:
a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
d. Si lleva menos de 3 años se le aplica un aumento del 3%.
 */
package tareaderepaso_18;

public class TareaDeRepaso_18 {
    
    public static void main(String[] args) {
       
        int año,porcentaje;
        double sueldo,sueldoFinal;
        
        año=10;
        sueldo=400.00;
        
        if(año<=0 || sueldo<=0){
            System.out.println("Error! Digite nuevamente los datos");
        }
        else{
            if(año>=10){
                porcentaje=10;
                sueldoFinal = sueldo*1.1;               
            }
            else if(año<10 && año>=5 ){
                porcentaje=7;
                sueldoFinal= sueldo*1.07;
            }
            else if(año<5 && año>=3 ){
                porcentaje=5;
                sueldoFinal= sueldo*1.05;
            }
            else {
                porcentaje=3;
               sueldoFinal= sueldo*1.03;
            }
           
            //String.format("%.2f", variable)--> controla la cantidad de decimales
            System.out.println("Tiene un aumeto del "+porcentaje+"% en su sueldo"
               + " por tanto su sueldo final es de: "+String.format("%.2f", sueldoFinal)+"$");
        }
    }
    
}
