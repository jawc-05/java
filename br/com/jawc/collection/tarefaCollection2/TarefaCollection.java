/**
 * @author jawc
 */

package br.com.jawc.collection.tarefaCollection2;

import java.util.*;

public class TarefaCollection {

    public static void main(String[] args) {
        List<Pessoa> pessoas = pegarNomesESexo();
        Map<String, List<Pessoa>> grupos = separarPorSexo(pessoas);
        exibirSexos(grupos);
    }

    private static List<Pessoa> pegarNomesESexo(){
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        String continuar;
        do{
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite seu sexo (M/F): ");
            String sexo = sc.nextLine().toUpperCase();

            pessoas.add(new Pessoa(nome, sexo));

            System.out.println("Deseja adicionar outra pessoa? (S/N)");
            continuar = sc.nextLine().toUpperCase();
        }while (continuar.equals("S"));

        return pessoas;
    }

    private static Map<String, List<Pessoa>> separarPorSexo(List<Pessoa> pessoas){
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();

        for (Pessoa p : pessoas){
            if (p.getSexo().equals("M")){
                masculinos.add(p);
            } else if (p.getSexo().equals("F")){
                femininos.add(p);
            }
        }
        Map<String, List<Pessoa>> grupos = new HashMap<>();
        grupos.put("M", masculinos);
        grupos.put("F", femininos);

        return grupos;
     }

     private static void exibirSexos(Map<String, List<Pessoa>> grupos){
        System.out.println("\nGrupo Masculino:");
        for (Pessoa p : grupos.get("M")){
            System.out.println(p.getNome());
        }

        System.out.println("\nGrupo Feminino:");
        for (Pessoa p : grupos.get("F")){
            System.out.println(p.getNome());
        }
     }
}
