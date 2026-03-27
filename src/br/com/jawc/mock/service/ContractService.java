/**
 * @author jawc
 */
package br.com.jawc.mock.service;

import br.com.jawc.mock.dao.IContractDAO;

public class ContractService implements IContractService {

    public ContractService(IContractDAO dao) {
    }

    @Override
    public String save() {
        return "Sucesso!";
    }
}
