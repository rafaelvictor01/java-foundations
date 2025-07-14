package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do cômodo (em metros): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do cômodo (em metros): ");
        double largura = scanner.nextDouble();

        scanner.close();

        double area = comprimento * largura;
        double potenciaNecessaria = area * 18;

        System.out.println("\nÁrea do cômodo: " + area + " m²");
        System.out.println("Potência de iluminação necessária: " + potenciaNecessaria + " W");
    }
}
