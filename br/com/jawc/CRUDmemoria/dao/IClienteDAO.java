/**
 * @author jawc
 */
package br.com.jawc.CRUDmemoria.dao;

import br.com.jawc.CRUDmemoria.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente buscar(Long cpf);
    public Collection<Cliente> listar();
}
