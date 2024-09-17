import java.util.Scanner;

public class NumeroFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um número para fatoriar: ");
        int numeroParaFatoriar = input.nextInt();

        int resultadoFatorial = 1;

        for (int i = 1; i <= numeroParaFatoriar; i++) {
            resultadoFatorial *= i;
        }
        System.out.println("O fatorial de " + numeroParaFatoriar + " é " + resultadoFatorial);
    }
}