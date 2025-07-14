package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex12 {
    public static void main(String[] args) {
        final int ANO_PRIMEIRA_COPA = 1930;
        final int INTERVALO_COPA = 4;
        final int COPAS_CANCELADAS = 2; // 1942 e 1946

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        scanner.close();

        if (anoAtual < ANO_PRIMEIRA_COPA) {
            System.out.println("O ano informado é anterior à primeira Copa do Mundo.");
        } else {
            int totalCopas = ((anoAtual - ANO_PRIMEIRA_COPA) / INTERVALO_COPA) + 1;
            
            if (anoAtual >= 1950) {
                totalCopas -= COPAS_CANCELADAS;
            } else if (anoAtual >= 1946) {
                totalCopas -= 1;
            }

            System.out.println("Número de Copas do Mundo já realizadas até " + anoAtual + ": " + totalCopas);
        }
    }
}
