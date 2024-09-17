import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para retornar a sua tabuada: ");
        int numero = input.nextInt();
        int resultadoTabuada = numero;

        for (int i = 1; i <= 10; i++) {
            resultadoTabuada = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i , resultadoTabuada);
        }
    }
}