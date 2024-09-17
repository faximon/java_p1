import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2 = 0;

        System.out.println("Digite dois números inteiros que deseja comparar.");
        System.out.print("Número 1: ");
        numero1 = input.nextInt();
        System.out.print("Número 2: ");
        numero2 = input.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números digitados são iguais.");
        } else if (numero1 != numero2) {
            System.out.println("Os números digitados são diferentes.");
        }

        if (numero1 > numero2 && numero1 != numero2) {
            System.out.println("O primeiro número é maior!");
        } else if (numero1 < numero2 && numero1 != numero2) {
            System.out.println("O segundo número é maior!");
        }
    }
}