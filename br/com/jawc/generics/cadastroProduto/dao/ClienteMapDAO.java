/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao;

import br.com.jawc.generics.cadastroProduto.dao.generic.GenericDAO;
import br.com.jawc.generics.cadastroProduto.domain.Cliente;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{

    public ClienteMapDAO() {
        super();
    }


    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public void atualizarDados(Cliente entity) {

    }

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }

//    private Map<Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        this.map = new HashMap<Long, Cliente>();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if (this.map.containsKey(cliente.getCpf())) {
//            return false;
//        }
//        this.map.put(cliente.getCpf(), cliente);
//        return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = this.map.get(cpf);
//
//        if (clienteCadastrado != null) {
//            this.map.remove(clienteCadastrado.getCpf(),  clienteCadastrado);
//        }
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
//
//        if (clienteCadastrado != null) {
//            clienteCadastrado.setNome(cliente.getNome());
//            clienteCadastrado.setCpf(cliente.getCpf());
//            clienteCadastrado.setTel(cliente.getTel());
//            clienteCadastrado.setNumero(cliente.getNumero());
//            clienteCadastrado.setCidade(cliente.getCidade());
//            clienteCadastrado.setEstado(cliente.getEstado());
//            clienteCadastrado.setEnd(cliente.getEnd());
//        }
//    }
//
//    @Override
//    public Cliente buscar(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Cliente> listar() {
//        return this.map.values();
//    }
}
