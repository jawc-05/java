/**
 * @author jawc
 */
package br.com.jawc.annotation;

@AnnotationExample(value = "João", bairros = "CEE")
public class ClassWithAnnotation {

    @AnnotationExample(value = "Alfredo", bairros = {"Cee", "Cruzeiro"})
    private String nome;
}
