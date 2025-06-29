/**
 * @author jawc
 */
package br.com.jawc.ifElse;

import java.util.Scanner;

public class ExampleInt {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int result = s.nextInt();

        if (result == 1) {
            System.out.println("Resultado igual a 1");
        }
        else if (result >1 && result<=5){
            System.out.println("Resultado está entre 1 e 5");
        }else if (result >=5 && result<=8){
            System.out.println("Resultado está entre 5 e 8");
        }else {
            System.out.println("Resultado diferente dos anteriores");
        }

    }
}
