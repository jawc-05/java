/**
 * @author jawc
 */
package br.com.jawc.abstratas;

public class Assalariado extends Empregado {

    private Double salario;

    @Override
    public Double vencimento() {
        return 0.0;
    }
}
