/*Tarea 10:
Transforma los caracteres del String: “ABCD abcd” a código ASCII e imprimelos en pantalla.
 */
package tarea10_u3c;


public class Tarea10_U3C {

  
    public static void main(String[] args) {
        String txt;
        int num;
        char caracter;
        txt="ABCD abcd";
        
        System.out.println("CARACTER    ASCII");
        for(int i=0; i<=txt.length()-1;i++){
            caracter= txt.charAt(i);
            num=caracter;
            System.out.println(caracter+"           "+num);
        }
       
    }
    
}
