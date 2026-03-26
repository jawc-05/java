/**
 * @author jawc-05
 */
package br.com.jawc.lambda.anonimas;

public class MethodsWIthLambas {

    public static void main(String[] args) {

        MyEventConsumer myEvent = s -> print(s);
        myEvent.consumer("Deixando mais claro e mais simples como se usa lambda utilizando um método!");

    }
    private static void print(Object o){
        System.out.println(o);
    }

}