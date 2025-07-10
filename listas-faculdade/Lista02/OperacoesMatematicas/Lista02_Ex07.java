package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex07 {
    public static void main(String[] args) {
        float longestBaseLength, shorterBaseLength, heightLength, averagePrice;
        float auxResultPrinter;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da base maior do trapézio (m): ");
        longestBaseLength = sc.nextFloat();

        System.out.print("Informe o valor da base menor do trapézio (m): ");
        shorterBaseLength = sc.nextFloat();

        System.out.print("Informe o valor da altura do trapézio (m): ");
        heightLength = sc.nextFloat();

        System.out.print("Informe o valor do preço médio por metro quadrado (R$): ");
        averagePrice = sc.nextFloat();

        sc.close();

        auxResultPrinter = ((longestBaseLength + shorterBaseLength) * heightLength) / 2;

        System.out.print("\n=====================================\n");
        System.out.println("A área total do terreno é: " + auxResultPrinter);
        System.out.println("O valor médio de venda deste terreno é: R$ " + auxResultPrinter * averagePrice);
    }
}
