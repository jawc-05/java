package br.com.jawc;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jawc
 */

public class SecondTest {

    @Test
    public void checkAge(){
        Integer age = 22;
        Assert.assertEquals(Integer.valueOf(22), age);
    }
}
