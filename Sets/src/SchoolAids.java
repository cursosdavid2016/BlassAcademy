import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SchoolAids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> setA = createFirstUtils();
        printSet(setA);
        Set<String> setB = createSecondUtils(sc);
        printSet(setB);

        setA.removeAll(setB);
        printSet(setA);
    }

    static Set<String> createFirstUtils(){
        return new HashSet<>(Arrays.asList("pencil","eraser","lunch box","bagpack","checker","cap","scissors"));
    }

    static Set<String> createSecondUtils(Scanner sc){
        final Set<String> set = new HashSet<>();
        String schoolAid;

        do {
            schoolAid = ScannerManager.leerString(sc,"enter a school aid");
            if (!schoolAid.equals("e")){
                set.add(schoolAid);
            }
        }while (!schoolAid.equals("e"));

        return set;
    }

    static void printSet(Set<String> set){
        System.out.printf("the missing schoolAids are: %s%n",set);
    }
}
