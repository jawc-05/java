/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.template;

public class Lumberjack extends Worker {
    @Override
    protected void working() {
        System.out.println("Lumberjack working");
    }
}
