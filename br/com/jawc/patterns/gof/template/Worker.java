/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.template;

public abstract class Worker {

    public void executeRoutine(){
        startRoutine();
        getUp();

    }

    private void startRoutine(){
        System.out.println("Starting routine");
    }

    private void getUp(){
        System.out.println("Getting up from bed");
    }
}
