/**
 * @author jawc
 */
package br.com.jawc.agregacao;

public class Produto {

    private Double preco;

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
