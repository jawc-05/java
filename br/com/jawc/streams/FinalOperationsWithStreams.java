/**
 * @author jawc-05
 */
package br.com.jawc.streams;

import br.com.jawc.streams.intermediates.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FinalOperationsWithStreams {

    public static void main(String[] args) {
        List<Person> list = new Person().createPersons();

        forEach(list);
        count(list);
        allMatch(list);
        anyMatch(list);
        collect(list);
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

    private static void anyMatch(List<Person> list) {
        System.out.println("********** Any Match **********");

        //this is almost the same as allMatch, but it has a big diff, just needs to has one, not everyone!
        boolean result = list.stream()
                .anyMatch(person -> person.getNationality().equals("USA"));
        System.out.println(result);
    }

    private static void collect(List<Person> list) {
        System.out.println("*********** Collect ***********");

        List<Person> PersonsStartsWithJ = list.stream()
                .filter(person -> person.getName().startsWith("J"))
                .collect(Collectors.toList());
        PersonsStartsWithJ.forEach(System.out::println);

//        /// Can be this way
//        list.stream()
//                .filter(person -> person.getName().startsWith("J"))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        System.out.println("*********** BRASILEIROS ***********");

        //Using so direct like this i dont think if has real uses in the market/real world, but its ok to learn
        list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .collect(Collectors.toList())
                .forEach(System.out :: println);
    }
}