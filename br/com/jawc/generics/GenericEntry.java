package br.com.jawc.generics;

public class GenericEntry<T> {

    private T data;

    public GenericEntry(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
