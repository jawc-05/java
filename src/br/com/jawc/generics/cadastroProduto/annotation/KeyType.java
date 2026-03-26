/**
 * @author jawc
 */
package br.com.jawc.generics.cadastroProduto.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface KeyType {

    String value();
}
