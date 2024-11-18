package calcular;

import java.util.Scanner;

public class f3 {
    public static void loga(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de x: ");
        double x = scanner.nextDouble();  // Usando double para compatibilidade com Math.log()

        if (x <= 0) {
            System.out.println("O valor de x deve ser maior que zero.");
            return;
        }

        System.out.print("Valor da base: ");
        double base = scanner.nextDouble();  // Usando double para compatibilidade com Math.log()

        if (base <= 0 || base == 1) {
            System.out.println("A base deve ser maior que zero e diferente de 1.");
            return;
        }

        double logNatural = Math.log(x);  // Logaritmo natural (base e)
        System.out.println("Logaritmo natural de " + x + ": " + logNatural);

        double logBase10 = Math.log(x) / Math.log(base);  // Logaritmo na base 'base'
        System.out.println("Logaritmo de " + x + " na base " + base + ": " + logBase10 +"\n");
    }

    public static void loga() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loga'");
    }
}
