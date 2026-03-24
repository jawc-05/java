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

        System.out.println("********** BRASILEIROS **********");

        list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                /// .forEach(pBrazilian -> System.out.println(pBrazilian)) it'll work, but is gonna show the hashCodes not the "real" names
                .forEach(pBrazilian -> System.out.println(pBrazilian.getName()));

    }
}