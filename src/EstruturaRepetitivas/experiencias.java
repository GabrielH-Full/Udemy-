package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char tipoDeCobai;
        int nCasos, qtdCobais, totalCobais = 0, totalR = 0,  totalC = 0, totalS = 0;
        double percentualR, percentualS, percentualC;

        System.out.println("Quantos casos de teste serao digitados? ");
        nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            System.out.println("Quantidade de Cobais: ");
            qtdCobais = sc.nextInt();

            System.out.println("Tipo de Cobais é (coelho, rato ou sapo): ");
            tipoDeCobai = sc.next().charAt(0);

            totalCobais += qtdCobais;

             switch (tipoDeCobai) {
                 case 'r': totalR += qtdCobais;
                     break;
                 case 's': totalS += qtdCobais;
                     break;
                 case 'c': totalC += qtdCobais;
                     break;

                     default:
                         System.out.println("Tipo inválido! Ignorado.");
                         totalCobais -= qtdCobais;;
             }
        }

        percentualC = (double) totalC / totalCobais * 100;
        percentualS = (double) totalS / totalCobais * 100;
        percentualR = (double) totalR / totalCobais * 100;

        System.out.println("total de cobais: " + totalCobais);
        System.out.println("Total de R: " + totalR);
        System.out.println("Percentual de R: " + percentualR);
        System.out.println("Total de S: " + totalS);
        System.out.println("Percentual de S: " + percentualS);
        System.out.println("Total de C: " + totalC);
        System.out.println("Percentual de C: " + percentualC);

        sc.close();
    }
}
