/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.template;

public abstract class Worker {

    public void executeRoutine(){
        startRoutine();
        getUp();
        eatBreakfast();
        goingToWork();
        working();
        goingToWork();
    }

    protected abstract void working();

    private void startRoutine(){
        System.out.println("Starting routine");
    }

    protected void getUp(){
        System.out.println("Getting up from bed");
    }

    private void eatBreakfast(){
        System.out.println("Eating breakfast");
    }

    private void goingToWork(){
        System.out.println("Going to work");
    }

    private void goingToHome(){
        System.out.println("Going back to home");
    }
}
