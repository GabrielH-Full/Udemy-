package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nLinhas, nColunas;
        int soma;
        System.out.println("Qual a quantidade de linhas?");
        nLinhas = sc.nextInt();
        System.out.println("Qual a quantidade de colunas?");
        nColunas = sc.nextInt();

        double [][] matriz = new double[nLinhas][nColunas];
        double[] vetor = new double[nLinhas];

        for (int i = 0; i < nLinhas; i++) {
                System.out.printf("Digite  os %d elementos da linha %d°:%n ", nColunas, i + 1);

                for (int j = 0; j < nColunas; j++) {
                    matriz[i][j] = sc.nextInt();
                }
        }

        for (int i = 0; i < nLinhas; i++) {
            soma = 0;
            for (int j = 0; j < nColunas; j++) {
                soma += matriz[i][j];
            }
            vetor[i] = soma;
        }

        System.out.println("VETOR GERADO:");

        for (int i = 0; i < nLinhas; i++) {
            System.out.printf("%.1f\n", vetor[i]);
        }

        sc.close();
    }
}
