import java.util.Scanner;

import static java.lang.System.in;

public class CapturingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        String initialMessage = """
                 Capturando entrada do usuário
                 ______________________________
                 Nome completo: %s
                 Idade: %d
                 Salário: %.2f
                """;
        System.out.println("Digite seu nome completo: ");
        String fullName = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        System.out.println("Digite seu salário: ");
        double salary = sc.nextDouble();

        System.out.printf(initialMessage, fullName, age, salary);
        sc.close();
    }
}
