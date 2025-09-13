
import java.util.Map;
import java.util.Scanner;

public class StoreMap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final var itemMap = itemMap();
        System.out.printf("total: %.2f", calPrice(itemMap,sc));
    }

    static Map<String,Double> itemMap(){
        final var items = Map.of(
                "Robot",15.21,
                "Ball",23.12,
                "Car",11.68,
                "Bear",5.84,
                "deck",9.99,
                "drum",43.12
        );
        return items;
    }

    static double calPrice(Map<String,Double> map, Scanner sc){
        double collect=0;
        String item;
        do {
            System.out.println(map);
            System.out.println("select item or enter 's' to exit");
            item = sc.nextLine();
            if (!item.equals("s")){
                collect += map.get(item);
            }
        }while (!item.equals("s"));

        return collect;
    }

}
