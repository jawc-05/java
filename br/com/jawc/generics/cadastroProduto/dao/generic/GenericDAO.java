/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao.generic;

import br.com.jawc.generics.cadastroProduto.annotation.KeyType;
import br.com.jawc.generics.cadastroProduto.domain.Cliente;
import br.com.jawc.generics.cadastroProduto.domain.Persistente;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {


    protected Map<Class<T>, Map<Long, T>> map;

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public abstract void atualizarDados(Cliente entity);

    public abstract Class<T> getClassType();

    public GenericDAO() {
        if (this.map == null) {
            this.map = new HashMap<>();
        }
    }

    public Long getKey(T entity) throws NoSuchMethodException {
        Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field : fields ) {
            if(field.isAnnotationPresent(KeyType.class)){
                KeyType keyType = field.getAnnotation(KeyType.class);
                String methodName = keyType.value();
                Method method = entity.getClass().getMethod(methodName);
            }
        }
        return 0L;
    }

    @Override
    public Collection<T> consultarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        return mapaInterno.values();
    }

    @Override
    public T consultar(Long value) {
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        return mapaInterno.get(value);
    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        T objetoCadastrado = mapaInterno.get(getClassType());
        if (objetoCadastrado != null) {
            atualizarDados(entity,  objetoCadastrado);
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
        Long key = getChave(entity);
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }
}