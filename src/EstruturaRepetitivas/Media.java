package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, x,  soma = 0;
        double media;

        System.out.print("Quantos numeros voce vai digitar: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();
            soma += x;
        }
            media = (double) soma / n;
            System.out.printf("MEDIA = %.1f\n", media);

        sc.close();
    }
}
