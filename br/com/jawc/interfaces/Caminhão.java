/**
 * @author jawc
 */
package br.com.jawc.interfaces;

public class Caminhão implements ICarro{

    @Override
    public void andar() {
        System.out.println("Caminhão está andando devagar");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão parando");
    }
}
