/**
 * @author jawc-05
 */
package br.com.jawc.streams.intermediates;

import java.util.List;
import java.util.stream.Stream;

public class LimitExamples {

    public static void main(String[] args) {
        System.out.println("LIMIT");

        List<Person> list = new Person().createPersons();
        Stream<Person> stream = list.stream().limit(2);
        stream.forEach(System.out::println);
    }
}