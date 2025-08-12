/**
 * @author jawc
 */
package br.com.jawc.agregacao;

public class Vendedor {

    private String nome;
    private Double commisao;

    public Double getCommisao() {
        return commisao;
    }

    public void setCommisao(Double commisao) {
        this.commisao = commisao;
    }

    public void vende(){
        System.out.println("Vender");
    }
}
