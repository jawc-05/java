/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.facade;

public class ApartmentService implements IApartamentoService{

    private void findAddress(){

    }
    private void findPhone(){

    }
    private void findTotalValue(){

    }

    @Override
    public void rentApartmente() {
        findAddress();
        findPhone();
        findTotalValue();
    }
}
