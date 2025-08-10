import java.util.List;

public class manipulacionStringsEjercicios_38 {
    public static void main(String[] args) {

        //1 ordenar cadena con bubbleSort
        final String cadena = "Carlos,Rodrigo,Juan,Arturo,Daniel,Mayra";
        final String[] arrayString = cadena.split(",");

        printArray(arrayString);
        bubbleSort(arrayString);
        printArray(arrayString);


    }

    static void printArray(String[] arrayString){
        int n = arrayString.length;
        for (var i = 0; i < n; i++) {
            System.out.printf("%s  ",arrayString[i]);
        }
        System.out.println();
    }

    static String[] bubbleSort(String[] array) {

        final int n = array.length;
        String aux;

        for (var i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j+1]) > 0) {
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }

}
