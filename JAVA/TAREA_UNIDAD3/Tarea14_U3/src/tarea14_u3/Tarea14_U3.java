/* Tarea 14.- Realizar una aplicación que me imprima las tablas de multiplicar de un rango 
especificado para el número de la tabla (ejemplo tabla de 3 al 7) y un rango para los 
multiplicadores de cada tabla.

tabla_inicio = 3		tabla_fin = 7
mul_inicio = 2                  mul_fin = 6

3  4  5  6  7
*  *  *  *  *
2  3  4  5  6
=  =  =  =  =
6 12 20 30 42
 */
package tarea14_u3;


public class Tarea14_U3 {

    
    public static void main(String[] args) {
        int inicio_tabla;
        int fin_tabla;
        int inicio_mul;
        int fin_mul;
        int aux_tabla, aux_mul;
        
        inicio_tabla = 5;
        fin_tabla = 7;
        
        inicio_mul = 3;
        fin_mul = 5;
        
        if(fin_tabla < inicio_tabla){
            aux_tabla = fin_tabla;
            fin_tabla = inicio_tabla;
            inicio_tabla =aux_tabla;
        }
        
        if(fin_mul < inicio_mul){
            aux_mul = fin_mul;
            fin_mul = inicio_mul;
            inicio_mul =aux_mul;
        }
        
        /*for(int i = inicio_tabla ; i<= fin_tabla ; i++){
            System.out.println("Tabla del "+i);
            for(int a = inicio_mul ; a<= fin_mul ; a++){             
                System.out.println(i+"*"+a+"="+(i*a));
            }
            System.out.println("");
        }
        */
        
        int i;
        int cont;
        i = inicio_tabla;
        cont = inicio_mul;
       
        while(i <= fin_tabla){
            System.out.println("Tabla del "+i);
            while(cont <= fin_mul){
                System.out.println(i+"*"+cont+"="+(i*cont));
                cont++;
            }
            cont = inicio_mul;
            i++;
            System.out.println("");
        }
    }
}
