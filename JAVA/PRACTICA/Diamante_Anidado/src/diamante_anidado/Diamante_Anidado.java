/*
 */
package diamante_anidado;


public class Diamante_Anidado {

    public static void Diamante(int nivel, int rep) {
        int i;
        int j;
        int k;
        int aux, aux2, aux3;
        
        i = 1;
        j = 1;
        k = 1;
        aux = nivel - 1;
        aux2 = 1;
        aux3 = 2 * nivel - 3;

        //ARRIBA
        while (j <= nivel) {//niveles
            while (k <= aux) { //espacio lado izquierdo     
                System.out.print("*");
                k++;
            }
            k = 1;
            aux--;

            while (i <= rep) {//repeticiones
                while (k <= aux2) {// a
                    System.out.print("a");
                    if (aux2 != 1 && aux2 == nivel * 2 - 1) {
                        aux2--;
                    }
                    k++;
                }
                k = 1;

                while (k <= aux3) {//espacios lado derecho
                    System.out.print(" ");
                    k++;
                }
                k = 1;
                i++;
               // cont++;
            }
            
            i = 1;
            aux2 += 2;
            aux3 -= 2;

            if (nivel == j) {
                System.out.print("a");//a del ultimo nivel
            }
            
            j++;
            System.out.println("");//salto de linea

        }

        //ABAJO
        j = 1;
        aux = 1;
        aux2 = 1;
        aux3 = 2 * nivel - 3;
        while (j <= nivel - 1) {//niveles
            while (k <= aux2) {//espacios lado izquierdo
                System.out.print("*");
                k++;
            }
            k = 1;
            aux2++;

            while (i <= rep) {
                while (aux3 >= k) {//a
                    System.out.print("a");
                    k++;
                }
                k = 1;
                
                while (k <= aux) {//espacios lado derecho
                    System.out.print(" ");
                    k++;
                }
                k = 1;
                i++;
            }
            i = 1;
            aux += 2;
            aux3 -= 2;

            j++;
            System.out.println("");//salto de linea
        }

    }

    public static void main(String[] args) {
        Diamante(5, 5);
        Diamante(5, 5);
        Diamante(5, 5);
    }

}
