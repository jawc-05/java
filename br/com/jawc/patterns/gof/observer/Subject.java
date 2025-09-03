/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.observer;

import java.util.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
