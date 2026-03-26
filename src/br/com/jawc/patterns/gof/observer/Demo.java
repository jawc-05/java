/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.observer;

public class Demo {

    public static void main(String[] args) {
        Journalist jour = new Journalist();
        jour.registerObserver(new Newspaper());
        jour.registerObserver(new Tv());

        jour.publish("Title", "summary", "Image", "Text here");
    }
}
