package Lista02.OperacoesMatematicas;

import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Lista02_Ex11 {
    public static void main(String[] args) {
        double cateto1, cateto2, hypotenuse;
        double trianglePerimeter;

        float distanceToWalk;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o comprimento (em metros) da rua A: ");
        cateto1 = scan.nextFloat();

        System.out.print("Informe o comprimento (em metros) da rua B: ");
        cateto2 = scan.nextFloat();

        double auxCateto1 = pow(cateto1, 2);
        double auxCateto2 = pow(cateto2, 2);
        hypotenuse = sqrt((auxCateto1 + auxCateto2));

        System.out.println("Legal! então o comprimento (em metros) da rua C é: " + hypotenuse);

        System.out.print("Informe a distância (em metros) que Dona Maria deve percorrer: ");
        distanceToWalk = scan.nextFloat();

        scan.close();

        trianglePerimeter = cateto1 + cateto2 + hypotenuse;

        System.out.println("\n===============================");

        System.out.println("Então a Dona maria deve dar, no mínimo, " + ceil((distanceToWalk / trianglePerimeter)) + " voltas no quarteirão para bater sua meta");
    }
}
