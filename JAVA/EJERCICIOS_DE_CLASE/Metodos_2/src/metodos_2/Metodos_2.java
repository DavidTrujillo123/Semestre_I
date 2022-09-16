/*Tarea 14 - Realizar una aplicación que me permita incrementar un día a una fecha en formato 
día-mes-año e imprimir el resultado

ejemplo:            
31/12/2021   +1dia = 01/01/2022 

Tienen 31 días: enero(1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10) y diciembre(12).
Tienen 30 días: abril(4), junio(6), septiembre(9) y noviembre(11).
Tiene 29 días: febrero(2) (si el año es bisiesto).
Tiene 28 días: febrero(2) (si el año no es bisiesto).
 */

package metodos_2;


public class Metodos_2 {

    public static boolean AñoBisiesto (int año){
        
        //return (año%4==0 && año%100 !=0 || año%400==0);
        
        if(((año%4==0) && (año%100!=0)) || (año%400==0)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int DiasMes(int mes, int año){
        if(mes ==2){
            if(AñoBisiesto(año)==true) return 29;
            else
                return 28;
        }
        else{
            if(mes==4 || mes==6 || mes==9 || mes==11) return 30;
            else
                return 31;
        }
        
    }
    
    public static String IncrementaDia(int dia, int mes, int año){
        
        if(dia == DiasMes(mes,año)){
            dia=1;
            mes= mes+1;
            if(mes>12){
                mes=1;
                año++;
            }
           
        }
        else{
            dia++;
        }
        return (dia+"/"+mes+"/"+año);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(IncrementaDia(31, 12, 2000));
        System.out.println(IncrementaDia(28, 2, 2000));
        System.out.println(IncrementaDia(28, 2, 2001));
        
        
        
    }
    
}
