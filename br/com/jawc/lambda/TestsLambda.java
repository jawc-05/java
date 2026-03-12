/**
 * @author jawc-05
 */
package br.com.jawc.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class TestsLambda {

    public static void main(String[] args) {
        IntBinaryOperator iBin = (int a, int b) -> {
            return a + b;
        };
         System.out.println("IntBinaryOperator:");
         System.out.println( iBin.applyAsInt(10, 10));

        BiFunction<Integer, Integer, Integer> biFunc = (a, b) -> {
            System.out.println("BiFunction: ");
            return a + b;
        };
        System.out.println(biFunc.apply(10, 10)); //Integer resultBi = biFunc.apply(2,2);
                                                        //System.out.println(resultBi);

        BiFunction<Double, Double, String> biDbFunc = (Double a, Double b) ->{
            Double res = a + b;
            return String.valueOf(res);
        };
        String resultStr = biDbFunc.apply(10d,10d);
        System.out.println("String: "+resultStr);

        Long returnLong = calcular(10L, 10L, (Long v1, Long v2) -> {
            return v1 + v2;
        });
        System.out.println("Long: "+returnLong);

        Runnable hello_world = () -> System.out.println("Hello World");

        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("Value ");

        Supplier<Integer> supplier = () -> 10;
        Supplier<Double> doubleSupplier = () -> {
            return  10.0;
        };
    }

    private static Long calcular(Long u, Long t, BiFunction<Long, Long, Long> function){
        return function.apply(u,t);
    }
}