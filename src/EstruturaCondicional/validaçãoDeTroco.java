package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class validaçãoDeTroco
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoProduto, dinheiroRecebido, troco;
        int qtndProduto;

        System.out.println("Qual e o valor do produto: ");
        precoProduto = sc.nextDouble();

        while (precoProduto < 0)
        {
            System.out.println("Valor incorreto, informe novamente:");
            precoProduto = sc.nextDouble();
        }

        System.out.println("Quantidade de produtos: ");
        qtndProduto = sc.nextInt();

        System.out.println("Dinheiro para pagar: ");
        dinheiroRecebido = sc.nextDouble();

        precoProduto *= qtndProduto;

        if (dinheiroRecebido < precoProduto) {
            troco = dinheiroRecebido - precoProduto;
            System.out.println("Dinheiro insuficiente para pagar, falta: " + troco);
        }
        else {
            troco = dinheiroRecebido - precoProduto;
            System.out.println("Troco: " + troco);
        }

        sc.close();
    }
}
