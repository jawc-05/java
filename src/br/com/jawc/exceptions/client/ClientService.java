/**
 * @author jawc
 */
package br.com.jawc.exceptions.client;

public class ClientService {

    public static void searchClient(String code) throws ClientNotFound2Exception {
        try{
            ClientDAO.searchClient(code);
        } catch (ClientNotFoundException e) {
            throw new ClientNotFound2Exception(e.getMessage(),e);
        }
    }
}
