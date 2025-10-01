/**
 * @author jawc
 */
package br.com.jawc.carros;

public class Fusion extends Carro{

    public Fusion(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void dirigir() {
        System.out.println("O"+ this.getClass().getSimpleName()+" de modelo: "+ getModelo() + " e ano: "+ getAno() + "está andando");
    }
}
