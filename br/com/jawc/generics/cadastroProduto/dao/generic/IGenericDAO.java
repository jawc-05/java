/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao.generic;

import br.com.jawc.generics.cadastroProduto.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastrar(T entity);

    public void excluir(Long value);

    public void alterar(T entity);

    public T consultar(Long value);

    public Collection<T> consultarTodos();

}
