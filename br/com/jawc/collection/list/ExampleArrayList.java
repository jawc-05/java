/**
 * @author jawc
 */
package br.com.jawc.collection.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são.
 */

public class ExampleArrayList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples(){
        System.out.println("*****exemploListaSimples*****");
        List<String> lista = new ArrayList<String>();
        lista.add("João Alfredo");
        lista.add("Cecília");
        lista.add("Mauro");
        lista.add("João Victor");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente(){
        System.out.println("*****exemploListaSimplesOrdemAscendente*****");
        List<String> lista = new ArrayList<>();
        lista.add("João Alfredo");
        lista.add("Cecília");
        lista.add("Mauro");
        lista.add("João Victor");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
