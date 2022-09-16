/*.
 */
package ejerciciosclase_5;


public class EjerciciosClase_5 {

    static String Pago(double compra, int tipoPago){
        
        double total;
        int descuento;
        String pago;
        pago="";
        descuento=0;
        total=0;
        
        if(tipoPago==1){
                pago="al Contado con descuento";
                descuento=5;
                total= compra*0.95;
            }
            else if(tipoPago==2){
                pago="con Tarjeta con recargo";
                descuento=3;    //recargo
                total= compra*1.03;
            }
          
        return ("Usted eligió pagar "+pago+" "+descuento+"% y el total a pagar es "+total+"$" );
        
    }
    
    public static void main(String[] args) {
       
        int tipoPago;
        double compra;
        
        compra=100;
        tipoPago=2;
        
        if(tipoPago<=0 || tipoPago>2) System.out.println("Error!");
        else{
            System.out.println("Su precio inicial es de: "+compra+"$");
            System.out.println(Pago(compra, tipoPago));
        }
        
    }
}
