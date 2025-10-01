/**
 * @author jawc
 */
package br.com.jawc.carros;

public abstract class Carro {

    private String modelo;
    private String marca;
    private Integer ano;

    public abstract void dirigir();

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}
