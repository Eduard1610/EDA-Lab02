public class rotarIzquierda {
    public static void main (String[] args) {
	int[] a = { 1, 2, 3, 4, 5, 6};
	imprimirArray(a);	
	
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
