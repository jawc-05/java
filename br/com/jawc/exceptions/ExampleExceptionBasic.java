/**
 * @author jawc-05
 */
package br.com.jawc.exceptions;

public class ExampleExceptionBasic {

    public static void main(String[] args) {

    }

    private static void comExceptionTreatment(){
        String phrase = null;
        String newPhrase = null;

        try{
            newPhrase = phrase.toUpperCase();
        }catch(NullPointerException e){
            //Tratamento da Exceção:
            System.out.println("A frase inicial está nula");
            phrase = "Frase Vazia";
            newPhrase = phrase.toUpperCase();
        }finally{
            newPhrase = phrase.toUpperCase();
        }
        System.out.println("Frase Antiga: "+ phrase);
        System.out.println("Frase Nova: "+ newPhrase);
    }
}