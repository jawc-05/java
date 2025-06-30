/**
 * @author jawc
 */
package br.com.jawc.loops;
import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número? ");
        String resposta = s.nextLine();

        while(resposta.equalsIgnoreCase("Sim")){
            System.out.println("Digite um número para a tabuada ser gerada: ");
            int num = s.nextInt();
            for (int i = 0; i <=10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar novamente a tabuada de algum número? ");
            resposta = s.next();

        }System.out.println("Obrigado");
    }
}
