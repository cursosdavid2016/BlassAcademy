import java.util.ArrayList;
import java.util.List;

public class _38_3_InicianLetraA {
    public static void main(String[] args) {
        imprimirLista(inicianConLetraA(separarNombres(crearNombres())));
    }


    static String crearNombres(){
        return "CARLOS,ARTURO,MARIA,ANA,ANAHIS,RODRIGO,PEDRO,ARMANDO";
    }

    static String[] separarNombres(String nombresUnidos){
        return nombresUnidos.split(",");
    }

    static List<String> inicianConLetraA(String[] nomSeparados){
        final ArrayList<String> listaFiltrada = new ArrayList<>();

        for (String elemento: nomSeparados){
            if (elemento.startsWith("A")){
                listaFiltrada.add(elemento);
            }
        }
        return listaFiltrada;
    }

    static void imprimirLista(List<String> lista){
        System.out.printf("lista con nombres iniciados con la letra 'A' son: %s%n",lista);
    }
}
