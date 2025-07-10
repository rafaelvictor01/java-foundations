package Lista02.OperacoesMatematicas;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Lista02_Ex09 {
    public static void main(String[] args) {
        float depositAmount, interestRate, applicationTime;
        double auxPrinterResult;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe quanto de dinheiro será aplicado (R$): ");
        depositAmount = scan.nextFloat();

        System.out.print("Informe por quanto tempo o dinheiro ficará aplicado (em anos): ");
        applicationTime = scan.nextFloat();

        System.out.print("Informe a taxa de juros mensal deste produto (%): ");
        interestRate = scan.nextFloat();

        scan.close();

        auxPrinterResult = depositAmount * (pow((1 + (interestRate / 100)), (applicationTime * 12)));

        System.out.println("\n============================");
        System.out.print("Ao final do período previsto o montante será de: R$ " + auxPrinterResult);
    }
}
