/**
 * @author jawc
 */

package br.com.jawc.array;

public class ExampleBubbleSortFixed {

    public static void main(String[] args) {
    int [] vet = {43,22,12,15,3};
    int aux = 0;
    int i = 0;

    System.out.println("Vetor desordenado: ");
    for(i = 0; i < vet.length; i++){
        System.out.println(vet[i]);
    }
    System.out.println("  ");

    for(i = 0; i < vet.length; i++){
        for(int j = 0; j<4;j++){
            if(vet[j] > vet[j+1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
    System.out.println("Vetor ordenado: ");
    for(i = 0; i < vet.length; i++){
        System.out.println(vet[i]);
    }
    }

}
