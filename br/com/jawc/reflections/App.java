/**
 * @author jawc-05
 */
package br.com.jawc.reflections;

public class App {

    public static void main(String[] args) {
        Class pClass = Produto.class;

        System.out.println(pClass);

        Produto prod = new Produto();
        Class pClass2 = prod.getClass();
        System.out.println(pClass2);

    }
}