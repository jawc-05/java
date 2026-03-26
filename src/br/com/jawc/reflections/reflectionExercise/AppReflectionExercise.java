/**
 * @author jawc-05
 */
package br.com.jawc.reflections.reflectionExercise;

public class AppReflectionExercise {

    public static void main(String[] args) {

        Class<Produto> tableClass = Produto.class;

        Tabela tabela = tableClass.getAnnotation(Tabela.class);

        System.out.println(tabela);
        System.out.println(tabela.name());
        System.out.println(tabela.description());
        System.out.println(tabela.code());
    }
}