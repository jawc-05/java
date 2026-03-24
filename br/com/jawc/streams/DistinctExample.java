/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import java.util.List;
import java.util.stream.Stream;

public class DistinctExample {

    public static void main(String[] args) {

         List<Person> list = new Person().createPersons();

         //This one do what the name says(based in the equals Hash Code), like saw the distinct ones fromt the stream, in this case the list
        Stream<Person> stream = list.stream().distinct();
        stream.forEach(System.out::println);

    }
}