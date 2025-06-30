/**
 * @author jawc
 */
package br.com.jawc.loops;
import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número para gerar a tabuada: ");
        int num = s.nextInt();
        for (int i = 0; i<=10; i++){
            System.out.println(num + " X " + i + " = "+ num*i);
        }
    }
}
