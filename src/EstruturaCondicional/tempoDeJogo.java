package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class tempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hrIncial, hrFinal;

        System.out.print("Hora inicial: ");
        hrIncial = sc.nextInt();
        System.out.print("Hora final: ");
        hrFinal = sc.nextInt();

        if (hrIncial > hrFinal)
        {
            System.out.printf("O jogo durou: %d HORA(S)", hrIncial - hrFinal);
        }
        else{
            System.out.printf("O jogo durou: %d HORA(S)", 24 - (hrIncial - hrFinal));
        }

        sc.close();
    }
}
