/**
 * @author jawc
 */

package br.com.jawc.abstratas;

public class Programa {

    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("111111");
        empregado.setNome("Jawc");
        empregado.setSobrenome("Cunha");
        empregado.setSalario(100d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2222222");
        comissionado.setNome("Jawc2");
        comissionado.setSobrenome("Cunha2");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("33333");
        horista.setNome("Jawc3");
        horista.setSobrenome("Cunha3");
        horista.setHoraTrabalhada(8d);
        horista.setPrecoHora(80d);
        imprimir(horista);
    }

    public static void imprimir(Empregado funcionario){
        System.out.println(funcionario.getNome() + " " + funcionario.getSobrenome() + " Tem um salário de: " + funcionario.vencimento());
    }
}
