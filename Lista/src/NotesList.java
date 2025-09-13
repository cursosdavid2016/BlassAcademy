import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NotesList {
    public static void main(String[] args){

        final List<String> high = new ArrayList<>();
        final List<String> middle = new ArrayList<>();
        final List<String> low = new ArrayList<>();

        final String[] arrayNames = crearNames();
        final double[] arrayNotes = crearNotes();

        fillInNames(high,middle,low,arrayNames,arrayNotes);

        System.out.printf("high note: %s%n", high);
        System.out.printf("middle note: %s%n", middle);
        System.out.printf("low note: %s%n", low);

    }

    static String[] crearNames(){
        return new String[]{"Carlos","Antonio","Jorge","Ana","Mayra",
                "Julieta","Maria","Rodrigo","Anabel","Luz"};
    }

    static double[] crearNotes(){
        return RandomUtilities.generarRandomArrayDouble(10,1,20, new Random());
    }

    static void fillInNames(
            List<String> high,
            List<String> middle,
            List<String> low,
            String[] arrayNames,
            double[] arrayNotes
    ) {
        final int n = arrayNotes.length;

        for (int i = 0; i < n; i++) {
            final String name = arrayNames[i];
            final double note = arrayNotes[i];

            if (note >= 16) {
                high.add(name);
            } else if (note >= 10) {
                middle.add(name);
            } else
                low.add(name);

        }
    }


}
