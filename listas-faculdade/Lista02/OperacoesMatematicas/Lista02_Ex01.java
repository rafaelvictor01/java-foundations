package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex01 {
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
        System.out.println("A soma entre estes números é: " + (firstInput + secondInput + thirdInput));
        System.out.println("A média entre estes números é: " + (firstInput + secondInput + thirdInput) / 3);
    }
}
