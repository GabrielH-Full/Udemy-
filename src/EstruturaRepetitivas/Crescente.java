package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numero: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n1 != n2) {
            if (n1 > n2) {
                System.out.printf("Decrescente\n");
            }
            else {
                System.out.printf("Crescente\n");
            }

            System.out.println("Digite dois numero: ");
                n1 = sc.nextInt();
                n2 = sc.nextInt();
        }
        System.out.printf("Valor Igual");
        sc.close();
    }
}
