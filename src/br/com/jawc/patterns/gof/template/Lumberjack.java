/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.template;

public class Lumberjack extends Worker {
    @Override
    protected void working() {
        System.out.println("Lumberjack working");
    }

    @Override
    protected void getUp() {
        System.out.println("Lumberjack getting up from bed at 6 o clock");
    }
}
