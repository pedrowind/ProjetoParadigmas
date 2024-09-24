package Ex5;

public class FuncionarioCLT extends Funcionario {
    private double beneficio;

    public FuncionarioCLT(String nome, double salario, double beneficio) {
        super(nome, salario);
        this.beneficio = beneficio;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + beneficio;
    }
}