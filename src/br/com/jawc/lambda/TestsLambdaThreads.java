/**
 * @author jawc-05
 */
package br.com.jawc.lambda;

public class TestsLambdaThreads {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando Runnable de forma comum!");
            }
        };
        new Thread(r).start();

        Runnable r2 = ()->{
            System.out.println("Executando Runnable com lambda!");
        };
        new Thread(r2).start();

        new Thread(() -> System.out.println("Executando Runnable com lambda de forma mais direta ainda!")).start();

    }
}