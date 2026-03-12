/**
 * @author jawc-05
 */
package br.com.jawc.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class TestOperators {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2,3,4,5,6,7,8,9,10,11,12);
        System.out.println("Multiplica todos os elementos da lista por 5!");
        doOperator(list, (n) -> n *5);

        System.out.println("Adiciona 3 a cada elemente da lista!");
        doOperator(list, (n) -> n+3);

        System.out.println("Transforma todos os elementos da lista em 0!");
        doOperator(list, (n) -> 0);
    }

    private static void doOperator(List<Integer> list, IntFunction<Integer> function) {
        list.forEach(n -> {
            n = function.apply(n);
            System.out.println(n + " ");
        });
    }
}