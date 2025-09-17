package br.com.jawc.generics;

public class GenericEntry<T, E> {

    private T data;
    private E codigo;



    public GenericEntry(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public E getCodigo() {
        return codigo;
    }
}
