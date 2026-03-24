/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import br.com.jawc.streams.intermediates.Person;

import java.util.List;
import java.util.stream.Stream;

public class FinalOperationsWithStreams {

    public static void main(String[] args) {
        List<Person> list = new Person().createPersons();

        forEach(list);
        count(list);
        allMatch(list);
    }



    private static void forEach(List<Person> list) {
        System.out.println("********** for Each **********");

        list.stream().forEach(person -> System.out.println(person.getName()));

        System.out.println("********** BRASILEIROS **********");

        list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                /// .forEach(pBrazilian -> System.out.println(pBrazilian)) it'll work, but is gonna show the hashCodes not the "real" names
                .forEach(pBrazilian -> System.out.println(pBrazilian.getName()));


        System.out.println("********** ANOTHER WAY, SAME RESULT **********");


        //Can be done using this way, but its not the most used
        Stream<Person> stream = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"));
        stream.forEach(pBrazilian -> System.out.println(pBrazilian.getName()));



        System.out.println("********** AGES FROM THE BRAZILIAN PEOPLE **********");
        list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .map(Person :: getAge)
                .forEach(System.out::println);
    }

     private static void count(List<Person> list){
        System.out.println("*********** count ***********");

        long count = list.stream()
                .filter(person -> person.getName().startsWith("J"))
                .count();
        System.out.println(count);
     }

     private static void allMatch(List<Person> list) {
        System.out.println("*********** allMatch ***********");

        //allMatch checks if EVERYONE in the list, collection etc.. is equals something
         boolean result = list.stream()
                 .allMatch(person -> person.getNationality().equals("USA"));
         System.out.println(result);
    }
}