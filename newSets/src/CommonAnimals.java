import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonAnimals {
    public static void main(String[] args) {
        Set<String> setA = friendAnimals();
        printCommon(setA);
        Set<String> setB = yourAnimals(new Scanner(System.in));
        printCommon(setB);
        setA.retainAll(setB);
        printCommon(setA);
    }

    static Set<String> friendAnimals(){
        return new HashSet<>(Arrays.asList("bear","gorilla","zebra","lion","panter"));
    }

    static Set<String> yourAnimals(Scanner sc){
        final HashSet<String> set = new HashSet<>();
        String animal;
        do {
            animal = ScannerManager.leerString(sc,"enter animal name or 'e' to exit");
            if (!animal.equals("e")){
                set.add(animal);
            }
        }while (!animal.equals("e"));

        return set;
    }

    static void printCommon(Set<String> commonAnimals){
        System.out.printf("common animal are: %s%n", commonAnimals);
    }
}
