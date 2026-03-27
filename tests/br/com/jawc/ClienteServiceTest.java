/**
 * @author jawc
 */
package br.com.jawc;

import br.com.jawc.mock.dao.ClienteDaoMock;
import br.com.jawc.mock.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void saveTest(){
        ClienteDaoMock clienteDaoMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteDaoMock);
        String re = service.salvar();
        Assert.assertEquals("Sucesso!", re);

    }
}
