/**
 * @author jawc
 */
package br.com.jawc.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface AnnotationExample {
    String value();
}
