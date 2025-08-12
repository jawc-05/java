/**
 * @author jawc
 */
package br.com.jawc.agregacao;

public class Produto {

    private Double preco;
    private String nome;
    private Long codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void vendido(){
        System.out.println("Vendido");
    }
}
