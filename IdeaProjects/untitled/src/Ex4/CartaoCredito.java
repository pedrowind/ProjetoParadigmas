package Ex4;

public class CartaoCredito implements Pagamento {
    private double limite;
    private String numeroCartao;

    public CartaoCredito(double limite, String numeroCartao) {
        this.limite = limite;
        this.numeroCartao = numeroCartao;
    }

    private String getFinalCartao(String numeroCartao) {
        return numeroCartao.substring(numeroCartao.length() - 4);
    }

    @Override
    public void realizarPagamento(double valor) {
        if (valor > limite) {
            System.out.println("Falha no pagamento de R$" + valor + ", limite insuficiente!");
            return;
        }

        System.out.println("Pagamento de R$" + valor + " realizado no crédito com cartão de final "
                + getFinalCartao(numeroCartao) + ".");
    }
}