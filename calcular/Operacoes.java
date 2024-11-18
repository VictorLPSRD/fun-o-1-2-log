package calcular;

import java.util.Scanner; 

public class Operacoes {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
        System.out.println("Escolha uma opção:");
        System.out.println("1 : Função 1");
        System.out.println("2 : Função 2");
        System.out.println("3 : Logaritmo");
        System.out.println("4 : Sair\n");

        System.out.print("Opção:");
        int escolha = scanner.nextInt();
        limpar.limparTerminal();

        if (escolha == 1) {
            System.out.println("Você escolheu Função 1.");
            f1.funcao1();
           

        } else if (escolha == 2) {
            System.out.println("Você escolheu Função 2.");
            f2.funcao2();
   
            
        } else if (escolha == 3) {
            System.out.println("Você escolheu Logaritmo.");
            f3.loga(args);
            

        } else {
            System.out.println("Opção inválida.");
            
        }
    
    }
    
    }
}