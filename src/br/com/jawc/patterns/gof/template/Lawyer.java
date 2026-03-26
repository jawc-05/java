/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.template;

public class Lawyer extends Worker{
    @Override
    protected void working() {
        System.out.println("Lawyer working");
    }

    @Override
    protected void getUp() {
        System.out.println("Lawyer getting up from bed at 6 o clock");
    }
}
