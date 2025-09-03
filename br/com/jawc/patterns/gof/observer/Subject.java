/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.observer;


public interface Subject {

    void registerObserver(Observers observer);
    void removeObserver(Observers observer);
    void notifyObserver();
}
