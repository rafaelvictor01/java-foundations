package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex10 {
    public static void main(String[] args) {
        double percentagePenalty = 1.02;
        float salaryValue, expenseValue1, expenseValue2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do salário de João (R$): ");
        salaryValue = scan.nextFloat();

        System.out.print("Informe o valor da conta 1 (R$): ");
        expenseValue1 = scan.nextFloat();

        System.out.print("Informe o valor da conta 2 (R$): ");
        expenseValue2 = scan.nextFloat();

        scan.close();

        expenseValue1 = (float)(expenseValue1 * percentagePenalty);
        expenseValue2 = (float)(expenseValue2 * percentagePenalty);

        System.out.println("\n=======================");
        System.out.println("O valor da conta 1 com juros passou para: R$" + expenseValue1);
        System.out.println("O valor da conta 2 com juros passou para: R$" + expenseValue2);
        System.out.println("O valor que restará do salário de João é: R$" + (salaryValue - (expenseValue1 + expenseValue2)));
    }
}
