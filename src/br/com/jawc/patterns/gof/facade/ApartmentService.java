/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.facade;

public class ApartmentService implements IApartmentService{

    private void findAddress(){

    }
    private void findPhone(){

    }
    private void findTotalValue(){

    }

    @Override
    public void rentApartment(Apartment apartment) {
        findAddress();
        findPhone();
        findTotalValue();
    }
}
