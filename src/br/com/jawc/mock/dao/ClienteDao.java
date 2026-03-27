/**
 * @author jawc
 */
package br.com.jawc.mock.dao;

public class ClienteDao implements IClienteDAO {

    public String salvar(){
        throw new UnsupportedOperationException("Need to configure the database before saving");
    }
}
