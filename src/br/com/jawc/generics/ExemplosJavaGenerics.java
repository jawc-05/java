/**
 * @author jawc
 */
package br.com.jawc.generics;

import br.com.jawc.generics.fruta.Banana;
import br.com.jawc.generics.fruta.Fruta;
import br.com.jawc.generics.fruta.Maca;

import java.util.ArrayList;
import java.util.List;

public class ExemplosJavaGenerics {

    public static void main(String args[]) {
        List<String> lista = new ArrayList();
        lista.add("Rodrigo");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList();
        listaLong.add(1l);
        listaLong.add(2l);
        imprimir(listaLong);

        String primeiroSt = pegarPrimeiroLista(lista);
        System.out.println(primeiroSt);

        Long primeiroLong = pegarPrimeiroLista(listaLong);
        System.out.println(primeiroLong);

        List<Fruta> listaFruta = new ArrayList<>();
        listaFruta.add(new Banana());
        listaFruta.add(new Maca());
        imprimirFrutas(listaFruta);

//        Long primeiroLong1 = pegarPrimeiroListaLong(lista);
//        System.out.println(primeiroLong1);

    }

    public static void imprimirFrutas(List<? extends Fruta> frutas) {
        for (Fruta fruta : frutas) {
            System.out.println(fruta);
        }
    }

    public static void imprimir2(List<?> lista) {
        for (Object st : lista) {
            if (st instanceof Long) {
                Long stLong = (Long) st;
                System.out.println(stLong);
            }
            System.out.println("Qualquer coisa: " + st);
        }
    }

    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista) {
        return lista.get(0);
    }

}
