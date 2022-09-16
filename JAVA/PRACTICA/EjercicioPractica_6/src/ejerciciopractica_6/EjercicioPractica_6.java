/*
 
 */
package ejerciciopractica_6;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int hora, min, seg;
        
        hora=23;
        min=1;
        seg=1;
        
        
        if(seg==0){
            seg=59;
            if(min == 0){
                min=59;
                if(hora==0){
                    hora=23;
                }
                else{
                    hora--;
                }
            }
            else{
                min--;
            }
        }
        else{
            seg--;
        }
        
        System.out.println(hora+"/"+min+"/"+seg);
        
        
        
        hora=12;
        min=40;
        seg=59;
        if(seg==59){
            seg=0;
            if(min==59){
                min=0;
                if(hora==23){
                    hora=0;
                }
                else{
                    hora++;
                }
            }
            else{
                min++;
            }
        }
        else{
            seg++;
        }
        
        System.out.println(hora+"/"+min+"/"+seg);
        
    }
    
}
