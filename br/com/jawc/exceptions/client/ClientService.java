/**
 * @author jawc
 */
package br.com.jawc.exceptions.client;

public class ClientService {

    public void searchClient(String code) throws ClientNotFoundException {
        //BUSCA NO BANCO DE DADOS
        boolean isSigned = false;

        if (!isSigned) {
            throw new ClientNotFoundException("Cliente não foi encontrado!");
        }
    }
}
