package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, fatorial = 1;

        System.out.print("Valor de N: ");
        n = sc.nextInt();
        System.out.printf("Fatorial de %d é: ", n);

        for (int i = 1; i <= n; n--) {
            fatorial *= n;
        }
        System.out.printf("%d", fatorial);

        sc.close();
    }
}
