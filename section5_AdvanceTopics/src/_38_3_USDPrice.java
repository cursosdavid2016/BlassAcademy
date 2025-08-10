import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _38_3_USDPrice {
    public static void main(String[] args) {
        final List<String> listaString = Arrays.asList("$125.32","$63.831","$632.7","$110.25678");
        final var cleanList = cLeanList(listaString);
        final var add = convertirList(cleanList);
        printUSD(add);
        printPEN(add);
    }


    static void printUSD(double add){
        System.out.printf("price in USD %.2f%n",add);
    }

    static void printPEN(double add){
        System.out.printf("price in PEN %.2f%n",add*3.5);
    }

    static List<String> cLeanList(List<String> listCadena){
        final List<String> listaLimpia = new ArrayList<>();

        for (String elemeto : listCadena){
            listaLimpia.add(elemeto.replace("$",""));
        }

        return listaLimpia;
    }

    static double convertirList(List<String> cleanList){
        final List<Double> doubleList = new ArrayList<>();
        final int n = cleanList.size();
        double add=0;

        for (var i = 0; i < n; i++) {
            doubleList.add(Double.parseDouble(cleanList.get(i)));
            add += doubleList.get(i);
        }
        return add;
    }


}
