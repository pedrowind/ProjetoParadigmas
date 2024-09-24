package CapitaoPatria;


public class Main {
    public static void main(String[] args) {
        CapitaoPatria capitaoPatria = new CapitaoPatria(85);

        int insanidade = capitaoPatria.getInsanidade();

        System.out.println("Insanidade Inicial: " + insanidade);

        if (insanidade == 0) {
            System.out.println("Capitão Pátria está são");
        } else if (insanidade > 0 && insanidade <= 25) {
            System.out.println("Capitão Pátria está começando a ficar insano");
        } else if (insanidade > 25 && insanidade <= 50) {
            System.out.println("Capitão Pátria está ficando insano");
        } else if (insanidade > 50 && insanidade <= 75) {
            System.out.println("Capitão Pátria está muito insano");
        } else if (insanidade > 75 && insanidade <= 100) {
            System.out.println("Capitão Pátria está completamente insano");
            System.out.println("Capitão Pátria está tomando leite...");
            while (capitaoPatria.getInsanidade() > 0) {
                capitaoPatria.tomarLeite();
                System.out.println("Insanidade Diminuindo... " + capitaoPatria.getInsanidade());
            }
            capitaoPatria.pararDeTomarLeite();
        } else {
            System.out.println("Capitão Pátria está em um nível de insanidade desconhecido");
        }

        System.out.println("Insanidade Final: " + capitaoPatria.getInsanidade());
    }
}