/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.singleton;

public class Singleton {

    private Singleton singleton;

    private Singleton() {

    }

    public Singleton getInstance() {
        if (this.singleton == null) {
            this.singleton = new Singleton();
        }
        return this.singleton;
    }
}
