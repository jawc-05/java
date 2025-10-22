/**
 * @author jawc
 */
package br.com.jawc.annotation;

@AnnotationExample(value = "João", bairros = "CEE", numCasa = 55)
public class ClassWithAnnotation {

    @AnnotationExample(value = "Alfredo", bairros = {"Cee", "Cruzeiro"}, numCasa = 105)
    private String nome;
}
