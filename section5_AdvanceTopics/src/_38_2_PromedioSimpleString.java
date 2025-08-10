import java.util.Arrays;

public class _38_2_PromedioSimpleString {

    public static void main(String[] args) {
        final var arrayEnteros = createData();
        final int average = average(arrayEnteros);
        printArray(average);
    }

    static int[] createData(){
        final String cadena = "5,3,15,23,12,11";
        final var arrayCadena = cadena.split(",");
        final int n = arrayCadena.length;
        final int[] arrayEnteros = new int[n];

        for (var i = 0; i < n; i++) {
            arrayEnteros[i] = Integer.parseInt(arrayCadena[i]);
        }

        return arrayEnteros;
    }


    static int average(int[] arrayInt){
        int add=0,cont=0, n = arrayInt.length;

        for (var i = 0; i < n; i++) {
            add += arrayInt[i];
        }

        return add/n;
    }

    static void printArray(int average){
        System.out.print(average);
    }
}
