/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import java.util.List;
import java.util.stream.Stream;

public class DistinctExample {

    public static void main(String[] args) {

         List<Person> list = new Person().createPersons();

        Stream<Person> stream = list.stream().distinct();

    }
}