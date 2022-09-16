/*Tarea 14 - Realizar una aplicación que me permita incrementar un día a una fecha en formato 
día-mes-año e imprimir el resultado

ejemplo:            
31/12/2021   +1dia = 01/01/2022 

Tienen 31 días: enero(1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10) y diciembre(12).
Tienen 30 días: abril(4), junio(6), septiembre(9) y noviembre(11).
Tiene 29 días: febrero(2) (si el año es bisiesto).
Tiene 28 días: febrero(2) (si el año no es bisiesto).        
 */
package tareametodos_14;


public class TareaMetodos_14 {

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
        
        dia= dia+1;
        if(mes ==2 && añobisiesto(año)==true){
            if(dia>29){
                dia=1;
            }
        }
        else if (mes ==2 && añobisiesto(año)==false){
            if(dia>28){
                dia=1;
            }
        }else if(mes==4 || mes==6 || mes==9 || mes==11){
            if(dia>30){
                dia=1;
            }
        }
        else{
            if(dia>31){
                dia=1;
            }
        }
        
        return dia;
    }
    
    //PARA PASAR DE MES
    public static int mes (int dia, int mes, int año){
        
        dia=dia+1;
        if(mes ==2 && añobisiesto(año)==true){
            if(dia>29){
                mes= mes + 1;
            }
        }
        else if (mes == 2 && añobisiesto(año)==false){
            if(dia>28){
                mes= mes +1;
            }
        }else if(mes==4 || mes==6 || mes==9 || mes==11){
            if(dia>30){
                mes= mes +1;
            }
        }
        else{
            if(dia>31){
                mes= mes+ 1;
                if(mes>12){
                    mes=1;
                }
            }
        }
        
        return mes;
       
   }
    
    //PARA PASAR EL AÑO
    public static int año (int dia, int mes, int año){
        dia=dia+1;
        if(dia>31){
           mes=mes+1;
        }
        if(mes>12){
           // mes=1;
            año=año+1;
        }
       return año;
    }
   
    public static void main(String[] args) {
        int dia,diat;
        int mes, mest;
        int año, añot ;
        
        dia=31;
        mes=12;
        año=2021;
        
        if(año<=0 || mes<=0 || mes>12 || dia<0 || dia>31){
            System.out.println("Error!");
        }
        else{    
        diat=dia(dia,mes,año);
        mest=mes(dia,mes,año);
        añot= año(dia,mes,año);
        
        System.out.println("Formato - DD/MM/AA");
        System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
        System.out.println("La fecha mas un dia es: "+diat+"/"+mest+"/"+añot);        
        }  
    }
  
}