/*Tarea 11.- Realizar métodos para cotizar el dólar uno en pesos colombianos y 
otro método en euros.

1 dolar = 3882.8 pesos colombianos
1 dolar = 0.87 euros

 */
package tareametodos_11;


public class TareaMetodos_11 {

    public static double pesos (double dolar){
        return (dolar * 3882.8);
    }
    
    public static double euro (double dolar){
        return (dolar * 0.87);
    }
    
    public static void main(String[] args) {
        
        int opcion;
        double conversor; 
        double cantidad; 
        String tipo;
        tipo="";
        cantidad=0;
        conversor=0;
        
        System.out.println("Bienvenido al Conversor...");
        System.out.println("_______________________________________________");
       
        System.out.println("|1) Peso Colombiano|    |2) Euro|    |3) Salir|");
        System.out.println("Elija una opcion");
        opcion = 1;
        System.out.println(opcion+"\n");
        
        if(opcion<=0 || opcion>3){
            System.out.println("Error!");
        }
        else{
            if(opcion == 1){
                tipo= "Pesos colombianos";
                cantidad = 80;
                conversor=pesos(cantidad);
            }
            else{
                if(opcion == 2){
                    tipo= "Euros";
                    cantidad = 90;
                    conversor = euro(cantidad);
                }
            }
            
            if(opcion==1 || opcion ==2){
            System.out.println("Usted eligió "+tipo);
            System.out.println("La conversion de "+cantidad+" dolares es " 
                +conversor+" "+tipo);
            }
            else{
                System.out.println("Fin del progarama...");
            }
        }    
    }
    
}
