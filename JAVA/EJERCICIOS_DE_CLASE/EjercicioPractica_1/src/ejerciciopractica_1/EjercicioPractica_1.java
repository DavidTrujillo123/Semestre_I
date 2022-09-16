/*
 */
package ejerciciopractica_1;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica_1 {

    public static void main(String[] args) {
        
        int hora;
        int minuto;
        int segundo;
        
        hora=9;
        minuto=35;
        segundo=59;
        
        if(hora>23 || minuto>59 || segundo>59){
            System.out.println("Error vuelva a digitar los datos");
        }
        else{
            System.out.println("La hora que digito es: "+hora+"h "+minuto+"min "+segundo+"seg ");
            System.out.println("Si se le aumentara un segundo seria: ");
            
            segundo=segundo + 1;
            if(segundo>59){
                segundo=0;
                minuto=minuto+1;
            }
            if(minuto>59){
                minuto=0;
                hora +=1;
            }
            if(hora>23){
                hora=0;
                   
            }
            
            System.out.println(hora+"h "+minuto+"min "+segundo+"seg ");
        }       
        
      
    }
    
}
