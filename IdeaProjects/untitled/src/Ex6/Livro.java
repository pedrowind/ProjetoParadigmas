package Ex6;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private int numeroPaginas;
    private double preco;
    private int quantidadeEstoque;

    public Livro(String titulo, String autor, int anoPublicacao, String editora, int numeroPaginas, double preco, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void venderLivro(int quantidade) {
        if (quantidadeEstoque >= quantidade) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
