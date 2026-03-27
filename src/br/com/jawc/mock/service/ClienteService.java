/**
 * @author jawc
 */
package br.com.jawc.mock.service;

import br.com.jawc.mock.dao.ClienteDao;
import br.com.jawc.mock.dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDao;

    public ClienteService(){
        clienteDao = new ClienteDao();
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso!";
    }
}
