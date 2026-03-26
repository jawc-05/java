/**
 * @author jawc
 */
package br.com.jawc.lambda.anonimas;

@FunctionalInterface
public interface MyEventConsumerReturn<T> {

    public T consumer(Object value);
}
