
package calcular;
import java.util.Scanner; 

public class f1 {
    public static void funcao1() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor de A:");
        Float a = scanner.nextFloat();  // Alterado para nextFloat()
        
        System.out.println("Valor de B:");
        Float b = scanner.nextFloat();  // Alterado para nextFloat()
        
        System.out.println("Valor de X:");
        Float x = scanner.nextFloat();  // Alterado para nextFloat()
        
        Float resultado = a * x + b;
        
        System.out.println("O valor de f(" + x + ") = " + resultado +"\n");
    }


}
