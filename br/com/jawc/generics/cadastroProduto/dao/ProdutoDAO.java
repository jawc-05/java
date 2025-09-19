/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao;

import br.com.jawc.generics.cadastroProduto.dao.generic.GenericDAO;
import br.com.jawc.generics.cadastroProduto.domain.Cliente;
import br.com.jawc.generics.cadastroProduto.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
        Map<Long, Produto> mapaInterno = this.map.get(getClassType());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getClassType(), mapaInterno);
        }
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {

    }

    @Override
    public void atualizarDados(Cliente entity) {

    }

    @Override
    public Class<Produto> getClassType() {
        return Produto.class;
    }
}
