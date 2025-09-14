package LEER_ESCRIBIR_FILES_40;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class _40_1_ORDENAR_VIDJUEGOS {
    public static void main(String[] args) {
        final var fileInput = new File(
                "src/LEER_ESCRIBIR_FILES_40/files/videojuegos.csv");
        final var fileOutput = new File(
                "src/LEER_ESCRIBIR_FILES_40/files/Output.txt");

        final var listaJuegos = FileManager.leerFile(fileInput);
        final var listaOrdenadaJuegos = ordernarLista(listaJuegos);
        FileManager.escribirFIle(fileOutput,listaOrdenadaJuegos);

    }



    private static List<String> ordernarLista(List<String> list){

        final int n = list.size();
        String aux;

        for (var i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0) {
                    aux = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, aux);
                }
            }
        }

        return list;
    }
}
