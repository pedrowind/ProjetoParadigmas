package Ex3;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(5, 10);

        System.out.println("Circulo area: " + circulo.calcularArea());
        System.out.println("Retangulo area: " + retangulo.calcularArea());
    }
}
