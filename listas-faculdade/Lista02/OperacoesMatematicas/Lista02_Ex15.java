package Lista02.OperacoesMatematicas;

import java.util.Scanner;

public class Lista02_Ex15 {
    public static void main(String[] args) {
        int allMinutes, completedHours;
        float completedMinutes;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe uma quantidade de minutos: ");
        allMinutes = scan.nextInt();

        completedHours = (int) allMinutes / 60;
        completedMinutes = allMinutes % 60;

        System.out.println(allMinutes + " minutos correspondem a " + completedHours + " horas e " + completedMinutes + " minutos");
    }
}
