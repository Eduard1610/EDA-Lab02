import java.util.Scanner;

public class rotarIzquierda {
    static int numRotaciones; 
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = { 1, 2, 3, 4, 5, 6};
	imprimirArray(a);

	System.out.print("Ingrese el número de rotaciones a la izquierda: ");
	numRotaciones = sc.nextInt();
	rotar1Izquierda(a);
	
    }
    
    /*public int[] rotarIzquierdaArray(int[] A){
	//Procedimiento para rotar la matriz
	return Aiz;
    }*/

    public static int[] rotar1Izquierda(int[] A){
	//Procedimiento para clonar la matriz A en Aiz
	int[] Aiz = new int[A.length]; 
	for(int i = 0; i < A.length; i++) {
	    Aiz[i] = A[i];
	}
	imprimirArray(Aiz);

	//Procedimiento para rotar la matriz 1 posición izquierda
	int primero = Aiz[0];
	for (int i = 0; i < Aiz.length - 1; i++) {
	    Aiz[i] = Aiz[i+1];
	}
	Aiz[Aiz.length - 1] = primero;
	return Aiz;
    }


    public static void imprimirArray(int[] array) {
	System.out.print("[ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
	System.out.println("]");
    }
}
