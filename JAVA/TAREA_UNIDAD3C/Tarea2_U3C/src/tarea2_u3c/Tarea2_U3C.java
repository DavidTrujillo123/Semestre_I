/*Tarea 02:
Desmenuza el String “Programando…. Ando…” mostrándolo por pantalla carácter a carácter.
 */
package tarea2_u3c;

public class Tarea2_U3C {

    public static void main(String[] args) {
        String txt;
        txt = "Programando.... Ando...";

        for (int i = 0; i <= txt.length() - 1; i++) {
            System.out.println(txt.charAt(i));
        }

    }

}
