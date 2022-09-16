/*Tarea 11 - Realizar una aplicación que realice un menú que contenga todas las opciones para 
realizar los ejercicios anteriores y que incluya una opción del tipo “Desea Salir (S/N)” y 
el programa no termine hasta que el usuario teclee ‘S’ o ‘s’.
 */
package tarea11_u3b;

import java.util.Scanner;

public class Tarea11_U3B {

    public static int SumaRango(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio<=fin){
            suma = suma + inicio;
            inicio ++;
        }
        return suma;
    }
    
    public static int SumaPares(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        if(inicio % 2 != 0){
            inicio++;
        }
        
        while(inicio<=fin){
            suma = suma + inicio;
            inicio +=2;
        }
        return suma;
    }
    
    static int SumaImpar(int inicio, int fin){
        int aux;
        int suma;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        if(inicio % 2 == 0){
            inicio++;
        }
        
        while(inicio<=fin){
            suma = suma + inicio;
            inicio +=2;
        }
        return suma;
    }
    
    public static int SumaMult(int inicio, int fin, int num){
        int aux;
        int suma;
        int result;
        suma = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio<=fin){
            result= inicio%num;
            if(result==0) suma =inicio+suma;
            inicio++;
        }
        return suma;
    }
    
    public static int CantidadMult(int inicio,int fin, int num){
        int aux;
        int cont;
        int result;
        cont = 0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio <= fin){
            result= inicio%num;
            if(result==0) cont++;
            inicio++;
        }
        return cont;
    }
    
    public static double PromedioMult(int inicio, int fin, int num){
        int aux;
        int suma;
        int result;
        int cont;
        double promedio;
        suma = 0;
        cont=0;
        if(fin < inicio){
            aux = fin;
            fin = inicio;
            inicio = aux;
        }
        
        while(inicio<=fin){
            result=inicio%num;
            if(result==0){
                cont++;
                suma = inicio+suma;
            }
            inicio ++;
        }
        promedio = suma/cont;
        return promedio;
    }
    
    public static void Pitagorica(int limite){
        
        System.out.print("x  |  ");
        for(int i=1; i<=limite; i++){
            System.out.print(i+"  |  ");
        }
        
        System.out.println("");
        
        for(int i=1; i<=limite; i++){
            for (int j = 1; j <= limite; j++) {
                System.out.print(""+i*j+"  |  ");
                if(j==1) System.out.print(""+i*j+"  |  ");
            }
            System.out.println("");
        }
    }
    
    public static double Promedio() {
        Scanner entrada = new Scanner (System.in);
        boolean opcion;
        double suma;
        int cont;
        double num;
        opcion=true;
        suma=0;
        cont=0;
        do{
            cont++;
            System.out.print(cont+".- "+"Ingrese un número: ");
            num = entrada.nextDouble();
            
            if(num==0){
                opcion = false;
                cont--;
                //break;
            }
            suma=num+suma;
           
         
        }while(opcion);
        return suma/cont;
    }
    
    public static String Binario(int n){
        String numBinario;
        String concatBinario = "";
        int div;
        int resto, aux;
        boolean condicion;
        condicion = true;
        aux = n;
        while (condicion) {
            resto = aux % 2;
            div = (aux) / 2;
            aux = div;

            numBinario = String.valueOf(resto);//modulo en string
            concatBinario = numBinario + concatBinario;//concatenacion de modulos
 
            if (div < 1) {
                condicion = false;
            }
        }
        return concatBinario;
       
    } 
    
    public static double Entero(String num) {
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
        Scanner entrada = new Scanner(System.in);
        boolean condicion,condicion1;
        char salida;
        int opcion;
        int inicio,fin,num;
        condicion = true;
        condicion1=true;
        do{
           System.out.println("Escoja una opcion:\n"
                    + "1)SUMA DE NÚMEROS EN UN RANGO\n"
                   + "2)SUMA DE NÚMEROS PARES EN UN RANGO\n"
                   + "3)SUMA DE NÚMEROS IMPARES EN UN RANGO\n"
                   + "4)SUMA DE MULTIPLOS EN UN RANGO\n"
                   + "5)CANTIDAD DE MULTIPLOS EN UN RANGO\n"
                   + "6)PROMEDIO DE MULTIPLOS EN UN RANGO\n"
                   + "7)TABLA PITAGORICA\n"
                   + "8)PROMEDIO X NUMEROS\n"
                   + "9)ENTERO A BINARIO\n"
                   + "10)BINARIO A ENTERO\n"
                   + "11)SALIR");
           
            opcion = entrada.nextInt();
            
            if(opcion==1){
                System.out.println("Escogió SUMA RANGO");
                System.out.println("Digite un inicio");
                inicio = entrada.nextInt();
                
                System.out.println("Digite un fin");
                fin = entrada.nextInt();
                System.out.println("La suma de todos los números en el rango "+inicio+" a "+fin+" es "+SumaRango(inicio, fin));
            }
            else if(opcion==2){
                System.out.println("Escogió SUMA DE NUMEROS PARES EN UN RANGO");
                System.out.println("Digite un inicio");
                inicio = entrada.nextInt();
                
                System.out.println("Digite un fin");
                fin = entrada.nextInt();
                System.out.println("La suma de todos los números pares en el rango "+inicio+" a "+fin+" es "+SumaPares(inicio, fin));
            }
            else if(opcion==3){
                System.out.println("Escogió SUMA DE NUMEROS PARES EN UN RANGO");
                System.out.println("Digite un inicio");
                inicio = entrada.nextInt();
                
                System.out.println("Digite un fin");
                fin = entrada.nextInt();
                System.out.println("La suma de todos los números pares en el rango "+inicio+" a "+fin+" es "+SumaPares(inicio, fin));
            }
            
            else if(opcion==4){
                System.out.println("Escogió SUMA DE MULTIPLOS EN UN RANGO");
                System.out.println("Digite un inicio");
                inicio = entrada.nextInt();
                
                System.out.println("Digite un fin");
                fin = entrada.nextInt();
                
                System.out.println("Digite un número");
                num=entrada.nextInt();
                System.out.println("La suma de todos los números múltiplos de "+num+" en el rango "+inicio+" a "+fin+" es "+SumaMult(inicio, fin,num));
            }
            
            else if(opcion==5){
                System.out.println("Escogió CANTIDAD DE MULTIPLOS EN UN RANGO");
                System.out.println("Digite un inicio");
                inicio = entrada.nextInt();
                
                System.out.println("Digite un fin");
                fin = entrada.nextInt();
                
                System.out.println("Digite un número");
                num=entrada.nextInt();
                System.out.println("La cantidad de múltiplos de "+num+" en el rango "+inicio+" a "+fin+" es "+CantidadMult(inicio, fin,num));
            }
            
            else if(opcion==6){
                System.out.println("Escogió PROMEDIO DE MULTIPLOS EN UN RANGO");
                System.out.println("Digite un inicio");
                inicio = entrada.nextInt();
                
                System.out.println("Digite un fin");
                fin = entrada.nextInt();
                
                System.out.println("Digite un número");
                num=entrada.nextInt();
                System.out.println("El promedio de todos los múltiplos de "+num+" en el rango "+inicio+" a "+fin+" es "+PromedioMult(inicio, fin,num));
            }
            
            else if(opcion==7){
                System.out.println("Escogió TABLA PITAGORICA");
                System.out.println("Digite un limite");
                num = entrada.nextInt();
                
                System.out.println("Tabla Pitagorica hasta "+num);
                Pitagorica(num);
            }
            
            else if(opcion==8){
                System.out.println("Escogió PROMEDIO X NUMEROS");
                System.out.println("Digite cero para salir de PROMEDIO X NUMEROS");
                System.out.println(Promedio());
            }
            
            else if(opcion==9){
                System.out.println("Escogió ENTERO A BINARIO");
                System.out.println("Digite un número entero");
                num = entrada.nextInt();
                
                System.out.println("Entero-->"+num);
                System.out.println("Binario-->"+Binario(num));
            }
            
            else if(opcion==10){
                String binario;
                System.out.println("Escogió BINARIO A ENTERO");
                System.out.println("Digite un número binario");
                binario = entrada.next();
                
                System.out.println("Binario-->"+binario);
                System.out.println("Entero-->"+Entero(binario));
            }
            
            else if(opcion==11) break;
            else System.out.println("Error!");
            
           do{//salir 
                System.out.println("Desea salir (S/N)");
                salida = entrada.next().charAt(0);
                salida = Character.toLowerCase(salida);

                if(salida=='s'){
                    condicion=false;
                    break; 
                }
                else if(salida == 'n') break;
                else System.out.println("Error! Digite S o N");
           }while(condicion1);
            
        }while(condicion);
        
    }
    
}
