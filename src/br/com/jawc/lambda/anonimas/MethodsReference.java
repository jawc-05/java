/**
 * @author jawc-05
 */
package br.com.jawc.lambda.anonimas;

public class MethodsReference {

    public static void main(String[] args) {
        MyEventConsumer myEvent1 = s -> System.out.println(s);
        myEvent1.consumer("Oi1");

        MyEventConsumer myEvent2 = System.out::println;
        myEvent2.consumer("Oi2");
    }
}