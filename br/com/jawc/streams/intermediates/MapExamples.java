/**
 * @author jawc-05
 */
package br.com.jawc.streams.intermediates;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExamples {

    public static void main(String[] args) {

        List<Person> list = new Person().createPersons();

        Stream<Integer> stream = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .map(Person::getAge);
        stream.forEach(System.out::println);


        //The same thing but using IntStream, this is to minimize the cpu/mem use
        IntStream streamInt = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .mapToInt(Person::getAge);
        streamInt.forEach(System.out::println);
    }
}