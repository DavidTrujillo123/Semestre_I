/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_prueba_ifvectores;

/**
 *
 * @author Usuario
 */
public class Repaso_Prueba_IfVectores {

    public static int Cuadrante(double x1, double y1){
        if(x1 > 0 && y1 > 0 ) return 1;
        else if (x1 < 0 && y1 > 0) return 2;
        else if(x1 < 0 && y1 < 0) return 3;
        else if (x1 > 0 && y1 <0) return 4;
        else return 0;
    }
    
    public static boolean Ortogonales(double x1, double y1, double x2, double y2){
        double result;
        result = (x1*x2)+(y1*y2);   //si es cero es ortogonal
        
        if(result == 0) return true;
        else return false;
    }
    public static boolean Paralelos(double x1, double y1, double x2, double y2){
       double result; 
       result = (x1/x2) - (y1/y2);
       
       if(result == 0) return true;
       else return false;
    } 
    
    public static void main(String[] args) {
        int x1,y1;
        x1=1;
        y1=0;
        System.out.println("El vector "+x1+","+y1+" esta en el cuadrante "+Cuadrante(x1,y1)); 
        
        int x2,y2;
        x2=0;
        y2=2;
        
        if(Ortogonales(x1,y1,x2,y2)==true) System.out.println("Es ortogonal");
        else System.out.println("No es ortogonal");
        
        if(Paralelos(x1,y1,x2,y2)==true ) System.out.println("Es paralelo");
        else System.out.println("No es parelelo");
    }
    
}
