/*Tarea 12.- Realizar un método que me retorne si un año es bisiesto.
Bisiesto = divisible para 4 y cuando son multiplos de 100 debe ser divisible
para 400
 */
package tareametodos_12;


public class TareaMetodos_12 {

    public static boolean AñoBisiesto (int año){
        
        boolean bisiesto;
        
        bisiesto= true;
        if(año % 4 == 0){
            if(año % 100 == 0){
                if(año % 400 == 0){
                    
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
        /*
            if((año%4 == 0 && año%100 != 0 ) || (año % 400 ==0)){
                bisiesto = true;
            }
            else{
                bisiesto= false;
            }
        
        */
        
        
    }
    
    
    public static void main(String[] args) {
       
        int año;
        //boolean prueba;
        año=1800;
        
        //prueba = AñoBisiesto(año);
        
        if(año<=0){
            System.out.println("Error!");
        }
        else{
            
            if(AñoBisiesto(año) == true ){
                System.out.println("El año "+año+" es biciesto");
            }
            else{
                System.out.println("El año "+año+" no es biciesto");
            }
        }    
    }
    
}
