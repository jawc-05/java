/**
 * @author jawc
 */
package br.com.jawc;

import org.junit.Assert;
import org.junit.Test;

public class ContractServiceTest {

    @Test
    public void saveTest(){
        IContractService service = new ContractService();
        String re = service.save();
        Assert.assertEquals("Sucesso!", re);
    }
}
