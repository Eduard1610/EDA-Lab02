public class invertirMatriz {
    public static void main (String[] args) {
	int[] a = { 1, 2, 3, 4, 5, 6};
	imprimirArray(a);	
	int[] aInv = invertirArray(a);
	imprimirArray(aInv);	
    }

   public static int[] invertirArray(int[] A){
    //Procedimiento para invertir la matriz
	int Ain[] = new int[A.length];	
	int j = 0;
	for (int i = A.length - 1; i >= 0; i--) {
	    Ain[j] = A[i];
	    j++;
	}
	return Ain;
    }
    

    public static void imprimirArray(int[] array) {
	System.out.print("[ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
	System.out.println("]");
    }
}
