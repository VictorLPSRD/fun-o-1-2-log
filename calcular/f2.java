package calcular;

import java.util.Scanner;

public class f2 {
    public static void funcao2() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Vamos começar");

        System.out.print("Valor de A:");
        float a = scanner.nextFloat();  // Usando nextFloat para capturar um número decimal

        System.out.print("Valor de B:");
        float b = scanner.nextFloat();  

        System.out.print("Valor de C:");
        float c = scanner.nextFloat();    

        if (a == 0) {
            System.out.print("O coeficiente 'a' deve ser diferente de zero para ser uma equação do segundo grau.");
        } else {
            float delta = (float) (Math.pow(b, 2) - 4 * a * c);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));                                             
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

                System.out.println("As raízes são:");
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
                System.out.println("delta: " + delta +"\n");
            }
        }
    }
}
