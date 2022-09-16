/*Tarea 05:
Cuenta las vocales y las consonantes del String “En pandemia por un murciélago....”. ¡OJO CON 
LOS ESPACIOS!
 */
package tarea5_u3c;


public class Tarea5_U3C {

    public static void main(String[] args) {
        String txt1;
        String txt2;
        char letra;
        int contVocales, contConsonantes;
        contVocales=0;
        contConsonantes=0;
        
        txt1="En pandemia por un murciélago....";
        txt2=txt1;
        txt1=txt1.replace(" ", "");
        txt1=txt1.replace(".", "");
        txt1=txt1.replace("é", "e");
        
        System.out.println(txt2);
        
        for(int i=1; i<=txt1.length()-1; i++){
            letra= txt1.charAt(i);
            if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
                contVocales++;
            }
            else contConsonantes++;
        }
        System.out.println("Vocales--> "+contVocales);
        System.out.println("Consonantes--> "+contConsonantes);
    }
    
}
