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
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alterar e 5 para sair",
                    "Cadastro", JOptionPane.ERROR_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)){
                sair();
            }else if (isOpcaoCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            }else if (isOpcaoConsulta(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF", "Consulta", JOptionPane.INFORMATION_MESSAGE);
                buscar(dados);
            }else if (isOpcaoExcluir(opcao)){

            }else if (isOpcaoAlterar(opcao)){

            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alterar e 5 para sair",
                    "Cadastro", JOptionPane.ERROR_MESSAGE);

        }

    }

    private static void buscar(String dados) {
        //Validar se foi passado somente o CPF
        Cliente cliente = IClienteDAO.buscar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null,"Cliente encontrado: " + cliente.toString(),  "Sucesso",  JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Cliente não encontrado" , "Erro",  JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        //TentarValidar se todos os campos estao preenchidos
        //Se não tiver, passar null no construtor onde o valor é nulo

        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado =  IClienteDAO.cadastrar(cliente);
        if (isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso", "Sucesso",  JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Cliente já se encontra cadastrado", "Erro",   JOptionPane.ERROR_MESSAGE);
        }

    }

    private static boolean isOpcaoAlterar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoConsulta(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo", "Sair",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
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
