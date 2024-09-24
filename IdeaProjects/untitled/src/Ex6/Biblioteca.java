package Ex6;

public class Biblioteca {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Livro[] livros;

    public Biblioteca(String nome, String endereco, String telefone, String email, Livro[] livros) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
