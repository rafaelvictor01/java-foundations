package Desafio01.OsTresNinjas;

import java.util.Scanner;

public class OsTresNinjas {
    public static void main(String[] args) {
        String nameNinja1, nameNinja2, nameNinja3;
        int ageNinja1, ageNinja2, ageNinja3;

        String missionNameNinja1, missionNameNinja2, missionNameNinja3;
        String missionLevelNinja1, missionLevelNinja2, missionLevelNinja3;
        boolean missionIsCompletedNinja1 = false, missionIsCompletedNinja2 = false, missionIsCompletedNinja3 = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos cadastrar o primeiro ninja! \n");

        System.out.print("Informe o nome do primeiro ninja: ");
        nameNinja1 = sc.nextLine();

        System.out.print("Informe a idade do primeiro ninja: ");
        ageNinja1 = (int) sc.nextInt();

        System.out.println("\nAgora, me informe sobre a missão deste ninja.");
        System.out.print("Qual o nome da missão? ");
        missionNameNinja1 = sc.nextLine();
        sc.nextLine();

        System.out.print("Seria uma missão de nível A, B, C ou D? ");
        missionLevelNinja1 = sc.nextLine();

        if (ageNinja1 < 15 && (missionLevelNinja1.equalsIgnoreCase("A")  || missionLevelNinja1.equalsIgnoreCase("B")))
        {
            System.out.println("Parece que o ninja 1 é jovem demais para esta missão");
        }
        else {
            missionIsCompletedNinja1 = true;
        }

        System.out.println("\n ================================ \n");

        System.out.println("Vamos cadastrar o segundo ninja!");

        System.out.print("\nInforme o nome do segundo ninja: ");
        nameNinja2 = sc.nextLine();

        System.out.print("Informe a idade do segundo ninja: ");
        ageNinja2 = (int) sc.nextInt();

        System.out.println("\nAgora, me informe sobre a missão deste ninja.");
        System.out.print("Qual o nome da missão? ");
        missionNameNinja2 = sc.nextLine();
        sc.nextLine();

        System.out.print("Seria uma missão de nível A, B, C ou D? ");
        missionLevelNinja2 = sc.nextLine();

        if (ageNinja2 < 15 && (missionLevelNinja2.equalsIgnoreCase("A")  || missionLevelNinja2.equalsIgnoreCase("B")))
        {
            System.out.println("Parece que o ninja 2 é jovem demais para esta missão");
        }
        else {
            missionIsCompletedNinja2 = true;
        }

        System.out.println("\n ================================ \n");

        System.out.println("Vamos cadastrar o terceiro ninja!");

        System.out.print("\nInforme o nome do terceiro ninja: ");
        nameNinja3 = sc.nextLine();

        System.out.print("Informe a idade do terceiro ninja: ");
        ageNinja3 = (int) sc.nextInt();

        System.out.println("\nAgora, me informe sobre a missão deste ninja.");
        System.out.print("Qual o nome da missão? ");
        missionNameNinja3 = sc.nextLine();
        sc.nextLine();

        System.out.print("Seria uma missão de nível A, B, C ou D? ");
        missionLevelNinja3 = sc.nextLine();

        if (ageNinja3 < 15 && (missionLevelNinja3.equalsIgnoreCase("A")  || missionLevelNinja3.equalsIgnoreCase("B")))
        {
            System.out.println("Parece que o ninja 3 é jovem demais para esta missão");
        }
        else {
            missionIsCompletedNinja3 = true;
        }

        sc.close();

        System.out.println("\n ================================ \n");
        System.out.println("Então vamos compilar tudo isso!");
        System.out.println("\n ================================ \n");

        System.out.println("O ninja 1 se chama: " + nameNinja1);
        System.out.println("Ele possui " + ageNinja1 + " anos de idade");
        System.out.println("E ele esta fazendo a missão: " + missionNameNinja1);
        System.out.println("Essa é uma missão de nível: " + missionLevelNinja1);
        System.out.println("E vamos considera-la: " + (missionIsCompletedNinja1 ? "Completa" : "Incompleta"));

        System.out.println("\n ================================ \n");

        System.out.println("O ninja 2 se chama: " + nameNinja2);
        System.out.println("Ele possui " + ageNinja2 + " anos de idade");
        System.out.println("E ele esta fazendo a missão: " + missionNameNinja2);
        System.out.println("Essa é uma missão de nível: " + missionLevelNinja2);
        System.out.println("E vamos considera-la: " + (missionIsCompletedNinja2 ? "Completa" : "Incompleta"));

        System.out.println("\n ================================ \n");

        System.out.println("O ninja 3 se chama: " + nameNinja3);
        System.out.println("Ele possui " + ageNinja3 + " anos de idade");
        System.out.println("E ele esta fazendo a missão: " + missionNameNinja3);
        System.out.println("Essa é uma missão de nível: " + missionLevelNinja3);
        System.out.println("E vamos considera-la: " + (missionIsCompletedNinja3 ? "Completa" : "Incompleta"));
    }
}
