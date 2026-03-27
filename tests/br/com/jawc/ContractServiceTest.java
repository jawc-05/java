/**
 * @author jawc
 */
package br.com.jawc;

import br.com.jawc.mock.dao.ContractDAO;
import br.com.jawc.mock.dao.IContractDAO;
import br.com.jawc.mock.dao.mocks.ContractDAOMock;
import br.com.jawc.mock.service.ContractService;
import br.com.jawc.mock.service.IContractService;
import org.junit.Assert;
import org.junit.Test;

public class ContractServiceTest {

    @Test
    public void saveTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String re = service.save();
        Assert.assertEquals("Sucesso!", re);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void expectErrorSavingTest(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String re = service.save();
        Assert.assertEquals("Sucesso!", re);
    }

    @Test
    public void deleteTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String re = service.delete();
        Assert.assertEquals("Deletado!", re);
    }

    @Test(expected=UnsupportedOperationException.class)
    public void expectedErrorDeletingTest(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String re = service.delete();
        Assert.assertEquals("Deletado!", re);
    }

    @Test
    public void searchTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String re =  service.search();
        Assert.assertEquals("Encontrado!", re);
    }

    @Test(expected=UnsupportedOperationException.class)
    public void expectErrorSearchingTest(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String re = service.search();
        Assert.assertEquals("Encontrado!", re);
    }
}
