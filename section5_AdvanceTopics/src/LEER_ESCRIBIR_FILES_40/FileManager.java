package LEER_ESCRIBIR_FILES_40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public static List<String> leerFile(File file){
        final var lista = new ArrayList<String>();

        try{
            final Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                lista.add(sc.nextLine());
            }

            sc.close();
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("error al abrir el file");
            System.err.printf("fileNotFoundException: %s%n", fileNotFoundException.getLocalizedMessage());
        }

        return lista;
    }


    public static void escribirFIle(File file,List<String> lista){
        try {
            final var fileWriter = new FileWriter(file);
            for (String linea: lista){
                final var lineaEscribir = String.format("%s%n",linea);
                fileWriter.write(lineaEscribir);
            }

            fileWriter.close();
        } catch (IOException ioexception) {
            System.out.println("error al escribir el file");
            System.err.printf("%s%n", ioexception.getLocalizedMessage());
        }
    }

}
