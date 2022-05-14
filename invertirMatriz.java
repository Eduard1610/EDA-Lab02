public class invertirMatriz {
    public static void main (String[] args) {
	int[] a = { 1, 2, 3};
	imprimirArray(a);	
    }

   //public static int[] invertirArray(int[] A){
    //Procedimiento para invertir la matriz
		
	//return 0;
    

    public static void imprimirArray(int[] array) {
	System.out.print("[ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
	System.out.println("]");
    }
}
