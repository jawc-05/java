/**
 * @author jawc
 */

package br.com.jawc.CRUDmemoria;

import br.com.jawc.CRUDmemoria.dao.ClienteMapDAO;
import br.com.jawc.CRUDmemoria.dao.IClienteDAO;
import br.com.jawc.CRUDmemoria.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO IClienteDAO;

    public static void main(String[] args) {
        IClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.PLAIN_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alterar e 5 para sair",
                    "Cadastro", JOptionPane.ERROR_MESSAGE);
        }

        if (isOpcaoCadastro(opcao)) {
            JOptionPane.showMessageDialog(null, "Opção: " + opcao, "ERRO",JOptionPane.ERROR_MESSAGE);

        }

    }

    private static void sair() {

    }

    private static boolean isOpcaoValida(String opcao) {
        if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") || opcao.equals("5")){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
}
