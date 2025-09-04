/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.facade;

public class Demo {

    public static void main(String[] args) {
        IApartmentService service = new ApartmentService();
        service.rentApartment();
    }
}
