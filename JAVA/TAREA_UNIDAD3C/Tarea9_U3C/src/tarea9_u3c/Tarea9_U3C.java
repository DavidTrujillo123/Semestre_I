/*Sobre la cadena de texto “Le ezefete Ene bejebe cede meñene e le mer selede pere lever le felde
enerenjede”, sustituye/reemplaza todas las vocales e por la vocal a y mire su resultado.
 */
package tarea9_u3c;


public class Tarea9_U3C {

    public static void main(String[] args) {
        String txt;
        txt="Le ezefete Ene bejebe cede meñene e le mer selede pere lever le felde enerenjede";
        
        txt= txt.replace("e", "a");
        txt = txt.replace("E", "A");
        
        System.out.println(txt);
    }
}
