import model.Produto;

public class Main {
    public static void main(String[] args) {


        Produto produto = new Produto();


        //produto.nome = "Escova de dentes";
        //produto.preco = 25.00;
        //produto.quantidade = 30;
        //produto.tipo = "Higiene pessoal";

        int x = 10;

        produto.setPreco(25.00);
        produto.setQuantidade(x);
        produto.setNome("Escova de dentes");
        produto.setTipo("Higiene Pessoal");

        System.out.println(produto);

        System.out.println();

        produto.setPreco(10.99);
        produto.removeQuantidade(2);

        System.out.println("Preço " + produto.getPreco());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Tipo: " + produto.getTipo());
}}