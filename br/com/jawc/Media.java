/**
 * @author jawc
 */
package br.com.jawc;

public class Media {

    public static void main(String[] args) {
        calculoMedia();

    }

    public static void calculoMedia() {
        int nota1 = 5;
        int nota2 = 7;
        int nota3 = 8;
        int nota4 = 9;

        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A media das notas foi de " + media);
    }
}
