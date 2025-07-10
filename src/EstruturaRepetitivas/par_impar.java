package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, x;

        System.out.print("Quantos numeros voce vai digitar: ");
        n = sc.nextInt();

       /* for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x < 0 && x % 2 == 0) {
                System.out.print("PAR NEGATIVO\n");
            }
            else if (x > 0 && x % 2 == 0) {
                System.out.print("PAR POSITIVO\n");
            }
            else if (x < 0) {
                System.out.print("IMPAR NEGATIVO\n");
            }
            else if (x > 0){
                System.out.print("IMPAR POSITIVO\n");
            }
            else {
                System.out.print("NULO\n");
            } */



        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x == 0){
                System.out.print("NULO");
            }
            else {
                if (x > 0) {
                    System.out.print("Positivo ");
                }
                else {
                    System.out.print("Negativo ");
                }
            }

            if (x % 2 == 0){
                System.out.println("PAR");
            }
            else {
                System.out.println("IMPAR");
            }
        }



        sc.close();
    }
}
