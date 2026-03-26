/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.template;

public class Firefighter extends Worker {

    @Override
    protected void working() {
        System.out.println("Firefighter working");
    }
}
