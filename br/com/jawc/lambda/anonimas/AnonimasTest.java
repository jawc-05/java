/**
 * @author jawc-05
 */
package br.com.jawc.lambda.anonimas;

public class AnonimasTest {

    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("Teste anonima");

    }
}