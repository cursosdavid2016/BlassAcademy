import java.util.HashMap;
import java.util.Map;

public class MapsEstructura {

    public static void main(String[] args) {
        final Map<Integer,String> valuesMap = addValuesMap();
        printMap(valuesMap);
        validateElemen(valuesMap);

        iterateMap(valuesMap);
    }

    static void mapsExample(){

        final var nameMap = Map.of(
                "one",1000,
                "two", 3000,
                "four",4000
        );

        final var namesMap = new HashMap<String,Integer>();
        final var numbersMap = new HashMap<Integer,Double>();
    }

    static Map<Integer,String> addValuesMap(){

        final var soMaps = new HashMap<Integer,String>();

        soMaps.put(1,"xbox");
        soMaps.put(2,"pc");
        return soMaps;
    }

    static void validateElemen(Map<Integer,String> map){

        if (map.containsKey(2)){
            System.out.println("the element with key 2 is on the map");
        }else
            System.out.println("the element with key 2 is not on the map");

        if (map.containsValue("xbox")){
            System.out.println("the map contains value xbox");
        }else
            System.out.println("the map doesn't contain value xbox");
    }

    static void printMap(Map<Integer,String> map){
        System.out.printf("map is: %s%n",map);
        System.out.printf("for the key 1 the value is %s%n",map.get(1));
    }

    static void iterateMap(Map<Integer,String> map){

        for (Map.Entry<Integer,String> par: map.entrySet()){
            System.out.printf("key: %d, value: %s%n", par.getKey(),par.getValue());
        }

    }
}
