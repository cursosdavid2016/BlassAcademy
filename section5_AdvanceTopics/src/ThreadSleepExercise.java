import java.util.Scanner;

public class ThreadSleepExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int readValue = ScannerManager
                .leerInt(sc,"enter number (1-5)");
        showCounter(readValue);

        sc.close();
    }


    static void showCounter(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
            waiting(1);
        }
    }

    static void waiting(long i){
        try {
            Thread.sleep(i*1000);
        }catch (InterruptedException interruptedException){
            System.out.printf("InterruptedException %s%n: "
                    ,interruptedException.getLocalizedMessage());
            System.out.println("error when waiting");
        }
    }

}
