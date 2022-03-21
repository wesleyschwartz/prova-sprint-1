package funcionario;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos funcionarios deseja cadastrar ?");

        int n = ler.nextInt();

        Funcionario[] funcionarios = new Funcionario[n];
        String nome = "";
        Double salario = 0D;

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Qual é o nome do funcionário " + (i + 1) + "?");
            nome = ler.next();
            System.out.println("Qual é o salário do funcionário " + (i + 1) + "?");
            salario = ler.nextDouble();
            funcionarios[i] = new Funcionario(nome, salario);
        }
        NumberFormat formatado = new DecimalFormat("0.00");
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].getSalario() < 2000) {
                System.out.println("\nFuncionário " + funcionarios[i].getNome()
                        + "\n Salário: " + formatado.format(funcionarios[i].getSalario())
                        + "\n Bonus: " + formatado.format(funcionarios[i].getBonusOuDesconto())
                        + "\n Salário Liquido: " + formatado.format(funcionarios[i].getSalarioLiquido()));
            } else {
                System.out.println("\nFuncionário " + funcionarios[i].getNome()
                        + "\n Salário: " + formatado.format(funcionarios[i].getSalario())
                        + "\n Desconto: " + formatado.format(funcionarios[i].getBonusOuDesconto())
                        + "\n Salário Liquido: " + formatado.format(funcionarios[i].getSalarioLiquido()));
            }
        }
    }
}
