/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new ApartmentService();
        service.rentApartmente();
    }
}
