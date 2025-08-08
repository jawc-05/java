/**
 * @author jawc
 */

package br.com.jawc.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {
        exemploListaSimples();
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
