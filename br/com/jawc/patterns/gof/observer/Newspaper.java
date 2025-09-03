/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.observer;

public class Newspaper implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof Journalist) {
            Journalist journalist = (Journalist) subject;
            System.out.println("notifying msg for newspaper : " + journalist.toString());
        }
    }
}
