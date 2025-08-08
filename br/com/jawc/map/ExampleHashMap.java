/**
 * @author jawc
 */

package br.com.jawc.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();

    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("***** exemploListaSimplesIterandoChaves *****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "Maria Sousa");
        lista.put(3, "Lúcia Ferreira");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("***** exemploListaSimplesIterandoValores *****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "Maria Sousa");
        lista.put(3, "Lúcia Ferreira");
        for ( String value : lista.values() ) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimples() {
        System.out.println("***** exemploListaSimples *****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "Maria Sousa");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
        System.out.println(" ");
    }
}
