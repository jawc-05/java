/**
 * @author jawc
 */

package br.com.jawc.collection.set;

import br.com.jawc.collection.domains.Aluno;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSetAluno {

    public static void main(String[] args) {
    exemploListaSimples();
    }

    private static void exemploListaSimples() {
        Set<Aluno> conjunto = new TreeSet<>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
