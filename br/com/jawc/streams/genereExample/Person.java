/**
 * @author jawc
 */
package br.com.jawc.streams.genereExample;

import java.util.List;

public class Person {

    private String name;
    private String sex;

    public Person(String name, String sex) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List addingPersons(){
        Person p1 = new Person("Maria", "Mulher");
        Person p2 = new Person("Juan", "Homem");
        Person p3 = new Person("Julia", "Mulher");
        Person p4 = new Person("Cecília", "Mulher");
        Person p5 = new Person("Pedro", "Homem");
        Person p6 = new Person("Zoe", "Mulher");
        return List.of(p1,p2,p3,p4,p5,p6);
    }
}
