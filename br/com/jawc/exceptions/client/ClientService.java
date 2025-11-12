/**
 * @author jawc
 */
package br.com.jawc.exceptions.client;

public class ClientService {

    public static void searchClient(String code) throws ClientNotFoundException {
        ClientDAO.searchClient(code);
    }
}
