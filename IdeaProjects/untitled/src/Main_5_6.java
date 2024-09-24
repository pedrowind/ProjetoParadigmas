import Ex5.FuncionarioCLT;
import Ex5.FuncionarioPJ;
import Ex6.Biblioteca;
import Ex6.Livro;

public class Main_5_6 {
    public static void main(String[] args) {
        // exercicio 5

        FuncionarioPJ pj = new FuncionarioPJ("João", 160, 50);
        FuncionarioCLT clt = new FuncionarioCLT("Maria", 2000, 500);

        System.out.println("Salário de " + pj.getNome() + ": " + pj.calcularSalario());
        System.out.println("Salário de " + clt.getNome() + ": " + clt.calcularSalario());

        // exercicio 6

        Biblioteca b = new Biblioteca(
                "Biblioteca Central",
                "Rua da Biblioteca, 123",
                "1234-5678",
                "123@123.co",
                new Livro[] {
                        new Livro(
                                "Java Como Programar",
                                "Deitel",
                                2015,
                                "Pearson",
                                1000,
                                200,
                                10
                        ),
                        new Livro(
                                "Use a Cabeça Java",
                                "Sierra & Bates",
                                2005,
                                "Alta Books",
                                500,
                                100,
                                5
                        ),
                        new Livro(
                                "Java Eficaz",
                                "Joshua Bloch",
                                2008,
                                "Alta Books",
                                300,
                                80,
                                3
                        )
                }
        );

        System.out.println("Livros da " + b.getNome() + ":");
        for (Livro l : b.getLivros()) {
            System.out.println(l.getTitulo() + " - " + l.getAutor() + " - " + l.getQuantidadeEstoque() + " unidades");
        }
    }
}
