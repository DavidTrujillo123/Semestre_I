/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

/**
 *
 * @author Usuario
 */
public class Varios {

    //Bisiesto o no
    public static boolean añobiciesto (int año1){
        
        boolean bisiesto;
        
        bisiesto= true;
        if(año1 % 4 == 0){
            if(año1 % 100 == 0){
                if(año1 % 400 == 0){
                    
                }
                else{ 
                    bisiesto = false;
                }
            }
            else{
                
            }
        }
        else{
            bisiesto = false;
            
        }
        return (bisiesto);
    }
     
     public static int diasT (int dia, int mes){
         
         
         if(añobiciesto(dia) && mes==2){
            if(dia >29){
                dia=1;
            }
         }
         
         
         
         return dia;
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
