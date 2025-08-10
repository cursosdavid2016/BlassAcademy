import javax.xml.namespace.QName;
import java.util.Scanner;

public class StringArrayChar_37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 stringArrayChar();
        //2 stringUtilities();
        //3 System.out.println(stringFormat("d",25,60.3));
        //4 multilineA();
        //4 multilineB("benjamin",1.77,40);
        //5 stringCompare();
        //6 compararCadenas();
        //7 convertirMayusculas();
        //8 compararAlfabeticamente();
        //9 separarString();
        //10 reemplazar(scanner);
        //11 endAndStarWith(scanner);
        //12 estaVacia(scanner);

        scanner.close();
    }

    //1- a String is array of chart
    static void stringArrayChar(){
        final var string = "aloha";
        final var arrayChar = string.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            System.out.printf("index: %d value: %c%n",i,arrayChar[i]);
        }
    }

    //2- String utilities(.length() - .charAt(index) - .indexOf(char/String))
    static void stringUtilities(){
        final String cadena = "aloha";

        //length
        System.out.printf("cadena size is: %s%n",cadena.length());

        //chartAt(index)
        final char[] charArray = cadena.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.printf("index: %d letter: %c%n",i,charArray[i]);
        }

        //.indexOf(char/String)
        System.out.printf("the index of the 'o' letter is: %d%n",cadena.indexOf('o'));
        System.out.printf("the index of the \"lo\" letter is: %d%n",cadena.indexOf("lo"));

    }

    //3- String format
    static String stringFormat(String name,int age, double weight){
        return String.format("My name is: %s i have %d old and i weight %.2f",
                name,age,weight);
    }


    //4- multiline A
    static void multilineA(){
        final var multiline = """
                name: jesus,
                size: 1.77,
                age: 33
                """;
        System.out.println(multiline);
    }

    //4- multiline B
    static void multilineB(String name, double size, int age){
        final var multiline = """
                name: %s,
                size: %.2f,
                age: %d
                """;

        System.out.printf(multiline,name,size,age);
    }

    //5- comparar strings
    static void stringCompare(){
        Scanner scanner = new Scanner(System.in);

        final var cadena1 = ScannerManager.leerString(scanner,"enter cadena 1");
        final var cadena2 = ScannerManager.leerString(scanner,"enter cadena 2");

        if (cadena1.equals(cadena2)){
            System.out.println("both strings are equals");
        }

        if (cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("both strings are equalsIgnoreCase");
        }

    }

    //6- comparar cadenas
    static void compararCadenas(){
        Scanner sc = new Scanner(System.in);

        final String cadena1 = "hello word";
        final String cadena2 = "word";

        if (cadena1.contains(cadena2)){
            System.out.println("cadena1 contiene cadena 2");
        }
    }

    //7 convertir mayusculas a minusculas
    static void convertirMayusculas(){
        Scanner scanner = new Scanner(System.in);

        final var cadena1 = ScannerManager.leerString(scanner,"ingrese cadena 1en minusculas");
        final var cadena2 = ScannerManager.leerString(scanner,"ingrese cadena 2 en MAYUSCULAS");

        scanner.close();

        System.out.printf("convirtiendo a mayusculas %s%n",cadena1.toUpperCase());
        System.out.printf("convirtiendo a minusculas %s%n",cadena2.toLowerCase());
    }

    // 8 compara cadenas alphabeticamente
    static void compararAlfabeticamente(){
        Scanner scanner = new Scanner(System.in);

        final var cadena1 = ScannerManager.leerString(scanner,"ingrese primer cadena 2");
        final var cadena2 = ScannerManager.leerString(scanner,"ingrese segunda cadena 2");

        if (cadena1.compareToIgnoreCase(cadena2) == 0){
            System.out.printf("'%s' cadenas iguales '%s'%n",cadena1,cadena2);
        } else if (cadena1.compareToIgnoreCase(cadena2) > 0) {
            System.out.printf("cadena '%s' es primero que cadena '%s'%n",cadena2,cadena1);
        }else if (cadena1.compareToIgnoreCase(cadena2) < 0){
            System.out.printf("cadena '%s' es primero que cadena '%s'%n",cadena1,cadena2);
        }

    }

    //9 separar strings con un indicador
    static void separarString(){
        Scanner scanner = new Scanner(System.in);
        final var cadena = ScannerManager.leerString(scanner,"ingrese frase separada por ','");

        final String[] arrayString = cadena.split(",");

        for (int i = 0; i < arrayString.length; i++) {
            System.out.printf("index: %d word: %s%n",i,arrayString[i]);
        }

    }

    //10 metodo reemplazar
    static void reemplazar(Scanner sc){
        final String precio1 = "125.4$";
        final String moneda = "12.50USD";

        final var nuevaDataPrecio = precio1.replace("$","");
        final var nuevaDataMoneda = moneda.replace("USD","");

        System.out.printf("el precio limpio es: %s%n",nuevaDataPrecio);
        System.out.printf("la nueva data de moneda es: %s%n",nuevaDataPrecio);
    }

    //11 inicia con - termina con
    static void endAndStarWith(Scanner sc){
        final var name = ScannerManager.leerString(sc,"enter the name");

        if (name.startsWith("a")){
            System.out.println("nombre inicia con la letra 'a'");
        }else
            System.out.println("nombre no inicia con la letra 'a'");

        if (name.endsWith("o")){
            System.out.println("nombre termina con la letra 'o'");
        }else
            System.out.println("nombre no termina con la letra 'o'");
    }

    //12 ¿la cadena esta vacia?
    static void estaVacia(Scanner sc){
        final var nombre = ScannerManager.leerString(sc,"ingrese su nombre");

        if (nombre.isEmpty()){
            System.out.println("por favor ingrese su nombre");
        }else
            System.out.printf("su nombre es: %s%n",nombre);

    }
}
