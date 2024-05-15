package ContaBancaria;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, insira o numero da conta: ");
        conta.conta = sc.nextInt();

        System.out.println("Por favor, insira o numero da agencia: ");
        conta.agencia = sc.next();

        System.out.println("Por favor, insira o seu nome: ");
        conta.nome = sc.next();

        System.out.println("Olá, " + conta.nome + "! Voce possui registro na conta: " + conta.conta + ", com numero de agencia: " + conta.agencia + ", e seu saldo é R$" + conta.saldo);

    }
}
