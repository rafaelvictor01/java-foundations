package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex04 {
    public static void main(String[] args) {
        float employeeSalary;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário bruto do colaborador (R$): ");
        employeeSalary = (float)sc.nextFloat();

        sc.close();

        System.out.println("=======================================");
        System.out.println("O salário líquido deste colaborador será: " + ((employeeSalary * 1.1) * 0.95));
    }
}
