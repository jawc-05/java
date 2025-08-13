/**
 * @author jawc
 */

package br.com.jawc.composicao;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco(); //Se o banco for excluido se tornam inutil as classes de contas, devido a ser composição
        banco.setCodigo(10l);
        banco.setNome("JawcBank");

        ContaCorrente cc  = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);
    }
}
