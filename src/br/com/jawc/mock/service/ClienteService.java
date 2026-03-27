/**
 * @author jawc
 */
package br.com.jawc.mock.service;

import br.com.jawc.mock.dao.ClienteDao;

public class ClienteService {

    private ClienteDao clienteDao;

    public ClienteService(){
        clienteDao = new ClienteDao();
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso!";
    }
}
