/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao;

import br.com.jawc.generics.cadastroProduto.dao.generic.GenericDAO;
import br.com.jawc.generics.cadastroProduto.domain.Cliente;
import br.com.jawc.generics.cadastroProduto.domain.Produto;

import java.util.Collection;
import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {

    }

    @Override
    public void atualizarDados(Cliente entity) {

    }

    @Override
    public Class<Produto> getClassType() {
        return null;
    }
}
