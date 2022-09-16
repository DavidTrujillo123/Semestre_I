/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_3;

/**
 *
 * @author Usuario
 */
public class Metodo_3 {

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
        
        if(dia == 1){
            if(mes==1){
                mes=12;
                año--;
            }
            else{
                mes-=1;
            }
           dia= DiasMes(mes,año);
        }
        else{
            dia--;
        }
        return (dia+"/"+mes+"/"+año);
    }
    
    public static void main(String[] args) {
        
        System.out.println(IncrementaDia(1, 1, 2000));
        System.out.println(IncrementaDia(1, 3, 2000));
        System.out.println(IncrementaDia(25, 2, 2001));
        
        
    }
    
}
