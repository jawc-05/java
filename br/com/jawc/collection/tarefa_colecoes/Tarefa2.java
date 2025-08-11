/**
 * @author jawc
 */

package br.com.jawc.collection.tarefa_colecoes;

import java.util.*;

public class Tarefa2 {

    public static void main(String[] args) {
        Map<String, List<String>> mapa = inputNomes();
        print(mapa);
    }
    private static Map<String, List<String>> inputNomes(){
        Map<String, List<String>> mapa = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome e sexo(Ex: Joao-M,Ana-F: )");
        String linha = sc.nextLine();

        String[] pares = linha.split(",");
        for (String p : pares){
            String[]  partes = p.split("-");
            if (!mapa.containsKey(partes[1])){
                mapa.put(partes[1], new ArrayList<String>());
            }mapa.get(partes[1]).add(partes[0]);
        }
        return mapa;
    }

    private static void print(Map<String, List<String>> mapa){
        for (String sexo : mapa.keySet()) {
            if (sexo.equals("M")) {
                System.out.println("Nomes de Homens:");
                System.out.println(mapa.get("M"));
            } else if (sexo.equals("F")) {
            System.out.println("Nomes de Mulheres:");
            System.out.println(mapa.get("F"));
        }
    }
}}
