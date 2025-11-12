/**
 * @author jawc-05
 */
package br.com.jawc.exceptions;

public class AppExampleThrow {

    public static void main(String[] args) {
        exception();
        //runtimeException();
    }

    // UM ERRO DESSA FORMA FAZ COM QUE A APLICAÇÃO PARE DE FUNCIONAR, NÃO TENDO TRATAMENTO ALGUM
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