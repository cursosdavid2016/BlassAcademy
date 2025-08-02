import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1Gifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        createSet1Group();
        Set<String> setTwo = create2GroupSet(sc);
        printSet(setTwo);
    }

    static void createSet1Group(){
        HashSet<String> setGroup1 =
                new HashSet<>(Arrays.asList("bear","car","duck","robot","ball"));
        printSet(setGroup1);
    }

    static Set<String> create2GroupSet(Scanner read){

        final HashSet<String> setTwo = new HashSet<>();

        String gift;
       do {
          gift = ScannerManager.leerString(read,"enter gift or enter 'e' to exit");
            if (!gift.equals("e")){
                setTwo.add(gift);
            }
       }while (!gift.equals("e"));

        return setTwo;
    }

    static void printSet(Set<String> set){
        System.out.printf("gift set is: %s%n",set);
    }
}
