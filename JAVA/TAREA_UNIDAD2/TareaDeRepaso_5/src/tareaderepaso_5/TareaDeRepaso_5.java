/*Tarea de Repaso 5 - Que pida 3 números y los muestre en pantalla de menor a
mayor 
-Si A es mayor que C y B entoces comprabar que B sea mayor que C y escribir C B A
si B no es mayor que C entoces escribir B C A
-Sino si B es mayor que A y C entoces comprabar que A sea mayor que C y escribir C A B
si A no es mayor que C entoces escribir A C B
-Sino si C es mayor que A y B entoces comprabar que A sea mayor que B y escribir B A C
si A no es mayor que B entoces escribir A B C
-Sino si A y B y C son iguales escribir los numeros son iguales
*/
package tareaderepaso_5;

public class TareaDeRepaso_5 {

    public static void main(String[] args) {
        int a,b,c;
       
        a=100;
        b=5;
        c=-1;
        
        if(a==b && a==c){
            System.out.println("Los números son iguales "+a+" "+b+" "+c);
        }
        else{
            System.out.println("La serie de menor a mayor es: ");
            if(a>b && a>c){
                if(b>c){
                    System.out.println(c+" "+b+" "+a); 
                }
                else{
                    System.out.println(b+" "+c+" "+a); 
                }
            }
            else if(b>a && b>c){
                if(a>c){
                    System.out.println(c+" "+a+" "+b);
                }
                else{
                    System.out.println(a+" "+c+" "+b);
                }
            }
            else if(c>a && c>b){
                if(a>b){
                    System.out.println(b+" "+a+" "+c);
                }
                else{
                    System.out.println(a+" "+b+" "+c);
                }
            }
            
        }
    }
    
}
