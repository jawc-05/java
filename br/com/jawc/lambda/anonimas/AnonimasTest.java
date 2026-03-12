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
        anonima.consumer("Teste Anonima"); //Devido a ser Object poderia ser também:
        //anonima.consumer(20);



        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer("Teste Lambda");//Devido a ser Object poderia ser também:
        //anonimaLambda.consumer(10);

        gettingInterfaceAsParameter((Object value) -> System.out.println(value));

    }

    private static void gettingInterfaceAsParameter(MyEventConsumer anonLambda) {
        anonLambda.consumer(100000);
    }
}