/**
 * @author jawc
 */
package br.com.jawc.collection.list;

import br.com.jawc.collection.domains.Aluno;
import br.com.jawc.collection.domains.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleArrayListAluno {

    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {

        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("*****exemploListaSimplesOrdenadaComparatorAluno*****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João Victor Benneti", "Engenharia de Software", 80);
        Aluno b = new Aluno("Mauro Roncata", "Técnico de TI", 70);
        Aluno c = new Aluno("Tiago Mendonça", "Cyber-segurança", 90);

        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println("Lista sem ordenação "+ lista);
        //Collections.sort(lista);
        System.out.println("Lista com ordenação " +lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota "+ lista);
    }
}
