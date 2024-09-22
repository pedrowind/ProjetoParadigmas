package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    private List<Funcionario> funcionarioList;

    public Empresa() {
        this.funcionarioList = new ArrayList<>();
    }

    //Função para adicionar os funcionarios no Array
    public void adicionarFuncionario(int id, String name, String position, double salary) {
        funcionarioList.add(new Funcionario(id, name, position, salary));
    }

    //Função para alterar quaisquer dados do funcionario
    public void alterarFuncionario(int id, String name, String position, double salary) {
        for(Funcionario f : funcionarioList) {
            if (f.getId() == id) {
                f.setName(name);
                f.setPosition(position);
                f.setSalary(salary);
            }
        }
    }

    //Função para obter quantos funcionarios a empresa possui
    public void obterFuncionarios() {
        if (!funcionarioList.isEmpty()) {
            System.out.println(funcionarioList);
        } else {
            throw new RuntimeException("Empty");
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner sc = new Scanner(System.in);
        String name;
        String position;
        double salary;
        int id;

        for (id = 1; id <= 3; id++) {
            System.out.println("Name: ");
            name = sc.next();
            System.out.println("Position: ");
            position = sc.next();
            System.out.println("Salary: ");
            salary = sc.nextDouble();

            empresa.adicionarFuncionario(id, name, position, salary);
        }

        empresa.obterFuncionarios();

        System.out.println("Change something? Type 1 for Yes");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("Changing...");
            System.out.println("Which ID? ");
            id = sc.nextInt();
            System.out.println("Name: ");
            name = sc.next();
            System.out.println("Position: ");
            position = sc.next();
            System.out.println("Salary: ");
            salary = sc.nextDouble();

            empresa.alterarFuncionario(id, name, position, salary);

            System.out.println("Changed.");
        }
        else {
            return;
        }
        empresa.obterFuncionarios();
    }
}
