/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Repaso {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int estudiantes = 5;
        double[] notas = new double[estudiantes];
        int aux = 1;
        int j = 0;
        int nota1 , nota2;
        nota1 = 0;
        nota2 = 0;
        double promedio = 0;
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante "+(i+1));
            while(aux<=2){
                System.out.print("Nota "+aux+": ");
                aux++;
                nota1=entrada.nextInt();
                System.out.print("Nota "+aux+": ");
                aux++;
                nota2 = entrada.nextInt();
                j++;
            }
            promedio = (nota1+nota2)*1.0/2;
            notas[i] = promedio; 
            aux = 1;
        }
        
        for (int i = 0; i < estudiantes; i++) {
            System.out.println(notas[i]);
            //System.out.println("");
        }
    }
    
}
