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


    protected Map<Class<T>, Map<Long, T>> map;

    public abstract Class<T> getClassType();

    public GenericDAO() {
        this.map = new HashMap<>();
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getClassType(), mapaInterno);
        }
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
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        T objetoCadastrado = mapaInterno.get(getClassType());
        if (objetoCadastrado != null) {

        }
    }

    @Override
    public void excluir(Long value) {
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        T objetoCadastrado = mapaInterno.get(value);
        if (objetoCadastrado != null) {
            mapaInterno.remove(value, objetoCadastrado);
        }
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        if (mapaInterno.containsKey(entity.getCodigo())) {
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }
}
