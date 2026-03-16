/**
 * @author jawc
 */
package br.com.jawc.lambda.anonimas;

public class WhenUseParentesis {

    public static void main(String[] args) {
        MyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent2 = (s) -> {
            System.out.println(s);
        };

        //Utilizar principalmente sempre os dois primeiros para ser mais profissional, creio eu

        MyEventConsumer myEvent3 = s -> System.out.println(s);


        //Se tiver return tem q ter {} mas não necessariamente o ()
        MyEventConsumerReturn ret = (s) ->{
            System.out.println(s);
            return s;
        };
    }
}
