package Ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println("Cat's name: ");
        String name = sc.next();
        gato.setName(name);
        System.out.println("Cat's age: ");
        int age = sc.nextInt();
        gato.setAge(age);

        System.out.println("Dog's name: ");
        name = sc.next();
        cachorro.setName(name);
        System.out.println("Dog's age: ");
        age = sc.nextInt();
        cachorro.setAge(age);

        System.out.println("The cat's name is " + gato.getName() + " and is " + gato.getAge() + " years old.");
        gato.emitirSom();

        System.out.println("The dog's name is " + cachorro.getName() + " and is " + cachorro.getAge() + " years old.");
        cachorro.emitirSom();
    }
}
