/**
 * @author jawc-05
 */
package br.com.jawc.streams.intermediates;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        Stream<String> lista = List.of("joao", "teste", "alfredo").stream();

        Stream<String> set = Set.of("João", "Alfredo", "Teste").stream();

        Map<String, String> map = Map.of("João", "Alfredo");
        Stream<String> keys = map.keySet().stream();
        Stream<String> values = map.values().stream();

    }
}