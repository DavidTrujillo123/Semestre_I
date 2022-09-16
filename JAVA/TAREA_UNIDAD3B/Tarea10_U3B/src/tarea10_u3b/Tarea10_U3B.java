/*Tarea 10 - Realizar un método que realice la transformación de números binarios 
a enteros y retorne el resultado.
 */
package tarea10_u3b;

public class Tarea10_U3B {

    public static double Decimal(String num) {
        int i;
        int aux;
        double result, suma;
        i = 0;
        suma = 0;
        char digitos;

        for (int j = num.length() - 1; j >= 0; j--) {
            digitos = num.charAt(j);
            aux = Character.getNumericValue(digitos);
            result = aux * (Math.pow(2, i));
            suma = result + suma;
            i++;
        }

        return suma;
    }

    public static void main(String[] args) {
        String num;
        num = "1110";
        System.out.println("Binario-->" + num);
        System.out.println("Decimal-->" + Decimal(num));
    }

}
