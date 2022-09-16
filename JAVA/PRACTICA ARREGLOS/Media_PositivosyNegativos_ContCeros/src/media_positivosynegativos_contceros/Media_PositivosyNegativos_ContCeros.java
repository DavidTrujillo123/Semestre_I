/*Leer 5 números por teclado, almacenarlos en un arreglo y a continuacion
realizar la media de los números positivos, la media de los negativos y contar 
el número de ceros.
 */
package media_positivosynegativos_contceros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Media_PositivosyNegativos_ContCeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] num= new int[5];
        int contpos,contneg;
        double mediaPositivos=0;
        double mediaNegativos=0;
        int contCeros=0;
        contpos=0;
        contneg=0;
        
        for(int i=0; i<5;i++){
            System.out.print((i+1)+". Digite un numero: ");
            num[i]= entrada.nextInt();
            if(num[i]>0){
                mediaPositivos = num[i] + mediaPositivos;
                contpos++;
            }
            else if(num[i]<0){
                mediaNegativos = num[i] + mediaPositivos;
                contneg++;
            }
            else contCeros++;
        }
        
        System.out.println("Sus numeros introducidos fueron");
        for(int i: num) {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        if(contpos==0) System.out.println("No existe");
        else System.out.println("La media de los positivos es: "+mediaPositivos/contpos);
        if(contneg==0) System.out.println("No existe numeros negativos");
        else System.out.println("La media de los negativos es: "+mediaNegativos/contneg);
        if(contCeros==0) System.out.println("No existe numeros cero");
        else System.out.println("La cantidad de ceros es: "+contCeros);
        
    }
    
}
