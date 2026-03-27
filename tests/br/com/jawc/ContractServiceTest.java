/**
 * @author jawc
 */
package br.com.jawc;

import br.com.jawc.mock.service.ContractService;
import br.com.jawc.mock.service.IContractService;
import org.junit.Assert;
import org.junit.Test;

public class ContractServiceTest {

    @Test
    public void saveTest(){
        IContractService service = new ContractService();
        String re = service.s ave();
        Assert.assertEquals("Sucesso!", re);
    }
}
