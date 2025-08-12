/**
 * @author jawc
 */

package br.com.jawc.interfaces;

public class Main {
    public static void main(String[] args) {
         ICaneta caneta = new CanetaEsferografica();
         caneta.escrever("Olá João");
         caneta.escreverComumATodas();
         System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá João");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá João");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());
    }
}
