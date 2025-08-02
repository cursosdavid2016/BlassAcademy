import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ImcList {
    public static void main(String[] args){

        // final String[] nameArray = {"Carlos","Antonio","Jorge","Ana","Mayra","Julieta","Maria","Rodrigo","Anabel","Luz"};
        // final double[] randomDouble = RandomUtilities.generarRandomArrayDouble(10,1,50, new Random());

        final List<String> alto = new ArrayList<>();
        final List<String> medio = new ArrayList<>();
        final List<String> bajo = new ArrayList<>();

        final String[] arrayNames = createNames();
        final double[] arrayImc = createImc();

        fillInList(alto,medio,bajo,arrayNames,arrayImc);

        System.out.printf("alto: %s%n",alto);
        System.out.printf("medio: %s%n",medio);
        System.out.printf("bajo: %s%n",bajo);

    }

    static String[] createNames(){
        return new String[] {"Carlos","Antonio","Jorge","Ana","Mayra","Julieta","Maria","Rodrigo","Anabel","Luz"};
    }

    static double[] createImc(){
        return RandomUtilities.generarRandomArrayDouble(10,1,50, new Random());
    }

    static void fillInList(
            List<String> alto,
            List<String> medio,
            List<String> bajo,
            String[] arrayNames,
            double[] arrayImc
    ){
        final int n = arrayImc.length;

        for (int i = 0; i < n; i++) {
            final String name = arrayNames[i];
            final double imc = arrayImc[i];

            if (imc >= 40){
                alto.add(name);
            } else if (imc >= 25) {
                medio.add(name);
            }else
                bajo.add(name);
        }

    }

}
