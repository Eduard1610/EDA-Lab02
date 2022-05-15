import java.util.*;
public class TrianguloRecursivo {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese el numero de '*' para la base: ");
        dibujarTriangulo(scan.nextInt());
    }
    public static void dibujarTriangulo(int n){
        if (n == 1)
            System.out.println("*");
        else if (n > 1){
            dibujarTriangulo(n-1);
            int i = 0;
            while(i < n){
                System.out.print("*");
                i++;
            }
            System.out.println();
        }
    }
}
