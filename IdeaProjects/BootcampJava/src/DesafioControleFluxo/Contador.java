package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira os números desejados, sendo o primeiro menor que o segundo:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            conferirValor(num1, num2);

            for (int i = num1; i < num2; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro numero deve ser menor que o segundo.");
        }
    }
    static void conferirValor (int num1, int num2) throws ParametrosInvalidosException {

        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        }
    }
}
