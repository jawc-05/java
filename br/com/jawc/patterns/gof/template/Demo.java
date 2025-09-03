/**
 * @author jawc
 */

package br.com.jawc.patterns.gof.template;

public class Demo {

    public static void main(String[] args) {
        Worker f = new Firefighter();
        f.executeRoutine();
        Worker p = new Policeman();
        p.executeRoutine();
        Worker l = new Lumberjack();
        l.executeRoutine();
    }
}
