/**
 * @author jawc
 */
package br.com.jawc.carros.concretes;

import br.com.jawc.carros.abstracts.Carro;

public class Corolla extends Carro {

    public Corolla(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void dirigir() {
        System.out.println("O "+ this.getClass().getSimpleName()+" da marca "+ getMarca() +" de modelo: "+ getModelo() + " e ano: "+ getAno() + " está andando");
    }
}
