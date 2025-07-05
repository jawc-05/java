/**
 * @author jawc
 */
package br.com.jawc.collection.list;

import java.util.Collections;
import java.util.List;

public class LinkedList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    public static void exemploListaSimples(){
        System.out.println("Lista simples");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println(" ");

        lista.remove(0);
        System.out.println(lista);
        boolean contem = lista.contains("João da Silva");
        System.out.println(contem);

        for(String nome: lista){
            System.out.println(nome);
        }

        System.out.println(lista.get(0));
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new LinkedList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
