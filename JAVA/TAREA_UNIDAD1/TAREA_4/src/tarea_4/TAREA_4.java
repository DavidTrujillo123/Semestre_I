/*TAREA 4 - Escribir un programa que calcule el número de días de un mes, dado
los valores númericos del mes y año.

Tienen 31 días: enero(1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10) y diciembre(12).
Tienen 30 días: abril(4), junio(6), septiembre(9) y noviembre(11).
Tiene 29 días: febrero(2) (si el año es bisiesto).
Tiene 28 días: febrero(2) (si el año no es bisiesto).
 */
package tarea_4;

public class TAREA_4 {

 
    public static void main(String[] args) {
        int mes,año,dias;
        año=2001;
        mes=2;
        
        if(año<0 || mes<=0 || mes>12){
            System.out.println("Erro! Vuelva a digitar los datos");
        }
        else{
            if(año % 4 == 0 && mes==2){
                if(año % 100==0){
                    if(año % 400==0){
                     //bisiesto
                        dias=29;
                    }
                    else{
                      //no bisiesto
                        dias=28;
                    }
                }
                else{
                    //bisiesto
                   dias=29;
                }
            }
            else if(mes==2){
                 //no bisiesto
                dias=28;
                
            }else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                    dias=31;
                }
                else {
                    dias=30;
                }
            System.out.println("El año es "+año+", el mes es "+mes+" y tiene "+dias+" días");
        } 
    }
    
}
