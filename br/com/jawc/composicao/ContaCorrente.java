/**
 * @author jawc
 */
package br.com.jawc.composicao;

public class ContaCorrente {

    private Double saldo;
    private  Double chequeEspecial;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
