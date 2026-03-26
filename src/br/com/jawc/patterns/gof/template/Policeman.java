/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.template;

public class Policeman extends Worker{
    @Override
    protected void working() {
        System.out.println("Policeman working");
    }
}
