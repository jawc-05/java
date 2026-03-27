/**
 * @author jawc
 */
package br.com.jawc;

import br.com.jawc.mock.dao.ContractDAO;
import br.com.jawc.mock.dao.IContractDAO;
import br.com.jawc.mock.service.ContractService;
import br.com.jawc.mock.service.IContractService;
import org.junit.Assert;
import org.junit.Test;

public class ContractServiceTest {

    @Test
    public void saveTest(){
        IContractDAO dao = new ContractDAO();
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
}
