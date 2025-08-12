/**
 * @author jawc
 */
package br.com.jawc.interfaces;

public interface ICarro {

    default void parar(){
        System.out.println("Carro está parando");
    }

    public void andar();
}
