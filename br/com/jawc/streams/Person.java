/**
 * @author jawc
 */
package br.com.jawc.streams;

import java.util.List;

public class Person {

    private String id;

    private String name;

    private String nationality;

    private int age;

    public Person(String id, String name, String nationality, int age) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> createPersons() {
        Person person1 = new Person("1", "Caedyn", "American", 20);
        Person person2 = new Person("2", "João", "Brazilian", 20);
        Person person3 = new Person("3", "Alfredo", "Brazilian", 20);
        Person person4 = new Person("4", "Dimitri", "Greek", 21);
        return List.of(person1, person2, person3, person4);
    }

}
