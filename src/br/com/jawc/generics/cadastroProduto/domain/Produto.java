/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.domain;

import br.com.jawc.generics.cadastroProduto.annotation.KeyType;

public class Produto implements Persistente {

    @KeyType("getCodigo ")
    private Long codigo;
    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
