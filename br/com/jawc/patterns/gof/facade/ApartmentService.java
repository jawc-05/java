/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.facade;

public class ApartmentService implements IApartamentoService{

    public void findAddress(){

    }
    public void findPhone(){

    }
    public void findTotalValue(){

    }

    @Override
    public void rentApartmente() {
        findAddress();
        findPhone();
        findTotalValue();
    }
}
