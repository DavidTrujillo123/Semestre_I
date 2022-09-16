/* Tarea de repaso 17 -  Que lea un importe bruto y calcule su importe neto, 
si es mayor de 15.000 se le aplicará un 16% de impuestos, en caso contrario se 
le aplicará un 10%
 */
package tareaderepaso_17;


public class TareaDeRepaso_17 {

    
    public static void main(String[] args) {
        
        double importeBruto, importeNeto;
        
        //System.out.println("Digite el importe bruto");
        
        importeBruto=16000.56;
        
        if( importeBruto>15000){
            importeNeto= importeBruto*1.16;
            System.out.println("Su impuesto es de 16% y el importe neto es "+String.format("%.2f", importeNeto)+" $");
        }
        else{
            importeNeto= importeBruto*1.1;
            System.out.println("Su impuesto es del 10% y el importe neto es:"+String.format("%.2f", importeNeto)+" $");
        }
    }
    
}
