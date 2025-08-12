/**
 * @author jawc
 */

package br.com.jawc.agregacao;

public class Programa{

    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 800d, "TV");
        Produto produtoCell = criarProduto(2L, 10000d, "Celular");
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome){
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
