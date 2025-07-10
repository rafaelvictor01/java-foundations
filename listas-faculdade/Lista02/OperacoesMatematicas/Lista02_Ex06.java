package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex06 {
    public static void main(String[] args) {
        float firstLength, secondLength;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da base do retângulo: ");
        firstLength = sc.nextFloat();

        System.out.print("Informe o valor do lado do retângulo: ");
        secondLength = sc.nextFloat();

        sc.close();

        System.out.print("\n=====================================\n");
        System.out.println("O valor da área do retângulo é: " + firstLength * secondLength);
        System.out.println("O valor do perímetro do retângulo é: " + ((firstLength * 2) + (secondLength * 2)));
    }
}
