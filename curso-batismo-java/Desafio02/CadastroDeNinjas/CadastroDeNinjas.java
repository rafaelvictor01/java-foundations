package Desafio02.CadastroDeNinjas;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        int MAX_LIST_SIZE = 3;

        boolean programIsRunning = true;
        int userInput, indexController = 0;

        String[] ninjas = new String[MAX_LIST_SIZE];
        String newNinja;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nOlá! Seja bem-vindo ao cadastro de ninjas da vila da folha!\n");

        while (programIsRunning) {
            System.out.println("Me diga, o que você prefere fazer neste momento?");
            System.out.println("1 - Cadastrar um novo ninja");
            System.out.println("2 - Ver os ninjas cadastrados");
            System.out.println("3 - Sair");

            System.out.print("> ");
            userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                    if (indexController > MAX_LIST_SIZE - 1) {
                        System.out.println("\nOps! A lista de ninjas já está cheia!");
                        programIsRunning = false;
                        break;
                    }

                    scan.nextLine(); // Necessário para evitar bug com buffer

                    System.out.println("\nLegal! Qual o nome do ninja que você deseja cadastrar?");
                    System.out.print("> ");
                    newNinja = scan.nextLine();

                    ninjas[indexController] = newNinja;
                    indexController++;

                    System.out.println("\n" + newNinja + " Cadastrado com sucesso!\n");

                    newNinja = "";
                    break;
                case 2:
                    if (indexController <= 0) {
                        System.out.println("\nOps! não temos ninjas cadastrados ainda\n");
                    } else {
                        System.out.println("\nLegal! Os ninjas ja cadastrados são: \n");

                        for (int i = 0; i < ninjas.length; i++) {
                            if ((ninjas[i] != null) && !ninjas[i].isEmpty())
                                System.out.println(i + " - " + ninjas[i]);
                        }

                        System.out.println(" ");
                    }

                    break;
                case 3:
                    System.out.println("\nCerto! Até logo então\n");
                    programIsRunning = false;
                    break;
                default:
                    System.out.println("\nOps! Opção inválida\n");
                    break;
            }
        }

        scan.close();
    }
}
