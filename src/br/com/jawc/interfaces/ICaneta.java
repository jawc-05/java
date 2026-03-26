/**
 * @author jawc
 */
package br.com.jawc.interfaces;

public interface ICaneta {

    default void escreverComumATodas(){
        System.out.println("Escrita por meio default");
    }


    public void escrever(String texto);

    public String getCor();
}
