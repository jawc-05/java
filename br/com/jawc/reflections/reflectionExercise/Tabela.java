/**
 * @author jawc
 */
package br.com.jawc.reflections.reflectionExercise;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {
    String name();
    String description();
    int code();
}
