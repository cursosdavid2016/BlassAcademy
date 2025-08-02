import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lista_01 {
    public static void main(String[] arg){
        final List<Integer> integer = Arrays.asList(1,2,3,4,5);
        final List<String> strings = Arrays.asList("one","two", "three");

        //fist example
        final List<Double> doubleList = new ArrayList<>();

        doubleList.add(3.5);
        doubleList.add(3.0);
        doubleList.add(2.5);

        System.out.printf("lista de dobles: %s%n",doubleList);//show list
        System.out.printf("tamañan de lista dobles %s%n", doubleList.size());//list size

        System.out.printf("value for index 2 : %.2f %n",doubleList.get(1));//specific data

        doubleList.set(1,1.0);//update specific data

        System.out.printf("value for index 2 : %.2f %n",doubleList.get(1));
        //last value of list
        System.out.printf("las value of list %.2f%n",doubleList.get(doubleList.size()-1));

        //SECOND EXAMPLE
        final List<String> nameList = Arrays.asList("one","two","three");
        int n = nameList.size();

        for (int i = 0; i < n; i++) {
            System.out.printf("index i: %d %s%n",i,nameList.get(i));
        }

        for (String element: nameList){
            System.out.printf("name: %s%n",element);
        }

        printNames(createNames());

        //3 Validate list elements
        validateElement(createNames());

        //4 is empty list
            listIsEmpty();

        //5 random lists
        final Random random = new Random();
        final List<Integer> randomIntList = RandomUtilities.generarListaIntAleatoria(5,10, 100, random);
        final List<Double> randomDoubleList = RandomUtilities.generarListaDoubleAleatoria(3,8,25,random);
    }

    //2
    static List<String> createNames(){
        return Arrays.asList("monday","tuesday","wednesday","thursday","friday");
    }

    static void printNames(List<String> list){
        for (String element: list){
            System.out.printf("day: %s%n",element);
        }
    }

    //3
    static void validateElement(List<String> list){

        if (list.contains("thursday")){
            System.out.println("thursday is part of the list");
        }else
            System.out.println("thursday it's not on the list");
    }

    //4
    static void listIsEmpty(){
        final List<Integer> numberList = Arrays.asList(1,3,5,7);
        final List<Integer> evenList = new ArrayList<>();

        for (Integer element: numberList){
            if (element % 2 == 0){
                evenList.add(element);
            }
        }


        if (evenList.isEmpty()){
            System.out.println("the list doesn´t contains any even value");
        }else
            System.out.printf("the list contains %s even numbers",evenList);
    }


}
