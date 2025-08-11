/**
 * @author jawc
 */

package br.com.jawc.collection.tarefa_colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tarefa1 {

    public static void main(String[] args) {

    }
    public static void inputNomes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgula(,): ");
        String nomes = sc.nextLine();

        String[] nomesArray = nomes.split(",");
        List<String> nomesLista = new ArrayList<>(Arrays.asList(nomesArray));
    }

    public static void ordenaPrint(){

    }
}
