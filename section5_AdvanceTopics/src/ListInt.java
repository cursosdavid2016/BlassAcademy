import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        List<Integer> list = new ArrayList<>();

        do {
            num = ScannerManager.leerInt(sc,"enter a number or -1 to exit");
            if (num != -1){
                list.add(num);
            }
        }while (num != -1);

        printList(list);

        sc.close();
    }

    static void printList(List<Integer> list){
        System.out.printf("%s%n",list);
    }

}
