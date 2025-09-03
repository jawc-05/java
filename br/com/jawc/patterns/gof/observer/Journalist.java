/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject {

    private List<Observers> observers = new ArrayList<>();
    private String title, summary, image, text;

    public List<Observers> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observers> observers) {
        this.observers = observers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void publish(String title, String summary, String image, String text) {
        this.title = title;
        this.summary = summary;
        this.image = image;
        this.text = text;
        notifyObserver();
    }


    @Override
    public void registerObserver(Observers observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observers observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public String toString() {
        return "Journalist{" +
                "observers=" + observers +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", image='" + image + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
