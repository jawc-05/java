/**
 * @author jawc
 */
package br.com.jawc;

public class Moto {

    private String nome;
    private String cor;
    private String modelo;
    private int anoFabricacao;

    public Moto(String nome, String modelo, String cor, int anoFabricacao) {
        this.nome = nome;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void showInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Cor: "+ cor);
        System.out.println("Modelo: "+ modelo);
        System.out.print("Ano de  fabricacao: "+ anoFabricacao);

    }

}
