/**
 * @author jawc
 */
package br.com.jawc.composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private Set<ContaCorrente> contasCorrentes;
    private Set<ContaPoupanca> contasPoupances;

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupances = new HashSet<>();
    }

    public void add(ContaCorrente cc) {
        this.contasCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp) {
        this.contasPoupances.add(cp);
    }
}
