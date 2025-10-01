/**
 * @author jawc-05
 */
package br.com.jawc.carros;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(new Civic("Honda", "Type-R", 2025));
        carros.add(new Corolla("Toyota", "GR", 2025));
        carros.add(new Jetta("Volkswagen", "TSI", 2025));
        carros.add(new Fusion("Ford", "Titanium", 2025));
    }
}