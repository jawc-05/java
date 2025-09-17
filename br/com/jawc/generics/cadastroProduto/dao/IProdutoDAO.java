/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao;

import br.com.jawc.generics.cadastroProduto.domain.Produto;

import java.util.Collection;

public interface IProdutoDAO {

    public Boolean cadastrar(Produto produto);

    public void excluir(Long codigo);

    public void alterar(Produto produto);

    public Produto consultar(Long codigo);

    public Collection<Produto> consultarTodos();
}
