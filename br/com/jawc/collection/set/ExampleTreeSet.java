/**
 * @author jawc
 */

package br.com.jawc.collection.set;

import java.util.TreeSet;
import java.util.Set;

public class ExampleTreeSet {

    public static void main(String[] args) {
    exemploListaSimples();
        /**
         * não repete os valores na lista
         * tem ordem natural dos objetos
         */
    }

    public static void exemploListaSimples() {
        System.out.println("*****exemploListaSimples");
        Set<String> lista = new TreeSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println(" ");
    }
}
