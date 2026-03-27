/**
 * @author jawc
 */
package br.com.jawc;

import br.com.jawc.mock.dao.ClienteDao;
import br.com.jawc.mock.dao.mocks.ClienteDaoMock;
import br.com.jawc.mock.dao.IClienteDAO;
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

    @Test(expected=UnsupportedOperationException.class)
    public void expectedErrorInSaveTest(){
        IClienteDAO clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        String re = service.salvar();
        Assert.assertEquals("Sucesso!", re);
    }
}
