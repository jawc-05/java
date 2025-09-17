/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao;

import br.com.jawc.generics.cadastroProduto.domain.Produto;

import java.util.Collection;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {
    @Override
    public Boolean cadastrar(Produto produto) {
        return null;
    }

    @Override
    public void excluir(Long codigo) {

    }

    @Override
    public void alterar(Produto produto) {

    }

    @Override
    public Produto consultar(Long codigo) {
        return null;
    }

    @Override
    public Collection<Produto> consultarTodos() {
        return List.of();
    }
}
