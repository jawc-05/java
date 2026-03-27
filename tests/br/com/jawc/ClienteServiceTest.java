/**
 * @author jawc
 */
package br.com.jawc;

import br.com.jawc.mock.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void saveTest(){
        ClienteService service = new ClienteService();
        String re = service.salvar();
        Assert.assertEquals("Sucesso!", re);

    }
}
