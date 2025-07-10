package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex08 {
    public static void main(String[] args) {
        int numOfSides;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de lados que o polígono (convexo regular) possui: ");
        numOfSides = scan.nextInt();

        scan.close();

        System.out.println("=================================\n");
        System.out.println("O número de diagonais que este polígono convexo regular possui é: " + ((numOfSides * (numOfSides - 3)/2)));
    }
}
