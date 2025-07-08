package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex03 {
    public static void main(String[] args) {
        float firstInput, secondInput, thirdInput;
        float firstWeight, secondWeight, thirdWeight;
        float myResult;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        firstInput = (float)sc.nextFloat();

        System.out.print("Informe o peso do primeiro número: ");
        firstWeight = (float)sc.nextFloat();

        System.out.print("Informe o segundo número: ");
        secondInput = (float)sc.nextFloat();

        System.out.print("Informe o peso do segundo número: ");
        secondWeight = (float)sc.nextFloat();

        System.out.print("Informe o terceiro número: ");
        thirdInput = (float)sc.nextFloat();

        System.out.print("Informe o peso do terceiro número: ");
        thirdWeight = (float)sc.nextFloat();

        sc.close();

        myResult = ((firstInput * firstWeight) + (secondInput * secondWeight) + (thirdInput * thirdWeight)) / 3;

        System.out.println("=======================================");
        System.out.println("A média ponderada dos valores informados é: " + myResult);
    }
}
