package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class mediaDeNota2
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nota1, nota2;
        double soma, media;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextInt();

        while (nota1 < 0 || nota1 > 10)
        {
            System.out.print("Valor invalido! Tente novamente: ");
            nota1=sc.nextInt();
        }

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextInt();

        while (nota2 < 0 || nota2 > 10)
        {
            System.out.print("Valor invalido! Tente novamente: ");
            nota2=sc.nextInt();
        }

        soma = nota1 + nota2;
        media = soma / 2;

        if (media < 6)
        {
            System.out.printf("Reprovado sua nota final = %.1f esta abaixo da media 6", media);
        }
        else
        {
            System.out.println("Nota Final: " + media);
        }

        sc.close();
    }
}
