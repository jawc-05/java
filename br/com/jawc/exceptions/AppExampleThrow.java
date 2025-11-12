/**
 * @author jawc-05
 */
package br.com.jawc.exceptions;

public class AppExampleThrow {

    public static void main(String[] args) {

    }

    private static void runtimeException(){
        ExampleThrow.withdrawRuntimeException(500);
    }

    private static void exception(){
        try{
            ExampleThrow.withdraw(500);
        } catch (LimitWithdrawException erro){
            System.out.println("ERRO: " + erro.getMessage());
        }
    }
}