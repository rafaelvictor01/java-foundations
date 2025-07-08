package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex02 {
    public static void main(String[] args) {
        float firstInput, secondInput, thirdInput;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        firstInput = (float)sc.nextFloat();

        System.out.print("Informe o segundo número: ");
        secondInput = (float)sc.nextFloat();

        System.out.print("Informe o terceiro número: ");
        thirdInput = (float)sc.nextFloat();

        sc.close();

        System.out.println("=======================================");
        System.out.println("O resultado da operação proposta é: " + (firstInput + secondInput) / thirdInput);
    }
}
