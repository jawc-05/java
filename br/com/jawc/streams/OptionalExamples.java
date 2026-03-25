/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import br.com.jawc.streams.intermediates.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {
        List<Person> list = new Person().createPersons();

        System.out.println("----- OLDEST PERSON -----");
        Optional<Person> optional = list.stream()
                .max(Comparator.comparing(Person::getAge));
        if (optional.isPresent()) {
            System.out.println("Max age: " + optional.get());
        }


    }
}