/**
 * @author jawc
 */
package br.com.jawc.loops;
import java.util.Scanner;

public class TarefaControleFluxo {

    public static void main(String[] args) {
        int[] notas = inputs();
        double media = calcMedia(notas);
        aprovedOrNot(media);
    }

    public static int[] inputs(){
        Scanner s = new Scanner(System.in);
        int notas[] = new int[4];
        System.out.println("Digite a nota 1: ");
        notas[0] = s.nextInt();
        System.out.println("Digite a nota 2: ");
        notas[1] = s.nextInt();
        System.out.println("Digite a nota 3: ");
        notas[2] = s.nextInt();
        System.out.println("Digite a nota 4: ");
        notas[3] = s.nextInt();
        return notas;
    }

    public static double calcMedia(int[] notas){
        int soma = 0;
        for(int nota : notas){
            soma += nota;
        }
        double media  = (double)soma / notas.length;
        System.out.println("A média do aluno foi de: " +media+" pontos.");
        return media;
    }

    public static void aprovedOrNot(double media){

        if(media >= 7.00){
            System.out.println("Parabéns você foi aprovado!");
        }else if(media >= 5.00 && media < 7.00){
            System.out.println("Você está de recuperação :(");
        }else{
            System.out.println("Infelizmente você reprovou :((");
        }
    }
}
