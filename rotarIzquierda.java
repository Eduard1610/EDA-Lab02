import java.util.Scanner;

public class rotarIzquierda {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = { 1, 2, 3, 4, 5, 6};
	imprimirArray(a);

	System.out.print("Ingrese el número de rotaciones a la izquierda: ");
	int numRotaciones = sc.nextInt();

	System.out.print(numRotaciones);

	
    }
    
    /*public int[] rotarIzquierdaArray(int[] A){
	//Procedimiento para rotar la matriz
	return Aiz;
    }*/



    public static void imprimirArray(int[] array) {
	System.out.print("[ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
	System.out.println("]");
    }
}
