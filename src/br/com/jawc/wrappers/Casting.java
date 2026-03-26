/**
 * @author jawc
 */
package br.com.jawc.wrappers;

public class Casting {

    public static void main(String[] args) {
        //casting explicito
        int num1 = 10;
        short num2 = (short) num1;
        long numl = 111111111111111111l;
        System.out.println(numl);
        int num4 = (int) numl;
        System.out.println(num4);
        int i1 = 1;
        byte b1 = (byte) i1;



        //Casting Implicito
        int idade = 18;
        long idadeL = idade;
        byte bi = 23;
        short biS = bi;




    }
}
