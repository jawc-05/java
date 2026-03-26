/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.observer;

public class Tv implements Observers {
    @Override
    public void update(Subject subject) {
        if (subject instanceof Journalist) {
            Journalist journalist = (Journalist) subject;
            System.out.println("notifying msg from television : " + journalist.toString());
        }
    }
}
