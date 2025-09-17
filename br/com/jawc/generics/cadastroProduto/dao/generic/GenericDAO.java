/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.dao.generic;

import br.com.jawc.generics.cadastroProduto.domain.Persistente;

import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {


    private Map<Class, Map<Long, T>> map;

    public GenericDAO() {
        this.map = new HashMap<>();
    }


}
