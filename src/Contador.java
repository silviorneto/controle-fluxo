import exceptions.ParametrosInvalidosException;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        boolean parametrosInvalidos = true;

        while(parametrosInvalidos) {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Adicione o primeiro número: ");
            int parametroUm = sc.nextInt();

            System.out.print("Adicione o segundo número: ");
            int parametroDois = sc.nextInt();

            try {
                contar(parametroUm, parametroDois);
                parametrosInvalidos = false;
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo número não pode ser menor que o primeiro");
            }

            if (!parametrosInvalidos) {
                sc.close();
            }
        }
    }

    public static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        }

        int maxIteracoes = param2 - param1;

        for (int i = 0; i < maxIteracoes; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
