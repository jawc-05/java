/**
 * @author jawc-05
 */
package br.com.jawc.carros;

import br.com.jawc.carros.abstracts.Carro;
import br.com.jawc.carros.concretes.Civic;
import br.com.jawc.carros.concretes.Corolla;
import br.com.jawc.carros.concretes.Fusion;
import br.com.jawc.carros.concretes.Jetta;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<Carro>();
        insertLists(carros);
        read(carros);
    }

    private static void insertLists(List<Carro> carros){
        carros.add(new Civic("Honda", "Type-R", 2025));
        carros.add(new Corolla("Toyota", "GR", 2025));
        carros.add(new Jetta("Volkswagen", "TSI", 2025));
        carros.add(new Fusion("Ford", "Titanium", 2025));
    }

    private static void read(List<Carro> carros){
        for (Carro carro : carros){
            carro.dirigir();
        }
    }
}