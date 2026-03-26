/**
 * @author jawc-05
 */
package br.com.jawc.streams.genereExample;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Person> list = new Person().addingPersons();

        list.stream()
                .forEach(System.out::println);

        System.out.println("***** LISTA COM APENAS AS MULHERES *****");
        List<Person> mulheres = list.stream()
                .filter(person -> person.getSex().equals("Mulher"))
                .collect(Collectors.toList());
        mulheres.forEach(System.out::println);

        System.out.println("***** LISTA COM APENAS OS HOMEMS *****");
        List<Person> homens = list.stream()
                .filter(person -> person.getSex().equals("Homem"))
                .collect(Collectors.toList());
        homens.forEach(System.out::println);

    }
}