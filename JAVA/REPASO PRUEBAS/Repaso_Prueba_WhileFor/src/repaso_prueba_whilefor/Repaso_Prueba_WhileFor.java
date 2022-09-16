/*Multiplos en un rango
Figuras
 */
package repaso_prueba_whilefor;

/**
 *
 * @author Usuario
 */
public class Repaso_Prueba_WhileFor {

    public static void MultRango(int inicio, int fin, int num){
        int aux;
        int result;
        int cantidad;
        int suma;
        double promedio;
        suma=0;
        cantidad=0;
        
        if(fin<inicio){
            aux=fin;
            fin=inicio;
            inicio=aux;
        }
        
        while(inicio<=fin){
            cantidad++;
            result = num*inicio;
            suma=result+suma;
            System.out.println(cantidad+") "+num+"*"+inicio+"= "+result);
            inicio++;
           
        }
        promedio = (suma*1.0)/cantidad;
        System.out.println("La cantidad de numeros encontrados es: "+cantidad);
        System.out.println("La suma de los multiplos es: "+suma);
        System.out.println("El promedio es: "+promedio);
        
    }
    
    public static void Pregunta1(int n) {
        int cont;
        cont=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cont+"| ");
                cont++;
                if(cont>n)break;
            }
            if (cont>n) break;
            System.out.println("");
        }
        
    }
    
    public static void Pregunta2(int n){
        int i;
        int j;
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
        
        int aux;
        aux=n-1;
        i=1;
        while(aux>=1){
            while(j<=aux){
                System.out.print(j);
                j++;
            }
            j=1;
            aux--;
            System.out.println("");
        }
    }
    
    public static void Pregunta3(int n){
        int i;
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
            aux--;
            System.out.println("");
        }
        
        aux=n;
        i=2;
        while(i<=aux){
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
        //MultRango(7, 3, 3);
        //Pregunta1(18);
        Pregunta3(6);
    }
    
}
