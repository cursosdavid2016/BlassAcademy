import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SampleExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int [] array = createArray();
        do {

            printArray(array);
            System.out.println("enter index between (0-4)");
            n = sc.nextInt();
            if (n!=-1){
                System.out.printf("index: %d , value: %d%n",n,array[n]);
            }
        }while (n!=-1);

    }

    static int[] createArray(){
       return RandomUtilities.generarRandomArrayInt(5,10,100,new Random());
    }

    static void printArray(int[] array){
        System.out.printf("%s%n", Arrays.toString(array));
    }

}
