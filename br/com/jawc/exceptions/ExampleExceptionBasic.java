/**
 * @author jawc-05
 */
package br.com.jawc.exceptions;

public class ExampleExceptionBasic {

    public static void main(String[] args) {
        withExceptionTreatment();
        throwException();
    }

    private static void withExceptionTreatment(){
        String phrase = null;
        String newPhrase = null;

        try{
            newPhrase = phrase.toUpperCase();

        }catch(Exception e){
            //Tratamento da Exceção:
            System.out.println("A frase inicial está nula, por isso foi atribuído um valor default");
            phrase = "Frase Vazia";
            newPhrase = phrase.toUpperCase();
        }finally{
            newPhrase = phrase.toUpperCase();
        }
        System.out.println("Frase Antiga: "+ phrase);
        System.out.println("Frase Nova: "+ newPhrase);
    }

    private static void throwException(){
        try{
            String phrase = null;
            String newPhrase = null;
            newPhrase = phrase.toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException("Parando o sistema");
        }
        System.out.println("TESTE");
    }


    private static void exception(){
        try{
            ExemploThrow.saque(500);
        }catch (LimiteSaqueException){
            System.out.println("ERRO: "+e.getMessage());
        }
    }

    private static void saque (double valor) throws LimiteSaqueException{

        if (valor > 400){
            LimiteSaqueException erro =
                    new LimiteSaqueException("O valor solicitado passa o limite diário que pode ser sacado nessa conta");
            throw erro;
        }else{
            System.out.println("Saldo retirado da conta: "+valor+"$");
        }
    }
}