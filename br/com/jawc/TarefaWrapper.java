/**
 * @author jawc
 */
package br.com.jawc;

import java.util.Scanner;

public class TarefaWrapper {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Você tem "+idade+ " anos de idade");
        int idade2 = Integer.valueOf(idade);
        System.out.println("Você tem "+idade2+ " anos de idade, utilizando wrapper");
    }
}
