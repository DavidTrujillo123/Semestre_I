/*Ejemplos Java - Bucles for, while y do while
Imprima los numeros del 1 al 5
Imprima los números impares del 1 al 5
Imprima los números pares del 1 al 5
 */
package tareainvestigacionciclos_17;


public class TareaInvestigacionCiclos_17 {

    
    public static void main(String[] args) {
        int par;
        int impar;
        
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("");
        
        impar=1;
        while(impar<5){
            System.out.println(impar);
            impar=impar+2;
           
        }
        System.out.println("");
        
        par=0;
        do{
            par=par+2;
            System.out.println(par);
        }while(par<4);   
    }
    
}
