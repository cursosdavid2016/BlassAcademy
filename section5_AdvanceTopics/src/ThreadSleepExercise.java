import java.util.Scanner;

public class ThreadSleepExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int readNumber;

        do {
            readNumber = ScannerManager
                    .leerInt(scanner,"please enter seconds (1-5) or press '0' to exit");
            if (readNumber < 6){
                showCounter(readNumber);
            }else
                System.out.println("remember range values (1-5)");
        }while (readNumber != 0);
        System.out.println("have a nice day :)");
    }

    static void waiting(long second){

        try {
            Thread.sleep(second * 1000);
        }catch (InterruptedException interruptedException){
            System.out.printf("interruptedException %s%n"
                    ,interruptedException.getLocalizedMessage());
            System.out.println("waiting error");
        }

    }

    static void showCounter(int n){

        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
            waiting(1);
        }
    }
}
