/**
 * @author jawc
 */
package br.com.jawc.exceptions;

public class ExampleThrow {
    public static void saque (double valor) throws LimitWithdrawException{
        if (valor > 400){
            LimitWithdrawException erro =
                    new LimitWithdrawException("O valor solicitado passa o limite diário que pode ser sacado nessa conta");
            throw erro;
        }else{
            System.out.println("Saldo retirado da conta: "+valor+"$");
        }
    }

    public static void withdrawRuntimeException (double valor){
        if (valor > 400){
            IllegalArgumentException erro =
                    new IllegalArgumentException("Valor solicitado é maior que o limite diario.");
            throw erro;
        }else{
            System.out.println("Saldo retirado da conta: "+valor+"$");
        }
    }
}
