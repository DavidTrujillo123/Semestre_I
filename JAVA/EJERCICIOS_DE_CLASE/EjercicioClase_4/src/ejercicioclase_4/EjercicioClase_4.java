/*
 
 */
package ejercicioclase_4;

/**
 *
 * @author Usuario
 */
public class EjercicioClase_4 {

    
    
    
    public static int Digitos (int num){
        int digito;
        digito=0;
        
        if(num >=1 && num<9){
            digito=1;
        }
        else if(num >=10 && num<99){
            digito=2;
        }
        else if(num>=100 && num <999){
            digito=3;
        }
        else if(num >= 1000 && num<9999){
           digito=4;
        }
        else if(num >=10000 && num<99999){
            digito=5;
        }
        
        return digito;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num=1154;
        
        if(num<=0 || num >= 100000) System.out.println("Error, digite un valor ente 1 y 99999"); 
        else{
            System.out.println("El numero de digitos de "+num+" es "+Digitos(num));   
        }
        
        
    }
    
}
