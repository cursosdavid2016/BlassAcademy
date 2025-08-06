public class StringArrayChar_37 {

    public static void main(String[] args) {

        final var string = "aloha";

        final var arrayChar = string.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            System.out.printf("index: %d value: %c%n",i,arrayChar[i]);
        }

    }


}
