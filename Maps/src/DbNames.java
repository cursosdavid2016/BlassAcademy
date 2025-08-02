import java.util.Map;
import java.util.Scanner;

public class DbNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("enter ID(1-6) or (-1) to exit ");
            value = scanner.nextInt();
            if (value > 0 && value < 7){
                showUser(value,createDb());
            }else
                System.out.println("value does not exit on the map");
        }while (value != -1);
    }

    static Map<Integer,String> createDb(){
        final var Db = Map.of(
                1,"Cocox",
                2,"Socrates",
                3,"Calvario",
                4,"Kitty",
                5,"JavajavaDu",
                6,"Rexxes"
        );

        return Db;
    }

    static void showUser(int key, Map<Integer,String> map){
        System.out.printf("value %s%n",map.get(key));
    }


}
