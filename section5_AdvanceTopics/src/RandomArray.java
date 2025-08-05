import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int readIndex;
        int [] array = createArray();
        do {
            printArray(array);
            readIndex = ScannerManager.leerInt(sc,"enter index");
            if (readIndex!=-1){
                printIndex(readIndex,array);
            }
        }while (readIndex!=-1);

        sc.close();
    }

    static int[] createArray(){
       return RandomUtilities.generarRandomArrayInt(5,10,100,new Random());
    }

    static void printArray(int[] array){
        System.out.printf("%s%n", Arrays.toString(array));
    }

    static void printIndex(int i, int[] array){
        try {
            final var element = array[i];
            System.out.printf("element with index: %d, value: %d%n",i,element);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.err.printf("IndexOutOfBoundsException %s%n",
                    indexOutOfBoundsException.getLocalizedMessage());
            System.out.println("Out of range");
        }

    }
}
