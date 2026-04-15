package AULA_04;

class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;

    public Produto(String nome, String categoria, double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String exibirResumo() {
        return "Produto: " + nome + ", Categoria: " + categoria + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}
public class Polimorfismo {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", "Eletrônicos", 3500.00, 10);
        Produto p2 = new Produto("Camiseta", "Roupas", 50.00, 100);
        Produto p3 = new Produto("Cadeira", "Móveis", 200.00, 20);

        System.out.println(p1.exibirResumo());
        System.out.println(p2.exibirResumo());
        System.out.println(p3.exibirResumo());
    }

}
