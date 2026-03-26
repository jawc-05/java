/**
 * @author jawc
 */

package br.com.jawc.collection.tarefa_colecoes;

import java.util.*;

public class Tarefa1 {

    public static void main(String[] args) {
    List<String> nomesLista = inputNomes();
    ordenaPrint(nomesLista);
    }
    private static List<String> inputNomes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgula(,): ");
        String nomes = sc.nextLine();

        String[] nomesArray = nomes.split(",");
        return new ArrayList<>(Arrays.asList(nomesArray));
    }

    private static void ordenaPrint(List<String> nomesLista){
        Collections.sort(nomesLista);
        System.out.println("Nomes em ordem Alfabética: ");
        for(String nome : nomesLista){
            System.out.println(nome);
        }
    }
}
