/**
 * @author jawc
 */
package br.com.jawc;

import br.com.jawc.streams.genereExample.App;
import br.com.jawc.streams.genereExample.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestWomen {

    @Test
    public void checkWomenTest(){
        List<Person> ogList = new Person().addingPersons();

        Collection<Person> filteredResult = App.checkWomen(ogList);

        filteredResult.stream()
                .forEach(person ->
                        Assert.assertTrue(person.getSex().equals("Mulher")));
    }
}
