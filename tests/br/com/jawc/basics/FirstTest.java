package br.com.jawc.basics;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jawc
 */

public class FirstTest {


    @Test
    public void equalTest() {
        String nome = "João";
        Assert.assertEquals("João", nome);
    }

    @Test
    public void notEqualTest() {
        String nome = "Alfredo";
        Assert.assertNotEquals("João", nome);
    }
}
