/**
 * @author jawc-05
 */
package br.com.jawc.streams.intermediates;

import java.util.List;
import java.util.stream.Stream;

public class FilterExamples {

    public static void main(String[] args) {

            List <Person> list = new Person().createPersons();
            Stream<Person> stream = list.stream()
                    .filter(person -> person.getNationality().equals("Brazil"));
            stream.forEach(System.out::println);


            //In this example i used stream map, so now we can see the real String name of these persons
        Stream<String> stream2 = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .map(Person:: getName);
        stream2.forEach(System.out::println);
        }

    }