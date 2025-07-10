package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1;
        System.out.println("Digite um numero inteiro: ");
        n1 = sc.nextInt();

        while (n1 != 0) {
            int soma = 0;
            int proximo = n1 + 2;
            int contador = 0;

            while (contador < 5) {
                if ((n1 % 2) != 0) {
                    n1++;
                }
                else {
                    soma += proximo;
                    contador++;
                }
                proximo++;
            }
            System.out.printf("SOMA = %d\n", soma);
            System.out.print("Digite um numero inteiro: ");
            n1 = sc.nextInt();
        }
        sc.close();
    }
}

