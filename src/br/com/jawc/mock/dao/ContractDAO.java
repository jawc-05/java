/**
 * @author jawc
 */
package br.com.jawc.mock.dao;

public class ContractDAO implements IContractDAO {
    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported with the  db yet.");
    }
    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported with the  db yet.");
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported with the db yet");
    }
}
