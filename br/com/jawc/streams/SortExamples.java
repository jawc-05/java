/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortExamples {

    public static void main(String[] args) {

        List<Person> list = new Person().createPersons();

        Stream<Person> stream = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .sorted(Comparator.comparing(Person::getName));

        Stream<Person> stream2 = list.stream()
                .sorted((person1, person2) -> Integer.compare(person1.getAge(), person2.getAge()));
        stream2.forEach(System.out::println);
    }
}