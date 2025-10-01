/**
 * @author jawc
 */
package br.com.jawc.carros;

public class Civic  extends Carro{

    public Civic(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void dirigir() {
        System.out.println("O"+ this.getClass().getSimpleName()+" de modelo: "+ get + " e ano: "+ ano + "está andando");
    }
}
