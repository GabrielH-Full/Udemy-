package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas serao digitados? ");
        double alturaMedia = 0, somaAltura = 0, somaIdade = 0, porcentagemIdade = 0;
        int n = sc.nextInt();

        String[] vectorNome = new String[n];
        int [] idades = new int[n];
        double [] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %d° pessoa: \n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            vectorNome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        for (double num : alturas) {
            somaAltura += num;
            alturaMedia = somaAltura / n;
        }
        System.out.println("Altura Media: " + alturaMedia);

        for (double num : idades) {
            if (num < 16) {
                somaIdade += num;
                porcentagemIdade = somaIdade / n * 100;
            }
        }
        System.out.printf("Pessoas com menos de 16 anos: %.1f%" + porcentagemIdade);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(vectorNome[i]);
            }
        }
        sc.close();
    }
}