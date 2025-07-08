package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2312) {
            System.out.printf("Senha incorreta! Tente novamente:");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
