package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        while (true) {
            System.out.print("Digite um numero: ");
            n1 = sc.nextInt();

            System.out.print("Digite outro numero: ");
            n2 = sc.nextInt();
            if (n1 % n2 == 0) {
                break;
            }
            else {
                System.out.println("Nao sao multiplos");
            }
        }
        System.out.print("Sao multiplos");

        sc.close();
    }
}
