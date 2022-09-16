/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_figuras;

/**
 *
 * @author Usuario
 */
public class Repaso_figuras {

    public static void Figura1(int n){
        int cont;
        cont=1;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("|"+cont+"| ");
                cont++;
                if(cont>n)break;
            }
            if(cont>n)break;
            System.out.println("");
        }
        
    }
    
    public static void Figura2(int n){
        int i;
        int j;
        int aux;
        i=1;
        j=1;
        while(i<=n){
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j=1;
            i++;
            System.out.println("");
        }
        
        aux=n-1;
        while(aux>=1){
            while(j<=aux){
                System.out.print(j);
                j++;
            }
            j=1;
            System.out.println("");
            aux--;
        }
    }
    
    public static void Figura3(int n){
        int aux;
        int j;
        aux=n;
        j=1;
        while(aux>=1){
            while(j<=aux){
                System.out.print(j);
                j++;
            }
            j=1;
            System.out.println("");
            aux--;
        }
        
        int i;
        i=2;
        while(i<=n){
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j=1;
            i++;
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        Figura1(10);
        System.out.println("");
        Figura2(9);
        System.out.println("");
        Figura3(9);
    }
    
}
