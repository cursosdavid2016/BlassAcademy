import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BubbleSortList {
    public static void main(String[] args) {

        final List<Integer> unOrderList = createList();
        showList(unOrderList);

        final List<Integer> orderList = bubbleSort(unOrderList);
        showList(orderList);
    }

    static List<Integer> createList(){
        //return Arrays.asList(4,2,5,6);
        return RandomUtilities.generarListaIntAleatoria(30,10,500, new Random());
    }

    static List<Integer> bubbleSort(List<Integer> list ) {

        final int n = list.size();
        int aux = 0;

            for (int j = 0; j < n - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    aux = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, aux);
                }
            }

        return list;
    }

    static void showList(List<Integer> list){
        System.out.printf("list: %s%n",list);
    }
}
