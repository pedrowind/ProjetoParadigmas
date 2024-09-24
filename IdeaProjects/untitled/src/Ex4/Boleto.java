package Ex4;

public class Boleto implements Pagamento {
    private double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Boleto de valor: R$" + valor + " pago com sucesso.");
    }
}

