/**
 * @author jawc-05
 */
package br.com.jawc.lambda;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class TestsLambda {

    public static void main(String[] args) {
        IntBinaryOperator iBin = (int a, int b) -> {
            return a + b;
        };
         System.out.println("IntBinaryOperator:");
         System.out.println( iBin.applyAsInt(1, 2));

        BiFunction<Integer, Integer, Integer> biFunc = (a, b) -> {
            System.out.println("BiFunction: ");
            return a + b;
        };
        System.out.println(biFunc.apply(2, 2)); //Integer resultBi = biFunc.apply(2,2);
                                                        //System.out.println(resultBi);
    }
}