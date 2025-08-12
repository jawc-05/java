/**
 * @author jawc
 */

package br.com.jawc.agregacao;

public class Programa{

    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 800d, "TV");
        Produto produtoCell = criarProduto(2L, 10000d, "Celular");

        Vendedor vendedor = criarVendedor("Jawc", 10d);

        Comprador comprador = criarComprador("jawc2", 5000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCell);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador(String nome, double verba) {
        Comprador comprador = new Comprador(nome, verba); //USEI UM CONSTRUTOR AO INVÉS DOS OUTROS
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome){
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
