/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import java.util.List;
import java.util.stream.Stream;

public class FilterExamples {

    public static void main(String[] args) {

            List <Person> persons = new Person().createPersons();

            Stream<Person> stream = persons.stream().filter(person -> person.getNationality().equals("Brazil"));
            stream.forEach(System.out::println);
        }

    }