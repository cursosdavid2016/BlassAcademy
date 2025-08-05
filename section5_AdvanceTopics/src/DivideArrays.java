import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DivideArrays {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] array1 = RandomUtilities.generarRandomArrayInt(15,0,6,random);
        int[] array2 = RandomUtilities.generarRandomArrayInt(15,0,6,random);

        printArray(array1);
        printArray(array2);

        printArray(divideArrays(array1,array2));

        sc.close();
    }

    static void printArray(int[] array){
        System.out.printf("%s%n", Arrays.toString(array));
    }

    static int[] divideArrays(int []a,int[]b){
        int n = a.length;
        int[] div = new int[n];

        for (var i = 0; i < n; i++) {
            int cociente;
            try {
                cociente = a[i]/b[i];
                //System.out.printf("sucess divide: %d%n",div);
            }catch (ArithmeticException arithmeticException) {
                cociente = -1;
                //System.err.printf("ArithmeticException %s%n",arithmeticException.getLocalizedMessage());
                //System.out.println(" divide by Zero it not allowed");
            }
            div[i] = cociente;
        }
        return div;
    }

}
