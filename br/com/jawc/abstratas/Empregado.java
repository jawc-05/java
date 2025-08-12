/**
 * @author jawc
 */
package br.com.jawc.abstratas;

public  abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;

    public  abstract Double vencimento();

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
