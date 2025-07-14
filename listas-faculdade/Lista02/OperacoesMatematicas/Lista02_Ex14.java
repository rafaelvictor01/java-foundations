package Lista02.OperacoesMatematicas;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Lista02_Ex14 {
    public static void main(String[] args) {
        float AUX_PI = (float) 3.1416;
        float radius, circleArea;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do raio da circunferência: ");
        radius = scan.nextFloat();

        scan.close();

        circleArea = (float)(pow(radius, 2) * AUX_PI);

        System.out.println("\n========================\n");

        System.out.print("A area da circunferência é: " + circleArea + " unidades de medida");
    }
}
