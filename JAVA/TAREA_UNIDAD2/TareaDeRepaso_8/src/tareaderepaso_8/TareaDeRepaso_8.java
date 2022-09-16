/*Tarea de repaso 8 -  Que pida una letra y detecte si es una vocal.
 */
package tareaderepaso_8;


public class TareaDeRepaso_8 {

   
    public static void main(String[] args) {
        
        char letra;
        //System.out.println("Digite una letra minuscula");
        letra='a';
        
        if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' 
          || letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U'){
            
            System.out.println("La letra "+ letra+ " es vocal");
        }
        else{
            System.out.println("La letra "+ letra+" no es vocal");
        }
    }
    
}
