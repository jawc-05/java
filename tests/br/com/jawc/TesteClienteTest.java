package br.com.jawc;

import org.junit.Assert;
import org.junit.Test;
import br.com.jawc.tests.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseClienteTest(){
        TesteCliente cli = new TesteCliente();
        cli.addName("João");

        Assert.assertEquals("João", cli.getNome());


    }

}