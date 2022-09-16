/*Tarea 15.- Realizar una aplicación que me permita decrementar un día a una fecha en formato 
día-mes-año e imprimir el resultado

fecha inicial                   fecha final
01/01/2000          -1 dia      31/12/1999   

Tienen 31 días: enero(1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10) y diciembre(12).
Tienen 30 días: abril(4), junio(6), septiembre(9) y noviembre(11).
Tiene 29 días: febrero(2) (si el año es bisiesto).
Tiene 28 días: febrero(2) (si el año no es bisiesto).
 */
package tareametodos_15;


public class TareaMetodos_15 {

    //AÑOS BISIESTOS O NO
    public static boolean añobisiesto (int año){
        
        boolean bisiesto;
        
        bisiesto= true;
        if(año % 4 == 0){
            if(año % 100 == 0){
                if(año % 400 == 0){
                    
                }
                else{ 
                    bisiesto = false;
                }
            }
            else{
                
            }
        }
        else{
            bisiesto = false;  
        }
        
        return (bisiesto);
    }
     
    //DIAS EN LOS DIFERENTES MESES Y AÑOS
    public static int dia (int dia, int mes, int año){
        
        dia= dia-1;
        if(mes == 3 && añobisiesto(año)==true){
            if(dia<1){
                dia=29;
            }
        }
        else if (mes ==3 && añobisiesto(año)==false){
            if(dia<1){
                dia=28;
            }
        }else if(mes==5 || mes==7 || mes==10 || mes==12){
            if(dia<1){
                dia=30;
            }
        }
        else{
            if(dia<1){
                dia=31;
                
            }
        }
        
        return dia;
    }
    
    //PARA REGRSAR DE MES
    public static int mes (int dia, int mes, int año){
        
        dia=dia-1;
        if(dia<1){
            mes= mes - 1;
                if(mes<1){
                    mes=12;
                }
        }
        
        return mes;
   }
    
    //PARA PASAR EL AÑO
    public static int año (int dia, int mes, int año){
        dia=dia-1;
        if(dia<1){
           mes=mes-1;
        }
        if(mes<1){
            año=año-1;
        }
        
       return año;
    }
    
    public static void main(String[] args) {
        
        int dia,diat;
        int mes, mest;
        int año, añot ;
        
        dia=1;
        mes=1;
        año=2000;
        
        if(año<=0 || mes<=0 || mes>12 || dia<0 || dia>31){
            System.out.println("Error!");
        }
        else{    
            diat=dia(dia,mes,año);
            mest=mes(dia,mes,año);
            añot= año(dia,mes,año);
        
            System.out.println("Formato - DD/MM/AA");
            System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
            System.out.println("La fecha menos un dia es: "+diat+"/"+mest+"/"+añot);        
        }  
        
    }
    
}
