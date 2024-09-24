package Ex4;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito(1000, "1234567890123456");
        Boleto boleto = new Boleto(100);

        cartao.realizarPagamento(500);
        cartao.realizarPagamento(1500);
        boleto.realizarPagamento(boleto.getValor());
    }
}