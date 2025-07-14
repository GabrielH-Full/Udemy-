package vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        Arrays.sort(vetor);

        System.out.println("NUMEROS NEGATIVOS:");
        for (int num : vetor) {
            if (num < 0) {
                System.out.printf("%d\n", num);
            }
        }
        System.out.print("NÃO TEM!");

        sc.close();
    }
}
