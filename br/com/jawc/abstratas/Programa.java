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
        System.out.println(empregado.getNome() + " "+ empregado.getSobrenome() + " tem um salário de: " + empregado.vencimento());

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2222222");
        comissionado.setNome("Jawc2");
        comissionado.setSobrenome("Cunha2");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(0.1d);
        System.out.println(comissionado.getNome() + " " + comissionado.getSobrenome() + " Tem um salário de: " + comissionado.vencimento());

        Horista horista = new Horista();
        horista.setCpf("33333");
        horista.setNome("Jawc3");
        horista.setSobrenome("Cunha3");
        horista.setHoraTrabalhada(8d);
        horista.setPrecoHora(80d);
        System.out.println(horista.getNome() + " " + horista.getSobrenome() + " Tem um salário de: " + horista.vencimento());
    }
}
