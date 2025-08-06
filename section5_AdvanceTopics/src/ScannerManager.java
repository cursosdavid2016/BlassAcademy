import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerManager {
    static int leerInt(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        try {
            return scanner.nextInt();
        }catch (InputMismatchException inputMismatchException){
            System.out.println("it won't allow String values");
            return -1;
        }

    }

    static double leerDouble(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);

        try {
            return scanner.nextDouble();
        }catch (InputMismatchException inputMismatchException){
            System.out.println("String values are not allowed");
            return -1;
        }
    }

    static String leerString(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextLine();
    }

    static char leerChar(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.next().charAt(0);
    }

    static boolean leerBoolean(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextBoolean();
    }
}
