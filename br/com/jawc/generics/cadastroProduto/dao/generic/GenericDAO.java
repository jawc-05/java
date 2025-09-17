/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao.generic;

import br.com.jawc.generics.cadastroProduto.domain.Persistente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {


    private Map<Class, Map<Long, T>> map;

    

    public GenericDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Collection<T> consultarTodos() {
        return List.of();
    }

    @Override
    public T consultar(Long value) {
        return null;
    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public void excluir(Long value) {

    }

    @Override
    public Boolean cadastrar(T entity) {
        return null;
    }
}
