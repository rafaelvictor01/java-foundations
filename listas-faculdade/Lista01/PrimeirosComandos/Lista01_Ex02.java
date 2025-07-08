package Lista01.PrimeirosComandos;

import java.util.Scanner;

public class Lista01_Ex02 {
    public static void main(String[] args) {
        float firstInput, secondInput;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        firstInput = (float)sc.nextFloat();

        System.out.print("Informe o segundo número: ");
        secondInput = (float)sc.nextFloat();

        sc.close();

        System.out.println("=======================================");
        System.out.println("A soma entre estes números é: " + (firstInput + secondInput));
        System.out.println("A subtração entre estes números é: " + (firstInput - secondInput));
        System.out.println("A multiplicação entre estes números é: " + (firstInput * secondInput));
        System.out.println("A divisão entre estes números é: " + (firstInput / secondInput));
    }
}
