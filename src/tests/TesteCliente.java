/**
 * @author jawc
 */
package tests;

public class TesteCliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addName(String nome){
        setNome(nome);
    }
}
