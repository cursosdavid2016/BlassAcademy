import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetEstructure {
    public static void main(String[]args){

        final HashSet<Integer> setNumbers = new HashSet<>(Arrays.asList(1,2,3,4));
        final HashSet<String> setNames = new HashSet<>(Arrays.asList("Carlos","Jorge","Rodrigo","Arturo"));

        final HashSet<Integer> setNumber = new HashSet<>();
        final HashSet<String> setString = new HashSet<>();

        // add values to set
        setNumber.add(2);
        setNumber.add(3);
        setNumber.add(4);

        System.out.printf("setNumbers %s%n",setNumber);

        printIntSet(setNumbers);
        validateElement(createSoName());
        //9 union
        setUnion();
        //10 intersection
        setIntersection();
        //11 remove elements
        setRemoveElements();

    }

    static void printIntSet(Set<Integer> setNumbers){
        for (Integer number: setNumbers){
            System.out.printf("%s%n",number);
        }
    }

    static Set<String> createSoName(){
        return new HashSet<>(Arrays.asList("Linux","Windows","MacOs"));
    }

    static void validateElement(Set<String> setSo){

        if (setSo.contains("Linux")){
            System.out.println("Linux is present in the list");
        }else
            System.out.println("Linux is not on the list");
    }

    static int addValuesSet(Set<Integer> set){
        int addSet = 0;

        for (Integer number: set){
            addSet += number;
        }
        return addSet;
    }

    static int contValueSet(Set<Integer> set){
        int cont = 0;

        for (Integer number: set){
            if (number > 30){
                cont ++;
            }
        }
        return cont;
    }

    // 9 union
    static void setUnion(){
        final var setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
        final var setB = new HashSet<>(Arrays.asList(5,6,7,8));

        setA.addAll(setB);
        System.out.println(setA);
    }


    //10 intersection
    static void setIntersection(){
        final var setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
        final var setB = new HashSet<>(Arrays.asList(5,6,7,8,9));

        setA.retainAll(setB);

        System.out.printf("the interception is: %s%n",setA);
    }

    //11 remove common elements
    static void setRemoveElements(){
        final var setA = new HashSet<>(Arrays.asList(1,2,3,4,5));
        final var setB = new HashSet<>(Arrays.asList(5,6,7,8,9));

        setA.removeAll(setB);
        System.out.printf("operation A - B is: %s%n",setA);
    }
}
