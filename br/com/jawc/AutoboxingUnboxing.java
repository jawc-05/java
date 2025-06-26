/**
 * @author jawc
 */
package br.com.jawc;

public class AutoboxingUnboxing {

    public static void main(String[] args) {

        //Autoboxing
        Boolean status = true;
        Character c = 'C';
        Integer i = 1;
        Long CPF = 00000000005l;

        //Unboxing
        boolean status2 = Boolean.FALSE;
        char letra = Character.valueOf('A');
        int idade = Integer.valueOf(12);
        long cpf = Long.valueOf(123123123123l);
    }
}
