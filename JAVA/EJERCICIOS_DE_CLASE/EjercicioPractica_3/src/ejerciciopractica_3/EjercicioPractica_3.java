/*
 */
package ejerciciopractica_3;


public class EjercicioPractica_3 {

    
    public static void main(String[] args) {
        int mario;
        int juan;
        int pedro;
        
        mario=10;
        juan=1;
        pedro=10;
        
        if(mario<=0 || juan<=0 || pedro<=0){
            System.out.println("Error");
        }
        else{
            if(mario==juan && mario==pedro){
                System.out.println("Tienen las mismas edad");
            }
            else{
                if(mario==juan){
                    System.out.println("Juan y Mario son contemporaneos");
                }
                else{
                    if(mario==pedro){
                        System.out.println("Mario y Pedro son contemporaneos");
                    }
                    else{
                        if(juan==pedro){
                            System.out.println("Juan y Pedro son contemporaneos");
                        }
                    }
                }
            }
            
        }
        
    }
    
}
