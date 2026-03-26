/**
 * @author jawc
 */

package br.com.jawc.collection.set;

import br.com.jawc.collection.domains.Aluno;

import java.util.*;

/**
 * O HashSet não tem ordem
 * O acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estaram ordenados.
 * Não repete valores na lista
 */

public class ExampleHashSet {

    public static void main(String[] args) {
    exemploListaSimples();
    exemploListaSimplesOrdemAscendente();
    exemploInteiros();
    }

    private static void exemploInteiros() {
        System.out.println("*****exemploInteiros*****");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(1);
        System.out.println(inteiros);
    }

    private static void exemploListaSimples(){
        System.out.println("*******exemploListaSimples*******");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente(){
        System.out.println("*******exemploListaSimplesOrdemAscendente*******");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        //Colections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
