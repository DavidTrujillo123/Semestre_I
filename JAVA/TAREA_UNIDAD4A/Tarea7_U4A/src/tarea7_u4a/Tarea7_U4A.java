/*Tarea 07.-
Dado un arreglo A de n números enteros, se pide obtener los arreglos B y C a partir del arreglo 
A. En el arreglo B se deben poner los números pares y en el arreglo C se deben poner los 
números impares. 
int [ ] A = { 2, 8, 15, 3, 22, 14, 5, 6, 7}; 
int [ ] B = { 2, 8, 22, 14, 6}; 
int [ ] C = {15, 3, 5, 7};
 */
package tarea7_u4a;

public class Tarea7_U4A {

    public static void main(String[] args) {
        
        int contPar=0;
	int contImpar = 0;
	int[] A = { 2, 8, 15, 3, 22, 14, 5, 6, 7 };
			
	for (int i=0; i< A.length; i++) {
            if (A[i] % 2 == 0) contPar++;
            else contImpar++;
	}

	int[] B = new int[contPar];
	int[] C = new int[contImpar];

	contImpar = 0;
	contPar = 0;
	for (int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0)
            {
		B[contPar] = A[i];
		contPar++;
            }
            else
            {
                C[contImpar] = A[i];
		contImpar++;
            }
	}

	System.out.print("Arreglo A\n");
	for(int i : A)
	{
            System.out.print(i+" ");
	}
	System.out.println("");

	System.out.print("Arreglo B\n");
	for(int i : B) {
            System.out.print(i+" ");
	}
	System.out.println("");

	System.out.print("Arreglo C\n");
	for (int i : C)
        {
            System.out.print(i+" ");
	}
        System.out.println("");
    }
}
