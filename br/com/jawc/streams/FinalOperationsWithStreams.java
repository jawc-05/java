/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import br.com.jawc.streams.intermediates.Person;

import java.util.List;

public class FinalOperationsWithStreams {

    public static void main(String[] args) {
        List<Person> list = new Person().createPersons();

        forEach(list);
    }

    private static void forEach(List<Person> list) {
        list.stream().forEach(person -> System.out.println(person.getName()));
        list.forEach(person -> System.out.println(person.getName()));
    }
}