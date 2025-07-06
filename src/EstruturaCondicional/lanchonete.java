package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double qtdPagar;
        int codigoProduto, qtdProduto;


        while (true) {
            System.out.print("Digite o código do produto: ");
            codigoProduto = sc.nextInt();

            // Verifica se o código é válido
            if (codigoProduto == 1 || codigoProduto == 2 || codigoProduto == 3) {
                break; // Sai do loop se o código for válido
            } else {
                System.out.println("Código inválido. Tente novamente.");
            }
        }

        System.out.print("Quantidade do produto comprado: ");
        qtdProduto = sc.nextInt();


        switch (codigoProduto) {
            case 1:
                qtdPagar = qtdProduto * 5.00;
                System.out.printf("Valor a pagar: R$ %.2f\n", qtdPagar);
                break;
            case 2:
                qtdPagar = qtdProduto * 3.50;
                System.out.printf("Valor a pagar: R$ %.2f\n", qtdPagar);
                break;
            case 3:
                qtdPagar = qtdProduto * 4.80;
                System.out.printf("Valor a pagar: R$ %.2f\n", qtdPagar);
                break;
        }

        sc.close();
    }
}
