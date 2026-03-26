/**
 * @author jawc
 */

package br.com.jawc.collection.set;

import br.com.jawc.collection.domains.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSetAluno {

    public static void main(String[] args) {
    exemploListaSimples();
    exemploConsultando();
    exemploRemovendo();
        /**
         * Para não repetir objetos na lista é necessário que a classe Alunos
         * tenha o equals e hashcode
         */
    }

    private static void exemploRemovendo() {
        System.out.println("******Exemplo Removendo******");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva, ", "Linux Básico", 0);
        Aluno b = new Aluno("Antonio Sousa, ", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira, ", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa, ", "OpenOffice", 10);
        Aluno e = new Aluno("Maria Sousa, ", "Internet", 20);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);
        System.out.println(conjunto);

        for(Aluno aluno : conjunto) {
            System.out.println(aluno);
        }
    }

    private static void exemploConsultando() {
        System.out.println("******Exemplo Consultando******");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva, ", "Linux Básico", 0);
        Aluno b = new Aluno("Antonio Sousa, ", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira, ", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa, ", "OpenOffice", 10);
        Aluno e = new Aluno("Maria Sousa, ", "Internet", 20);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(a));
        System.out.println(conjunto.contains(e));
    }

    private static void exemploListaSimples() {
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva, ", "Linux Básico", 0);
        Aluno b = new Aluno("Antonio Sousa, ", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira, ", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa, ", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
