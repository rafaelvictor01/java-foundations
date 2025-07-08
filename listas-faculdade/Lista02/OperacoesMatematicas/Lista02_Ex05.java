package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex05 {
    public static void main(String[] args) {
        float employeeSalary, totalSalesValue;
        float myResult;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do salário fixo do colaborador (R$): ");
        employeeSalary = (float)sc.nextFloat();

        System.out.print("Informe o valor total das vendas realizadas por este vendedor (R$): ");
        totalSalesValue = (float)sc.nextFloat();

        sc.close();

        myResult = (float)((totalSalesValue * 0.04) + employeeSalary);

        System.out.println("=======================================");
        System.out.println("O salário líquido deste colaborador será: " + myResult);
    }
}
