/**
 * @author jawc
 */
package br.com.jawc.streams.intermediates;

import java.util.List;
import java.util.Objects;

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

    public Person() {

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public String toString() {
        return "Person{" +
                "ID = '" + id + '\'' +
                ", NAME = '" + name + '\'' +
                ", NATIONALITY = '" + nationality + '\'' +
                ", AGE = " + age +
                '}';
    }

    public List<Person> createPersons() {
        Person person1 = new Person("01", "Caedyn", "USA", 20);
        Person person2 = new Person("02", "João", "Brazil", 21);
        Person person3 = new Person("03", "Alfredo", "Brazil", 20);
        Person person4 = new Person("04", "Dimitri", "Greece", 21);
        Person person5 = new Person("04", "Dimitri", "Greece", 21);
        Person person6 = new Person("05", "José", "Spain", 25);
        return List.of(person1, person2, person3, person4, person5, person6);
    }

}
