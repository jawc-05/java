/**
 * @author jawc
 */
package br.com.jawc.mock.service;

import br.com.jawc.mock.dao.IContractDAO;

public class ContractService implements IContractService {

   private IContractDAO contractDao;

    public ContractService(IContractDAO dao) {
        this.contractDao = dao;
    }

    @Override
    public String save() {
        contractDao.save();
        return "Sucesso!";
    }
}
