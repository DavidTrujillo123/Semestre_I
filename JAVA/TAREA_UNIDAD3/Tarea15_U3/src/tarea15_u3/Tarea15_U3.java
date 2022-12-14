/*Tarea 15.- Realizar una aplicación que me permita resolver la función exponencial 
mediante las Series de Taylor

e^x = x^0/0! + x^1/1! + x^2/2! ......
e^2 = 2^0/0! + 2^1/1! + 2^2/2! ......        
 */
package tarea15_u3;


public class Tarea15_U3 {

    public static double Potencia(double basse, double exponente) {
        double result;
        result = 1;
        //for
        for (int i = 1; i <= exponente; i++) {
            result = result * basse;
        }
        return result;
    }

    public static double Factorial(double num) {
        //while
        double a;
        double fac1;
        fac1 = 1;
        a = 1;
        while (a <= num) {
            fac1 = fac1 * a;
            a++;
        }
        return fac1;
    }
    
    public static void main(String[] args) {
        double n;
        double x;
        double result;
        double suma;
        
        x=1;
        
        suma=0;
        n=30;
        
        /*for(int i = 0; i <= n ; i++){
            result = (Potencia(x,i))/(Factorial(i));
            suma = suma+ result;
        }
        System.out.println("e^"+x+" = "+suma);
        */
        
        int i;
        i=0;
        while(i <= n){
            result = (Potencia(x,i))/(Factorial(i));
            i++;
            suma = suma+ result;
        }
        System.out.println("e^"+x+" = "+suma);
        
    }
    
}
