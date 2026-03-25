/**
 * @author jawc-05
 */
package br.com.jawc.streams.genereExample;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> list = new Person().addingPersons();

        list.stream()
                .forEach(System.out::println);


    }
}