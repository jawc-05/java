/**
 * @author jawc
 */
package br.com.jawc.loops;

public class Break {

    public static void main(String[] args) {

        for (int contador = 1; contador <=1000; contador++){
            System.out.println("Esta é a repetição número: " +contador);
            if (contador == 10)
                break;
        }
    }
}
