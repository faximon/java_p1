import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolhaMenu = 0;
        String menu = """
                               
                Digite opção que deseja acessar:
                1. Calcular área do QUADRADO
                2. Calcular área do CÍRCULO
                3. Finalizar
                """;

        while (escolhaMenu != 3) {
            System.out.print(menu);
            escolhaMenu = input.nextInt();

            if (escolhaMenu == 1) {
                System.out.print("""
                        Você escolheu calcular a área do quadrado.
                        Informe o comprimento de um dos lados do quadrado: """);
                double lado = input.nextInt();
                double areaQuadrado = lado * lado;
                System.out.printf("A área é de %.2f.", areaQuadrado);
                System.out.println();

            } else if (escolhaMenu == 2) {
                System.out.print("""
                        Você escolheu calcular a área do círculo.
                        Informe o raio do círculo: """);
                double raio = input.nextInt();
                double areaCirculo = Math.PI * raio * raio;
                System.out.printf("A área é de %.2f.", areaCirculo);
                System.out.println();

            } else if (escolhaMenu == 3) {
                System.out.println("Finalizando...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}